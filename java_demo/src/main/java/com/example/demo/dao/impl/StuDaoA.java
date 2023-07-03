package com.example.demo.dao.impl;

import com.example.demo.bean.Student;
import com.example.demo.dao.StudentDao;
import com.example.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Component
public class StuDaoA implements StudentDao {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> listStu() {
       List<Student> list = studentMapper.list();
       System.out.println(list);
       return list;
    }
//    @Override
    public List<Student> listStuA(int age) {
        List<Student> list = studentMapper.listNew(age);
        System.out.println(list);
        return list;
    }
}
