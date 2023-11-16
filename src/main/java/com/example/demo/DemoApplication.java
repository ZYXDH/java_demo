package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@SpringBootApplication
@ComponentScan("com.example.demo.websocket")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "恭喜，您的springboot搭建完成！！！";
    }
    @GetMapping("/message")
    public MyBean message() {
        List<MyBean> list = new ArrayList<MyBean>();
//        list.add("id:");
        int id=1;
        String desc="321";
        return new MyBean(id, desc);
    }
}




