package com.authService.Service;

import com.authService.entity.UserInfo;
import com.authService.entity.UserRole;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetails extends UserInfo implements UserDetails {

    private final Collection<? extends GrantedAuthority> authorities;

    public CustomUserDetails(UserInfo userInfo) {

        List<GrantedAuthority> auths = new ArrayList<>();

        for (UserRole role : userInfo.getRoles()) {
            auths.add(
                    new SimpleGrantedAuthority(
                            "ROLE_" + role.getName().toUpperCase()
                    )
            );
        }

        this.authorities = auths;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
