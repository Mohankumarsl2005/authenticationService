package com.authService.repository;

import com.authService.entity.UserInfo;

public interface UserRepository extends CurdRepository<UserInfo, Long> {
    public UserInfo(String username);
}
