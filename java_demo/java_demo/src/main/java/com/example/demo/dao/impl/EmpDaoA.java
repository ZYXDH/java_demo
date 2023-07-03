package com.example.demo.dao.impl;

import com.example.demo.bean.Table;
import com.example.demo.dao.EmpDao;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmpDaoA implements EmpDao {
    @Override
    public List<Table> listEmp() {
        List list = new ArrayList<>();
        Table ctx=new Table();
        ctx.setId(1);
        ctx.setDesc("123");
        list.add(ctx);
        return list;
    }
}
