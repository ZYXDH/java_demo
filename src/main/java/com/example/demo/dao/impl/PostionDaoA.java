package com.example.demo.dao.impl;

import com.example.demo.bean.Position;
import com.example.demo.bean.Student;
import com.example.demo.dao.PositionDao;
import com.example.demo.mapper.PositionMapper;
import com.example.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostionDaoA implements PositionDao {
    @Autowired
    private PositionMapper positionMapper;
    @Override
    public List<Position> listPos() {
        List<Position> list = positionMapper.list();
        System.out.println(list);
        return list;
    }
    public  void updatePos(String name,float x,float y, float z,String type){
        System.out.println(name+";"+x+";"+y+";"+z+";"+type);
        positionMapper.updatePos(name,x,y,z,type);
    }
}
