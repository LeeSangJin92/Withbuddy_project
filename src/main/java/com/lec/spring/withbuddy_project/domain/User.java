package com.lec.spring.withbuddy_project.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private Long id;
    private String userId;
    private String password;
    private String re_password;
    private String phone;
    private String email;
    private String provider;
    private String providerId;
    private Long addressId;
    private String addressName;
}
