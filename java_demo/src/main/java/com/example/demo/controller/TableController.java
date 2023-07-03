package com.example.demo.controller;

import com.example.demo.bean.Student;
import com.example.demo.bean.Table;
import com.example.demo.bean.User;
import com.example.demo.bean.RequestBody;
import com.example.demo.service.EmpService;
import com.example.demo.service.StudentService;
import com.example.demo.service.imps.listEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TableController{
    @RequestMapping("/hello")
    public String hello(@RequestParam(name = "name") String name){
        return "hello world"+name;
    }
    @RequestMapping("/hello2")
    public String hello2(User user){
        System.out.println(user);
        return "hello world";
    }
    @RequestMapping("/hello21")
    public RequestBody hello21(User user){
        System.out.println(user);
        return RequestBody.success("hello word");
    }
    @RequestMapping("/hello3")
    public User hello3(){
        User ctx=new User();
        ctx.setId(2);
        ctx.setDesc("123");
        return ctx;
    }
    @RequestMapping("/hello31")
    public RequestBody hello31(){
        User ctx=new User();
        ctx.setId(2);
        ctx.setDesc("123");
        return RequestBody.success(ctx);
    }
    @RequestMapping("/hello4")
    public List<User> hello4(){
        List<User> list = new ArrayList<>();
        User ctx=new User();
        ctx.setId(2);
        ctx.setDesc("123");
        User ctx1=new User();
        ctx1.setId(1);
        ctx1.setDesc("1234");
        list.add(ctx);
        list.add(ctx1);
        return list;
    }
    @RequestMapping("/hello41")
    public RequestBody hello41(){
        List<User> list = new ArrayList<>();
        User ctx=new User();
        ctx.setId(2);
        ctx.setDesc("123");
        User ctx1=new User();
        ctx1.setId(2);
        ctx1.setDesc("1234");
        list.add(ctx);
        list.add(ctx1);
        return RequestBody.success(list);
    }
    @Autowired
    private EmpService empService;
    @RequestMapping("/hello42")
    public RequestBody hello42(){
        List<Table> list= empService.listEmp();
        return RequestBody.success(list);
    }
    @Autowired
    private StudentService studentService;
    @RequestMapping("/student")
    public RequestBody student(){
        List<Student> list= studentService.listStu();
        return RequestBody.success(list);
    }
    @RequestMapping("/studentA")
    public RequestBody studentA(@RequestParam(value = "age",required = false) Integer age){
        if(age==null){
            return RequestBody.error("没有数据");
        }
        List<Student> list= studentService.listStuA(age);
        return RequestBody.success(list);
    }
}
