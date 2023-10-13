package com.example.demo.dao;

import com.example.demo.bean.UserInfo;

import java.util.List;

public interface UserDao {
    int updateUser();
    List<UserInfo> getUserLogin(String openid);
    int insertUserByOpenid(String openid,String sessionkey);
    int getUserCountByOpenid(String openid);

}
