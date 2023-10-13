package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponLogin {
    private String errcode;
    private String errmsg;
    private String session_key;
    private String openid;
    public String getErrcode() {
        return errcode;
    }
    public String getErrmsg() {
        return errmsg;
    }
    public String getOpenid() {
        return openid;
    }
    public String getSession_key() {
        return session_key;
    }
}
