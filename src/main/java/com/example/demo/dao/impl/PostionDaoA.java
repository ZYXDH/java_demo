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
    public int updatePos(String name,float rotate,float x,float y, float z,String type){
        System.out.println(name+";"+x+";"+y+";"+z+";"+type);
        int num=positionMapper.updatePos(name,rotate,x,y,z,type);
        System.out.println(num);
        return num;
    }
    public  int deletPos(String name){
        int num=positionMapper.deletePos(name);
        return num;
    }
    public int addPos(String name,float rotate,float x,float y, float z,String type){
        int num=positionMapper.addPos(name,rotate,x,y,z,type);
        return num;
    }

}
