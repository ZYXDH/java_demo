package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private Integer id;
    private String user_id;
    private String avatar;
    private String session_key;
    private String open_id;
    private String create_time;
    private String token;

}
