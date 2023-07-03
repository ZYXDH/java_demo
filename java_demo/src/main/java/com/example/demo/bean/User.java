package com.example.demo.bean;

import lombok.Data;

@Data
public class User {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                '}';
    }

    private int id;
    private String desc;
    public User(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }
    public User() {
    }
}
