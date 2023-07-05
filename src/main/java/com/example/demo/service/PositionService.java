package com.example.demo.service;

import com.example.demo.bean.Position;
import com.example.demo.bean.RequestBody;

import java.util.List;

public interface PositionService {
    List<Position> listPos();
    RequestBody updatePos(String name,String rotate, String x, String y, String z, String type);
    RequestBody deletePos(String name);
    RequestBody addPos(String name,String rotate, String x, String y, String z, String type);
}
