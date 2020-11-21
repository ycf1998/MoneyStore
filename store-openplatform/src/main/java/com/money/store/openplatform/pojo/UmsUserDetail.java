package com.money.store.openplatform.pojo;

import com.money.store.model.UmsPermission;
import com.money.store.model.UmsUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @program: store
 * @description: Security的UserDetail
 * @author: Money
 * @create: 2020/03/01 15:56
 */
public class UmsUserDetail implements UserDetails {
    private UmsUser umsUser;

    private List<UmsPermission> permissionList;

    public UmsUserDetail(UmsUser UmsUser) {
        this.umsUser = UmsUser;
    }

    public UmsUserDetail(UmsUser UmsUser, List<UmsPermission> permissionList) {
        this.umsUser = UmsUser;
        this.permissionList = permissionList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return Arrays.asList(new SimpleGrantedAuthority("DEV"));
    }

    @Override
    public String getPassword() {
        return umsUser.getPassword();
    }

    @Override
    public String getUsername() {
        return umsUser.getUsername();
    }

    /**
     * 账户是否过期
     *
     * @return
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 是否没被禁用
     *
     * @return
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * 密码是否过期
     *
     * @return
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * 是否允许
     *
     * @return
     */
    @Override
    public boolean isEnabled() {
        return umsUser.getStatus().equals(1);
    }
}
