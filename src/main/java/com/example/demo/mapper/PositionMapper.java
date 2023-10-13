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
    int updatePos(@Param("nameValue") String nameValue,@Param("rotate") String rotate,@Param("xValue") float xValue,@Param("yValue") float yValue,@Param("zValue") float zValue,@Param("typeValue") String typeValue);
    int deletePos(@Param("name") String name);
    int addPos(@Param("name") String name,@Param("rotate") String rotate,@Param("x") float x,@Param("y") float y,@Param("z") float z,@Param("type") String type);
}
