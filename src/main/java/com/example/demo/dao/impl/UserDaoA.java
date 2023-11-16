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
    public int updateUserToken(String token,String openid){
        int num= wechatMapper.updateUserToken(token,openid);
        return num;
    }
    public String getLocaltion(String openid){
        String data=wechatMapper.getLocaltion(openid);
        return data;
    }

    public int updateLocaltion(String openid,String localtionid){
        int num=wechatMapper.updateLocaltion(openid,localtionid);
        return num;
    }
    public int insertLocaltion(String openid,String localtionid){
        int num=wechatMapper.insertLocaltion(openid,localtionid);
        return num;
    }
}
