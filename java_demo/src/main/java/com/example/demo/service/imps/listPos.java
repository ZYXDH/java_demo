package com.example.demo.service.imps;

import com.example.demo.bean.Position;
import com.example.demo.bean.Student;
import com.example.demo.dao.PositionDao;
import com.example.demo.dao.StudentDao;
import com.example.demo.service.PositionService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class listPos implements PositionService {
    @Autowired
    private PositionDao positionDao;

    @Override
    public List<Position> listPos() {
        List<Position> list = positionDao.listPos();
        return list;
    }
    public void updatePos(String name,String x,String y,String z,String type){
        System.out.println(name+";"+x+";"+y+";"+z+";"+type);
        float xf = Float.parseFloat(x);
        float yf = Float.parseFloat(y);
        float zf = Float.parseFloat(z);
        System.out.println(name+";"+xf+";"+yf+";"+zf+";"+type);
        positionDao.updatePos(name,xf,yf,zf,type);
    }
}
