package cn.tedu.boot421.controller;

import cn.tedu.boot421.entity.Emp;
import cn.tedu.boot421.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @Autowired(required = false)
    EmpMapper mapper;

    @RequestMapping("/insert")
    public void insert(Emp emp){
        System.out.println("emp = " + emp);
        mapper.insert(emp);
    }
}
