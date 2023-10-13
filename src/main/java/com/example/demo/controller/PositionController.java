package com.example.demo.controller;

import com.example.demo.bean.Position;
import com.example.demo.bean.RequestBody;
import com.example.demo.bean.Student;
import com.example.demo.bean.User;
import com.example.demo.mapper.PositionMapper;
import com.example.demo.service.PositionService;
import com.example.demo.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PositionController {
    @Autowired
    private PositionService positionService;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AddNameBody {
        private String name;
        private String rotate;
        private String x;
        private String y;
        private String z;
        private String type;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class NameBody {
        private String name;
    }

    @RequestMapping("/getPositionList")
    public RequestBody getPositionList() {
        List<Position> list = positionService.listPos();
        return RequestBody.success(list);
    }

    @PostMapping("/UpdatePosition")
    @ResponseBody
    public RequestBody getPositionUpdate(@org.springframework.web.bind.annotation.RequestBody AddNameBody addNameBody) {
        System.out.println(addNameBody);
        RequestBody data = positionService.updatePos(addNameBody.name, addNameBody.rotate, addNameBody.x, addNameBody.y, addNameBody.z, addNameBody.type);
        return data;
    }


    @PostMapping("/deletePosition")
    @ResponseBody
    public RequestBody deletePosition(@org.springframework.web.bind.annotation.RequestBody NameBody nameBody) {
        System.out.println(nameBody);
        RequestBody data = positionService.deletePos(nameBody.name);
        return data;
    }

    @PostMapping("/addPosition")
    @ResponseBody
    public RequestBody addPosition(@org.springframework.web.bind.annotation.RequestBody AddNameBody addNameBody) {
        RequestBody data = positionService.addPos(addNameBody.name, addNameBody.rotate, addNameBody.x, addNameBody.y, addNameBody.z, addNameBody.type);
        return data;
    }
}
