package com.money.store.openplatform.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.money.store.mapper.UmsCompanyDevMapper;
import com.money.store.mapper.UmsPersonDevMapper;
import com.money.store.mapper.UmsUserLoginLogMapper;
import com.money.store.mapper.UmsUserMapper;
import com.money.store.model.*;
import com.money.store.openplatform.pojo.UmsUserDetail;
import com.money.store.openplatform.dto.UpdateProfileParam;
import com.money.store.openplatform.dto.UpdateUserPasswordParam;
import com.money.store.common.service.RedisService;
import com.money.store.openplatform.service.UmsUserCacheService;
import com.money.store.openplatform.service.UmsUserService;
import com.money.store.common.utils.ip.AddressUtils;
import com.money.store.common.utils.ip.IpUtils;
import com.money.store.security.util.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * @program: store
 * @description: 开发者管理Service实现类
 * @author: Money
 * @create: 2020/03/01 15:37
 */
@Service
public class UmsUserServiceImpl implements UmsUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UmsUserServiceImpl.class);
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UmsUserMapper umsUserMapper;
    @Autowired
    private UmsPersonDevMapper personDevMapper;
    @Autowired
    private UmsCompanyDevMapper companyDevMapper;
    @Autowired
    private UmsUserLoginLogMapper loginLogMapper;
    @Autowired
    private RedisService redisService;
    @Autowired
    private UmsUserCacheService userCacheService;

    @Override
    public UmsUser getUserByUsername(String username) {
        UmsUser umsUser = userCacheService.getUser(username);
        if (umsUser != null) {
            return umsUser;
        }
        QueryWrapper<UmsUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        List<UmsUser> userList = umsUserMapper.selectList(queryWrapper);
        if (userList != null && userList.size() > 0) {
            userCacheService.setUser(userList.get(0));
            return userList.get(0);
        }
        return null;
    }

    @Override
    public UmsUser getUserByEmail(String email) {
        QueryWrapper<UmsUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("email", email);
        List<UmsUser> userList = umsUserMapper.selectList(queryWrapper);
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
            insertLoginLog(username);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }
    /**
     * 添加登录记录
     * @param username 用户名
     */
    private void insertLoginLog(String username) {
        UmsUser umsUser = getUserByUsername(username);
        if(umsUser==null) { return;};
        UmsUserLoginLog loginLog = new UmsUserLoginLog();
        loginLog.setUserId(umsUser.getId());
        loginLog.setCreateTime(LocalDateTime.now());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = null;
        request = attributes.getRequest();
        // 使用了反向代理，得使用工具获取客户端真正的ip
        String realIp = IpUtils.getIpAddr(request);
        loginLog.setIp(realIp);
        String realAddressByIP = AddressUtils.getRealAddressByIP(realIp);
        loginLog.setAddress(realAddressByIP);
        loginLogMapper.insert(loginLog);
    }

    @Override
    public UmsPersonDev getPersonDevProFile(String username) {
        UmsUser umsUser = getUserByUsername(username);
        umsUser.setPassword("");
        QueryWrapper<UmsPersonDev> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", umsUser.getId());
        List<UmsPersonDev> devList = personDevMapper.selectList(queryWrapper);
        if (!CollectionUtil.isEmpty(devList)) {
            UmsPersonDev umsPersonDev = devList.get(0);
            Optional<String> idCardOpt = Optional.ofNullable(umsPersonDev.getIdCard());
            String idCard = idCardOpt.orElse("");
            umsPersonDev.setIdCard(
                    idCard.replaceAll("(\\d{4})\\d{10}(\\w{4})", "$1****$2"));
            Optional<String> bankCardNumberOpt = Optional.ofNullable(umsPersonDev.getBankCardNumber());
            String bankCardNumber = bankCardNumberOpt.orElse("");
            umsPersonDev.setBankCardNumber(
                    bankCardNumber.replaceAll("(\\d{3})\\d{9,12}(\\d{4})", "$1******$2"));
            return umsPersonDev;
        }
        return null;
    }

    @Override
    public UmsCompanyDev getCompanyDevProFile(String username) {
        UmsUser umsUser = getUserByUsername(username);
        umsUser.setPassword("");
        QueryWrapper<UmsCompanyDev> queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_id", umsUser.getId());
        List<UmsCompanyDev> devList = companyDevMapper.selectList(queryWrapper);
        if (!CollectionUtil.isEmpty(devList)) {
            UmsCompanyDev companyDev = devList.get(0);
            Optional<String> numOpt = Optional.ofNullable(companyDev.getBusinessLicenseRegNumber());
            String businessLicenseRegNumber = numOpt.orElse("");
            companyDev.setBusinessLicenseRegNumber(
                    businessLicenseRegNumber.replaceAll("(\\d{4})\\d{10}(\\w{4})", "$1****$2"));
            Optional<String> bankCardNumberOpt = Optional.ofNullable(companyDev.getBankCardNumber());
            String bankCardNumber = bankCardNumberOpt.orElse("");
            companyDev.setBankCardNumber(
                    bankCardNumber.replaceAll("(\\d{3})\\d{9,12}(\\d{4})", "$1******$2"));
            return companyDev;
        }
        return null;
    }

    @Override
    public List<UmsUserLoginLog> getLoginLog(String username) {
        UmsUser umsUser = getUserByUsername(username);
        if(umsUser==null) { return null;}
        QueryWrapper<UmsUserLoginLog> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", umsUser.getId());
        queryWrapper.orderByDesc("create_time");
        return loginLogMapper.selectList(queryWrapper);
    }

    @Override
    public int update(UpdateProfileParam param) {
        UmsUser umsUser = new UmsUser();
        BeanUtil.copyProperties(param, umsUser);
        QueryWrapper<UmsUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", umsUser.getUsername());
        int count = umsUserMapper.update(umsUser, queryWrapper);
        userCacheService.delUser(umsUser.getUsername());
        return count;
    }

    @Override
    public int updatePassword(UpdateUserPasswordParam param) {
        if(StrUtil.isEmpty(param.getUsername())
                ||StrUtil.isEmpty(param.getOldPassword())
                ||StrUtil.isEmpty(param.getNewPassword())){
            return -1;
        }
        QueryWrapper<UmsUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", param.getUsername());
        List<UmsUser> umsUserList = umsUserMapper.selectList(queryWrapper);
        if (CollectionUtil.isEmpty(umsUserList)) {
            return -2;
        }
        UmsUser umsUser = umsUserList.get(0);
        if(!passwordEncoder.matches(param.getOldPassword(), umsUser.getPassword())) {
            return -3;
        }
        // 新密码和原密码一样，没必要改
        if(passwordEncoder.matches(param.getNewPassword(), umsUser.getPassword())) {
            return 1;
        }
        umsUser.setPassword(passwordEncoder.encode(param.getNewPassword()));
        umsUserMapper.update(umsUser, queryWrapper);
        userCacheService.delUser(umsUser.getUsername());
        return 1;
    }

    @Override
    public int updateAvatar(String username, String newIcon) {
        QueryWrapper<UmsUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        UmsUser umsUser = new UmsUser();
        umsUser.setIcon(newIcon);
        int count = umsUserMapper.update(umsUser, queryWrapper);
        userCacheService.delUser(umsUser.getUsername());
        return count;
    }

    @Override
    public int updateEmail(String email, String username, String password) {
        UmsUser umsUser = getUserByUsername(username);
        if (umsUser.getEmail().equals(email)) {
            return 1;
        }
        if (passwordEncoder.matches(password, umsUser.getPassword())) {
            QueryWrapper<UmsUser> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("username", umsUser.getUsername());
            umsUser.setEmail(email);
            umsUser.setActivation(0);
            int count = umsUserMapper.update(umsUser, queryWrapper);
            userCacheService.delUser(umsUser.getUsername());
            return count;
        } else {
            return -2;
        }
    }

    @Override
    public String refreshToken(String oldToken) {
        return jwtTokenUtil.refreshToken(oldToken);
    }

    @Override
    public String generateAuth(String key, String value, int expireTime) {
        redisService.set(key, value);
        redisService.expire(key, expireTime);
        return key;
    }

    @Override
    public String getAuthValue(String key) {
        if (StrUtil.isBlank(key)) {
            return null;
        }
        String realValue = (String)redisService.get(key);
        if (StrUtil.isNotBlank(realValue)) {
            return realValue;
        } else {
            return null;
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        UmsUser user = getUserByUsername(username);
        if(user!=null){
            return new UmsUserDetail(user);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

}
