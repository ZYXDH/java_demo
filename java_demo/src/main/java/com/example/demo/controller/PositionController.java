package com.example.demo.controller;

import com.example.demo.bean.Position;
import com.example.demo.bean.RequestBody;
import com.example.demo.bean.Student;
import com.example.demo.bean.User;
import com.example.demo.mapper.PositionMapper;
import com.example.demo.service.PositionService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PositionController {
    @Autowired
    private PositionService positionService;
   @RequestMapping("/getPositionList")
   public RequestBody getPositionList(){
       List<Position> list =positionService.listPos();
       return RequestBody.success(list);
   }
   @RequestMapping("/getPositionUpdate")
   public RequestBody getPositionUpdate(@RequestParam(value = "name") String name,@RequestParam(value = "x") String x,@RequestParam(value = "y") String y,@RequestParam(value = "z") String z,@RequestParam(value = "type") String type){
       positionService.updatePos(name,x,y,z,type);
       return RequestBody.success();
   }
}
