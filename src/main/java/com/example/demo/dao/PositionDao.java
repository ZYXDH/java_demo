package com.example.demo.dao;

import com.example.demo.bean.Position;

import java.util.List;

public interface PositionDao {
    List<Position> listPos();
    int updatePos(String name,String rotate,float x,float y, float z,String type);
    int deletPos(String name);
    int addPos(String name,String rotate,float x,float y, float z,String type);
}
