package com.example.demo.service;

import com.example.demo.bean.RequestBody;

import com.example.demo.bean.UserInfo;
import org.springframework.http.ResponseEntity;

public interface UserService {
    RequestBody updateUser();
    RequestBody toLogin(String code);
    RequestBody getLocaltion(String openid);
    RequestBody updateLocaltion(String openid,String localtionid);
}
