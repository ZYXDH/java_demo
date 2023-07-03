package com.example.demo.mapper;

import com.example.demo.bean.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface StudentMapper {
    List<Student>list();
    List<Student>listNew(int age);
}
