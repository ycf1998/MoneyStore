package com.money.store.openplatform.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.ObjectId;
import cn.hutool.core.util.IdcardUtil;
import cn.hutool.core.util.RandomUtil;
import com.money.store.common.constant.UserTypeEnum;
import com.money.store.openplatform.dao.UmsCompanyDeveloperMapper;
import com.money.store.openplatform.dao.UmsPersonDeveloperMapper;
import com.money.store.mapper.UmsUserMapper;
import com.money.store.openplatform.domain.UmsCompanyDeveloper;
import com.money.store.openplatform.domain.UmsPersonDeveloper;
import com.money.store.model.UmsUser;
import com.money.store.model.UmsUserExample;
import com.money.store.openplatform.dao.UserMapper;
import com.money.store.openplatform.dto.UmsCompanyDevParam;
import com.money.store.openplatform.dto.UmsPersonDevParam;
import com.money.store.openplatform.dto.UmsUpgradePersonDevParam;
import com.money.store.openplatform.service.RedisService;
import com.money.store.openplatform.service.UmsPlatformService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @program: store
 * @description: 用户平台管理实现类
 * @author: Money
 * @create: 2020/03/01 17:24
 */
@Service
public class UmsPlatformServiceImpl implements UmsPlatformService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UmsPlatformServiceImpl.class);
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsUserMapper umsUserMapper;
    @Autowired
    private UmsPersonDeveloperMapper umsPersonDeveloperMapper;
    @Autowired
    private UmsCompanyDeveloperMapper umsCompanyDeveloperMapper;
    @Autowired
    private RedisService redisService;
    @Value("${redis.key.prefix.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;
    @Value("${redis.key.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;

    public UmsUser getUserByUsername(String username) {
        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsUser> userList = umsUserMapper.selectByExample(example);
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

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
    public UmsUser regLogin(String username, String password) {
        UmsUser user =  getUserByUsername(username);
        if (user != null) {
            if (!passwordEncoder.matches(password, user.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            } else {
                return user;
            }
        }
        return null;
    }

    @Override
    public UmsPersonDeveloper personDevRegister(UmsPersonDevParam umsPersonDevParam) {
        UmsPersonDeveloper umsPersonDeveloper = new UmsPersonDeveloper();
        BeanUtils.copyProperties(umsPersonDevParam, umsPersonDeveloper);
        umsPersonDeveloper.setActivation(0);
        umsPersonDeveloper.setType(UserTypeEnum.PERSON_DEV.getId());
        umsPersonDeveloper.setCreateTime(new Date());
        umsPersonDeveloper.setStatus(1);
        umsPersonDeveloper.setBirthday(IdcardUtil.getBirthDate(umsPersonDeveloper.getIdCard()));
        // 查询是否有相同用户名的用户
        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andUsernameEqualTo(umsPersonDeveloper.getUsername());
        List<UmsUser> umsUserList = umsUserMapper.selectByExample(example);
        if (umsUserList.size() > 0) {
            return null;
        }
        // 将密码进行加密操作
        String encodePassword = passwordEncoder.encode(umsPersonDeveloper.getPassword());
        umsPersonDeveloper.setPassword(encodePassword);
        userMapper.insertAndPkToUserId(umsPersonDeveloper);
        // 生成AppId和AppKey
        String appId = RandomUtil.randomNumbers(8);
        String appKey = ObjectId.next();
        umsPersonDeveloper.setAppId(appId);
        umsPersonDeveloper.setAppKey(appKey);
        umsPersonDeveloperMapper.insert(umsPersonDeveloper);
        return umsPersonDeveloper;
    }

    @Override
    public UmsPersonDeveloper upgradePersonDev(UmsUpgradePersonDevParam umsUpgradePersonDevParam) {
        UmsPersonDeveloper umsPersonDeveloper = new UmsPersonDeveloper();
        BeanUtils.copyProperties(umsUpgradePersonDevParam, umsPersonDeveloper);
        umsPersonDeveloper.setActivation(0);
        umsPersonDeveloper.setType(UserTypeEnum.PERSON_DEV.getId());
        umsPersonDeveloper.setUpgradeTime(new Date());
        umsPersonDeveloper.setBirthday(IdcardUtil.getBirthDate(umsPersonDeveloper.getIdCard()));
        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andUsernameEqualTo(umsPersonDeveloper.getUsername());
        umsUserMapper.updateByExampleSelective(umsPersonDeveloper, example);
        Long id = getUserByUsername(umsPersonDeveloper.getUsername()).getId();
        umsPersonDeveloper.setUserId(id);
        // 生成AppId和AppKey
        String appId = RandomUtil.randomNumbers(8);
        String appKey = ObjectId.next();
        umsPersonDeveloper.setAppId(appId);
        umsPersonDeveloper.setAppKey(appKey);
        umsPersonDeveloperMapper.insert(umsPersonDeveloper);
        return umsPersonDeveloper;
    }

    @Override
    public UmsCompanyDeveloper companyDevRegister(UmsCompanyDevParam umsCompanyDevParam) {
        UmsCompanyDeveloper umsCompanyDeveloper = new UmsCompanyDeveloper();
        BeanUtils.copyProperties(umsCompanyDevParam, umsCompanyDeveloper);
        umsCompanyDeveloper.setActivation(0);
        umsCompanyDeveloper.setType(UserTypeEnum.COMPANY_DEV.getId());
        umsCompanyDeveloper.setStatus(1);
        umsCompanyDeveloper.setCreateTime(new Date());
        // 注册日期为生日
        umsCompanyDeveloper.setBirthday(DateUtil.parse(DateUtil.today(), "yyyy-MM-dd"));
        // 查询是否有相同用户名的用户
        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andUsernameEqualTo(umsCompanyDeveloper.getUsername());
        List<UmsUser> umsUserList = umsUserMapper.selectByExample(example);
        if (umsUserList.size() > 0) {
            return null;
        }
        // 将密码进行加密操作
        String encodePassword = passwordEncoder.encode(umsCompanyDeveloper.getPassword());
        umsCompanyDeveloper.setPassword(encodePassword);
        userMapper.insertAndPkToUserId(umsCompanyDeveloper);
        // 生成AppId和AppKey
        String appId = RandomUtil.randomNumbers(8);
        String appKey = ObjectId.next();
        umsCompanyDeveloper.setAppId(appId);
        umsCompanyDeveloper.setAppKey(appKey);
        umsCompanyDeveloperMapper.insert(umsCompanyDeveloper);
        return umsCompanyDeveloper;
    }

    @Override
    public void activateDev(String username) {
        userMapper.updateActivationStatus(username);
    }

    @Override
    public boolean isActivationDev(String username) {
        Integer result = userMapper.selectActivationStatus(username);
        if (result != null && result.equals(1)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean changeEmail(String username, String password, String email) {
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(email) || getUserByEmail(email) != null) {
            return false;
        }
        String realPassword = getUserByUsername(username).getPassword();
        if (!StringUtils.isEmpty(realPassword) && passwordEncoder.matches(password, realPassword)) {
            return userMapper.updateEmailByUsername(username, email) > 0;
        } else {
            return false;
        }
    }

}
