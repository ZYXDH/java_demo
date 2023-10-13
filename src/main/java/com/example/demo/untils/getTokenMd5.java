package com.example.demo.untils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class getTokenMd5 {
    public static String encrypt(String input) {
        try {
            // 创建MessageDigest对象，指定加密算法为MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // 将输入字符串转换为字节数组
            byte[] inputBytes = input.getBytes();

            // 计算MD5哈希值
            byte[] hash = md.digest(inputBytes);

            // 将字节数组转换为十六进制字符串
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // 处理异常
            e.printStackTrace();
            return null;
        }
    }
}
