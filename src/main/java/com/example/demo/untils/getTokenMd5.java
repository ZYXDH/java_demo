package com.example.demo.untils;

import com.example.demo.bean.UserInfo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.jws.WebParam;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class getTokenMd5 {
    private static Map<String, UserInfo> tokenMap = new HashMap<>();


    public static String generateToken(UserInfo userInfo){
        //生成唯一不重复的字符串
        String token = UUID.randomUUID().toString();
        tokenMap.put(token,userInfo);
        return token;
    }

    /**
     * 验证token是否合法
     * @param token
     * @return
     */
    public static  boolean verify(String token){
        return tokenMap.containsKey(token);
    }

    public static UserInfo gentUser(String token){
        return tokenMap.get(token);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++){
            System.out.println(UUID.randomUUID().toString());
        }
    }


}
