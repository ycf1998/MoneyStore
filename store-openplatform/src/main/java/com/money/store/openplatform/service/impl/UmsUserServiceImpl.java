package com.money.store.openplatform.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.money.store.mapper.UmsCompanyDevMapper;
import com.money.store.mapper.UmsPersonDevMapper;
import com.money.store.mapper.UmsUserLoginLogMapper;
import com.money.store.mapper.UmsUserMapper;
import com.money.store.model.*;
import com.money.store.openplatform.domain.UmsUserDetail;
import com.money.store.openplatform.dto.UpdateProfileParam;
import com.money.store.openplatform.dto.UpdateUserPasswordParam;
import com.money.store.openplatform.service.RedisService;
import com.money.store.openplatform.service.UmsUserCacheService;
import com.money.store.openplatform.service.UmsUserService;
import com.money.store.openplatform.util.ip.AddressUtils;
import com.money.store.openplatform.util.ip.IpUtils;
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
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
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
        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsUser> userList = umsUserMapper.selectByExample(example);
        if (userList != null && userList.size() > 0) {
            userCacheService.setUser(userList.get(0));
            return userList.get(0);
        }
        return null;
    }

    @Override
    public UmsUser getUserByEmail(String email) {
        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andEmailEqualTo(email);
        List<UmsUser> userList = umsUserMapper.selectByExample(example);
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
        loginLog.setCreateTime(new Date());
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
        UmsPersonDevExample example = new UmsPersonDevExample();
        example.createCriteria().andUserIdEqualTo(umsUser.getId());
        List<UmsPersonDev> devList = personDevMapper.selectByExample(example);
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
        UmsCompanyDevExample example = new UmsCompanyDevExample();
        example.createCriteria().andUserIdEqualTo(umsUser.getId());
        List<UmsCompanyDev> devList = companyDevMapper.selectByExample(example);
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
    public int update(UpdateProfileParam param) {
        UmsUser umsUser = new UmsUser();
        BeanUtil.copyProperties(param, umsUser);
        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andUsernameEqualTo(umsUser.getUsername());
        int count = umsUserMapper.updateByExampleSelective(umsUser, example);
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
        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andUsernameEqualTo(param.getUsername());
        List<UmsUser> umsUserList = umsUserMapper.selectByExample(example);
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
        umsUserMapper.updateByExampleSelective(umsUser, example);
        userCacheService.delUser(umsUser.getUsername());
        return 1;
    }

    @Override
    public int updateAvatar(String username, String newIcon) {
        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        UmsUser umsUser = new UmsUser();
        umsUser.setIcon(newIcon);
        int count = umsUserMapper.updateByExampleSelective(umsUser, example);
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
            UmsUserExample example = new UmsUserExample();
            example.createCriteria().andUsernameEqualTo(umsUser.getUsername());
            umsUser.setEmail(email);
            umsUser.setActivation(0);
            int count = umsUserMapper.updateByExampleSelective(umsUser, example);
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
        if (StringUtils.isEmpty(key)) {
            return null;
        }
        String realValue = (String)redisService.get(key);
        if (!StringUtils.isEmpty(realValue)) {
            return realValue;
        } else {
            return null;
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        UmsUser member = getUserByUsername(username);
        if(member!=null){
            return new UmsUserDetail(member);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

}
