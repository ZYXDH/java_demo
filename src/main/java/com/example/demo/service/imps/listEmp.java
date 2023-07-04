package com.example.demo.service.imps;


import com.example.demo.bean.Table;
import com.example.demo.dao.EmpDao;
import com.example.demo.dao.impl.EmpDaoA;
import com.example.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class listEmp implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public List<Table> listEmp() {
        List<Table> empList = empDao.listEmp();

        empList.stream().forEach(emp->{
            String desc=emp.getDesc();
            if("123".equals(desc)){
                emp.setDesc("321");
            }
        });

        return empList;
    }
}
