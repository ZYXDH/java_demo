package com.example.demo.mapper;

import com.example.demo.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface WechatMapper {
    int getUserCountByOpenid(@Param("openid") String openid);
    List<UserInfo> getUserByOpenid(@Param("openid") String openid);
    int insertUserByOpenid(@Param("openid") String openid,@Param("sessionkey") String sessionkey);
    int updateUserToken(@Param("token") String token,@Param("openid") String openid);
    String getLocaltion(@Param("openid") String openid);
    int updateLocaltion(@Param("openid") String openid,@Param("localtionid") String localtionid);
    int insertLocaltion(@Param("openid") String openid,@Param("localtionid") String localtionid);
}
