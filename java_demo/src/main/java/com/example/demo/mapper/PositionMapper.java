package com.example.demo.mapper;

import com.example.demo.bean.Position;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface PositionMapper {
    List<Position> list();
    void updatePos(@Param("nameValue") String nameValue,@Param("xValue") float xValue,@Param("yValue") float yValue,@Param("zValue") float zValue,@Param("typeValue") String typeValue);
}
