package cn.tedu.boot21.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//相当于在Controller注解基础上给所有方法都添加了@ResponseBody注解
@RestController
public class UserController {
    @RequestMapping("/reg")
    public String reg() {
        return "注册成功";
    }

}
