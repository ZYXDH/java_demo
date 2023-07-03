package com.example.demo;

import lombok.Data;

@Data
public class MyBean {
    private int id;
    private String desc;
    public int getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public MyBean(int id,String desc){
        this.id=id;
        this.desc=desc;
    }
}