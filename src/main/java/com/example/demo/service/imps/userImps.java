package com.example.demo.service.imps;

import com.example.demo.bean.RequestBody;
import com.example.demo.bean.ResponLogin;
import com.example.demo.bean.Student;
import com.example.demo.bean.UserInfo;
import com.example.demo.dao.StudentDao;
import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;
import com.example.demo.untils.getTokenMd5;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Component
public class userImps implements UserService {
    private final RestTemplate restTemplate;

    @Autowired
    public userImps(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Autowired
    private UserDao userDao;

    @Override
    public RequestBody updateUser() {
        int num = userDao.updateUser();
        if (num > 0) {
            return RequestBody.success("success");
        } else {
            return RequestBody.error("NO DATA TO UPDATE");
        }
    }

    public RequestBody toLogin(String code) {
        String postUrl = "https://api.weixin.qq.com/sns/jscode2session?appid=wxa923316d1751dd0f&secret=4a4f5f7a75a95ef5711b133fc7a08b6d&grant_type=authorization_code&js_code=" + code;
        ResponseEntity<String> response = restTemplate.getForEntity(postUrl, String.class);
        String resp = response.getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        ResponLogin myResponse;
        try {
            myResponse = objectMapper.readValue(resp, ResponLogin.class);
            System.out.println("从服务端返回结果: " +myResponse.getOpenid());
            if(myResponse.getErrcode()==null){
                List<UserInfo> userinfo;
                int count=userDao.getUserCountByOpenid(myResponse.getOpenid());
                if(count==0){
                    userDao.insertUserByOpenid(myResponse.getOpenid(),myResponse.getSession_key());
                }
                userinfo=userDao.getUserLogin(myResponse.getOpenid());
                String token = getTokenMd5.generateToken(userinfo.get(0));
                userDao.updateUserToken(token,myResponse.getOpenid());
                userinfo=userDao.getUserLogin(myResponse.getOpenid());
                System.out.println("token:"+token);
                return RequestBody.success(userinfo.get(0));
            }else{
                return RequestBody.error(myResponse.getErrmsg());
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return RequestBody.error("ERROR NETWORK");
        }
    };
    public RequestBody getLocaltion(String code) {
        try{
            String data;
            data= userDao.getLocaltion(code);
            System.out.println("data:="+data);
            if(data!=null){
                return RequestBody.success(data);
            }else{
                userDao.insertLocaltion(code,"310000");
                data= userDao.getLocaltion(code);
                return RequestBody.success(data);
            }
        }catch (UnsupportedOperationException e) {
            e.printStackTrace();
            return RequestBody.error("ERROR NETWORK");
        }
    };

    public RequestBody updateLocaltion(String openid,String localtionid) {
        int num= userDao.updateLocaltion(openid,localtionid);
        if(num>0){
            return RequestBody.success("更新成功");
        }else{
            userDao.insertLocaltion(openid,localtionid);
        }
        return RequestBody.error("ERROR NETWORK");
    };

}
