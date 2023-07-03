package com.example.demo.service.imps;


import com.example.demo.bean.Student;
import com.example.demo.dao.StudentDao;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class listStu implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> listStu() {
        List<Student> list = studentDao.listStu();
        return list;
    }
    public List<Student> listStuA(int age) {
        List<Student> list = studentDao.listStuA(age);
        return list;
    }
}
