package com.example.demo.dao;

import com.example.demo.bean.Position;

import java.util.List;

public interface PositionDao {
    List<Position> listPos();
    void updatePos(String name,float x,float y, float z,String type);
}
