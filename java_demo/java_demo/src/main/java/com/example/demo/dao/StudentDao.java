package com.example.demo.dao;

import com.example.demo.bean.Student;

import java.util.List;

public interface StudentDao {
     List<Student> listStu();
    List<Student> listStuA(int age);
}
