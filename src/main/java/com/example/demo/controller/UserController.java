package com.example.demo.controller;

import com.example.demo.bean.RequestBody;
import com.example.demo.service.PositionService;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
    @RequestMapping("/getLocaltion")
    @ResponseBody
    public RequestBody getLocaltion(@RequestHeader(value = "open_id",required = false) String openid) {
        System.out.println("open_id:"+openid);
        RequestBody data = userService.getLocaltion(openid);
        System.out.println("data:"+data);
        return data;
    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class LocaltionBody {
        private String localtionid;
    }
    @PostMapping("/updateLocaltion")
    @ResponseBody
    public RequestBody addPosition(@RequestHeader(value = "open_id",required = false) String openid,@org.springframework.web.bind.annotation.RequestBody LocaltionBody localtionBody) {
        RequestBody data = userService.updateLocaltion(openid,localtionBody.localtionid);
        return data;
    }


}
