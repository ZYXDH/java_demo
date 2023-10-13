package com.example.demo.controller;

import com.example.demo.bean.RequestBody;
import com.example.demo.service.PositionService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;




@RestController

public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    @ResponseBody
    public RequestBody toLogin(@RequestParam(value = "code",required = false) String code) {
        RequestBody data = userService.toLogin(code);
        System.out.println("data:"+data);
        return data;
    }
}
