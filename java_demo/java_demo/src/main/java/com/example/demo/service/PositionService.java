package com.example.demo.service;

import com.example.demo.bean.Position;

import java.util.List;

public interface PositionService {
    List<Position> listPos();
    void updatePos(String name,String x,String y,String z,String type);
}
