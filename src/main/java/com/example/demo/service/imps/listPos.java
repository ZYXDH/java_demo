package com.example.demo.service.imps;

import com.example.demo.bean.Position;
import com.example.demo.bean.RequestBody;
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
    public RequestBody updatePos(String name,String rotate,String x,String y,String z,String type){
//        System.out.println(name+";"+x+";"+y+";"+z+";"+type);
        float xf = Float.parseFloat(x);
        float yf = Float.parseFloat(y);
        float zf = Float.parseFloat(z);
//        System.out.println(name+";"+xf+";"+yf+";"+zf+";"+type);
        int num=positionDao.updatePos(name,rotate,xf,yf,zf,type);
        System.out.println(num);
        String data;
        if(num>0){
            data="success";
            return RequestBody.success(data);
        }else{
            data="NO DATA TO UPDATE";
            return RequestBody.error(data);
        }

    }
    public RequestBody deletePos(String name){
        int num = positionDao.deletPos(name);
        if(num>0){
            return RequestBody.success("success");
        }else{
            return RequestBody.error("NO DATA TO UPDATE");
        }
    }
    public RequestBody addPos(String name,String rotate, String x, String y, String z, String type){
        float xf = Float.parseFloat(x);
        float yf = Float.parseFloat(y);
        float zf = Float.parseFloat(z);
        float rotatef=Float.parseFloat(rotate);
        int num = positionDao.addPos(name,rotate,xf,yf,zf,type);
        if(num>0){
            return RequestBody.success("success");
        }else{
            return RequestBody.error("NO DATA TO UPDATE");
        }
    }
}
