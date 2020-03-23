package com.money.store.openplatform.service.impl;

import com.money.store.mapper.UmsUserMapper;
import com.money.store.model.UmsUser;
import com.money.store.model.UmsUserExample;
import com.money.store.openplatform.domain.UmsUserDetail;
import com.money.store.openplatform.service.RedisService;
import com.money.store.openplatform.service.UmsUserService;
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

import java.util.List;

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
    private RedisService redisService;

    @Override
    public UmsUser getUserByUsername(String username) {
        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsUser> userList = umsUserMapper.selectByExample(example);
        if (userList != null && userList.size() > 0) {
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
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public boolean resetPassword(Long id, String newPassword) {
        String encodePassword = passwordEncoder.encode(newPassword);
        UmsUserExample example = new UmsUserExample();
        example.createCriteria().andIdEqualTo(id);
        UmsUser umsUser = new UmsUser();
        umsUser.setPassword(encodePassword);
        return umsUserMapper.updateByExampleSelective(umsUser, example) > 0;
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
        String realValue = redisService.get(key);
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
