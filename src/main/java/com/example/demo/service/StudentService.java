package com.example.demo.service;

import com.example.demo.bean.Student;

import java.util.List;

public interface StudentService {
     List<Student> listStu();
    List<Student> listStuA(int age);
}
