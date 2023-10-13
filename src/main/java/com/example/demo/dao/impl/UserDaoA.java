package com.example.demo.dao.impl;

import com.example.demo.bean.UserInfo;
import com.example.demo.dao.UserDao;
import com.example.demo.mapper.WechatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoA implements UserDao {
    @Autowired
    private WechatMapper wechatMapper;
    @Override
    public int updateUser(){
//        int num=positionMapper.addPos();
        return 1;
    }
    public int getUserCountByOpenid(String openid){
        int num = wechatMapper.getUserCountByOpenid(openid);
        return num;
    }
    public List<UserInfo> getUserLogin(String openid){
        List<UserInfo> data = wechatMapper.getUserByOpenid(openid);
        return data;
    }
    public int insertUserByOpenid(String openid,String sessionkey){
        int num =wechatMapper.insertUserByOpenid(openid,sessionkey);
        return num;
    }
}
