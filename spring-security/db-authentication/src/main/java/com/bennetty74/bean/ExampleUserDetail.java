package com.bennetty74.bean;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

/**
 * @author bennetty74
 * @date 2021.9.12
 */


public class ExampleUserDetail extends User implements UserDetails{

    protected String email;

    public ExampleUserDetail(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return super.isEnabled();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
