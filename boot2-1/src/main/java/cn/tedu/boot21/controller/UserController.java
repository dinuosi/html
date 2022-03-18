package cn.tedu.boot21.controller;


import cn.tedu.boot21.entity.User;
import cn.tedu.boot21.utils.DBUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//相当于在Controller注解基础上给所有方法都添加了@ResponseBody注解
@RestController
public class UserController {
    @RequestMapping("/reg")
    public String reg(User user) {
        System.out.println("user="+user);

        try (Connection conn = DBUtils.getConn();){
            String sql = "insert into user values(null,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getNick());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return "注册成功";
    }

    @RequestMapping("/login")
    public String login(User user){
        System.out.println("user="+user);

        try (Connection conn = DBUtils.getConn();){
            String sql = "select password from user where username=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                String pw = rs.getString(1);
                if (pw.equals(user.getPassword())){
                    return "登陆成功!";
                }else{
                    return "密码错误";
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return "用户名不存在";
    }

}
