package com.money.store.openplatform.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.ObjectId;
import cn.hutool.core.util.IdcardUtil;
import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.money.store.common.constant.UserTypeEnum;
import com.money.store.mapper.UmsCompanyDevMapper;
import com.money.store.mapper.UmsPersonDevMapper;
import com.money.store.mapper.UmsUserStatisticsInfoMapper;
import com.money.store.model.*;
import com.money.store.mapper.UmsUserMapper;
import com.money.store.openplatform.dao.UserMapper;
import com.money.store.openplatform.dto.UmsCompanyDevParam;
import com.money.store.openplatform.dto.UmsPersonDevParam;
import com.money.store.openplatform.dto.UmsUpgradePersonDevParam;
import com.money.store.openplatform.service.UmsPlatformService;
import com.money.store.openplatform.service.UmsUserCacheService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
    private UmsPersonDevMapper umsPersonDevMapper;
    @Autowired
    private UmsCompanyDevMapper umsCompanyDevMapper;
    @Autowired
    private UmsUserCacheService userCacheService;
    @Autowired
    private UmsUserStatisticsInfoMapper umsUserStatisticsInfoMapper;

    public UmsUser getUserByUsername(String username) {
        QueryWrapper<UmsUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        List<UmsUser> userList = umsUserMapper.selectList(queryWrapper);
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

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
    public UmsUser personDevRegister(UmsPersonDevParam umsPersonDevParam) {
        UmsUser umsUser = new UmsUser(); // 用户信息
        UmsPersonDev umsPersonDev = new UmsPersonDev(); // 开发者信息
        BeanUtils.copyProperties(umsPersonDevParam, umsUser);
        BeanUtils.copyProperties(umsPersonDevParam, umsPersonDev);
        umsUser.setActivation(0);
        umsUser.setType(UserTypeEnum.PERSON_DEV.getId());
        umsUser.setCreateTime(LocalDateTime.now());
        umsUser.setStatus(1);
        umsUser.setBirthday(LocalDate.parse(IdcardUtil.getBirthByIdCard(umsPersonDev.getIdCard())));
        // 查询是否有相同用户名的用户
        if (getUserByUsername(umsUser.getUsername()) != null) {
            return null;
        }
        // 将密码进行加密操作
        String encodePassword = passwordEncoder.encode(umsUser.getPassword());
        umsUser.setPassword(encodePassword);
        userMapper.insertAndPkToId(umsUser);
        // 外键连接
        umsPersonDev.setUserId(umsUser.getId());
        // 生成AppId和AppKey
        String appId = RandomUtil.randomNumbers(8);
        String appKey = ObjectId.next();
        umsPersonDev.setAppId(appId);
        umsPersonDev.setAppKey(appKey);
        umsPersonDevMapper.insert(umsPersonDev);
        umsUser.setPassword("");
        insertUserStatistic(umsUser.getUsername());
        return umsUser;
    }

    @Override
    public UmsUser upgradePersonDev(UmsUpgradePersonDevParam umsUpgradePersonDevParam) {
        UmsUser umsUser = new UmsUser(); // 用户信息
        UmsPersonDev umsPersonDev = new UmsPersonDev(); // 开发者信息
        BeanUtils.copyProperties(umsUpgradePersonDevParam, umsUser);
        BeanUtils.copyProperties(umsUpgradePersonDevParam, umsPersonDev);
        umsUser.setActivation(0);
        umsUser.setType(UserTypeEnum.PERSON_DEV.getId());
        umsUser.setUpgradeTime(LocalDateTime.now());
        umsUser.setBirthday(LocalDate.parse(IdcardUtil.getBirthByIdCard(umsPersonDev.getIdCard())));
        QueryWrapper<UmsUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", umsUser.getUsername());
        umsUserMapper.update(umsUser, queryWrapper);
        Long id = getUserByUsername(umsUser.getUsername()).getId();
        umsPersonDev.setUserId(id);
        // 生成AppId和AppKey
        String appId = RandomUtil.randomNumbers(8);
        String appKey = ObjectId.next();
        umsPersonDev.setAppId(appId);
        umsPersonDev.setAppKey(appKey);
        umsPersonDevMapper.insert(umsPersonDev);
        umsUser.setPassword("");
        insertUserStatistic(umsUser.getUsername());
        return umsUser;
    }

    @Override
    public UmsUser companyDevRegister(UmsCompanyDevParam umsCompanyDevParam) {
        UmsUser umsUser = new UmsUser(); // 用户信息
        UmsCompanyDev umsCompanyDev = new UmsCompanyDev(); // 开发者信息
        BeanUtils.copyProperties(umsCompanyDevParam, umsUser);
        BeanUtils.copyProperties(umsCompanyDevParam, umsCompanyDev);
        umsUser.setActivation(0);
        umsUser.setType(UserTypeEnum.COMPANY_DEV.getId());
        umsUser.setStatus(1);
        umsUser.setCreateTime(LocalDateTime.now());
        // 注册日期为生日
        umsUser.setBirthday(LocalDate.now());
        // 查询是否有相同用户名的用户
        if (getUserByUsername(umsUser.getUsername()) != null) {
            return null;
        }
        // 将密码进行加密操作
        String encodePassword = passwordEncoder.encode(umsUser.getPassword());
        umsUser.setPassword(encodePassword);
        userMapper.insertAndPkToId(umsUser);
        // 外键连接
        umsCompanyDev.setUserId(umsUser.getId());
        // 生成AppId和AppKey
        String appId = RandomUtil.randomNumbers(8);
        String appKey = ObjectId.next();
        umsCompanyDev.setAppId(appId);
        umsCompanyDev.setAppKey(appKey);
        umsCompanyDevMapper.insert(umsCompanyDev);
        umsUser.setPassword("");
        insertUserStatistic(umsUser.getUsername());
        return umsUser;
    }

    @Override
    public void activateDev(String username) {
        userMapper.updateActivationStatus(username);
        userCacheService.delUser(username);
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
    public int changeEmail(String username, String password, String email) {
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(email) || getUserByEmail(email) != null) {
            return -1;
        }
        String realPassword = getUserByUsername(username).getPassword();
        if (!StringUtils.isEmpty(realPassword) && passwordEncoder.matches(password, realPassword)) {
            return userMapper.updateEmailByUsername(username, email);
        } else {
            return -2;
        }
    }

    @Override
    public int resetPassword(Long id, String newPassword) {
        String encodePassword = passwordEncoder.encode(newPassword);
        UmsUser umsUser = new UmsUser();
        umsUser.setId(id);
        umsUser.setPassword(encodePassword);
        return umsUserMapper.updateById(umsUser);
    }

    private void insertUserStatistic(String user) {
        UmsUserStatisticsInfo userStatisticsInfo = new UmsUserStatisticsInfo();
        userStatisticsInfo.setDevLoginCount(1);
        userStatisticsInfo.setUser(user);
        userStatisticsInfo.setAppCount(0);
        userStatisticsInfo.setApplyAppCount(0);
        userStatisticsInfo.setAttendCount(0);
        userStatisticsInfo.setCollectAppCount(0);
        userStatisticsInfo.setCollectTopicCount(0);
        userStatisticsInfo.setCommentCount(0);
        userStatisticsInfo.setConsumeAmount(new BigDecimal(0));
        userStatisticsInfo.setDevDownloadedCount(0);
        userStatisticsInfo.setDownloadAmount("0");
        userStatisticsInfo.setFansCount(0);
        userStatisticsInfo.setLoginCount(0);
        userStatisticsInfo.setOnSaleAppCount(0);
        userStatisticsInfo.setOrderCount(0);
        umsUserStatisticsInfoMapper.insert(userStatisticsInfo);
    }
}
