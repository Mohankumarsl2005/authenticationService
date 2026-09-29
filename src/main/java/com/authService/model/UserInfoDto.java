package com.authService.model;

import com.authService.entity.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import tools.jackson.databind.PropertyNamingStrategy;

import java.time.LocalDate;
@JsonProperty(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserInfoDto extends UserInfo {
    private String userName;

    private String lastName;

    private Long phoneNumber;

    private String email;
}

