package cn.tedu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scanner.nextLine();
        System.out.println("请输入密码");
        String password = scanner.nextLine();
        System.out.println("请输入昵称");
        String nick = scanner.nextLine();

        try (Connection conn = DBUtils.getConn()){
            String sql = "select id from user where username=?";
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println("用户名已存在");
                return;
            }
            String regSql = "insert into user values(null,?,?,?)";
            PreparedStatement regPs= conn.prepareStatement(regSql);
            regPs.setString(1,username);
            regPs.setString(2,password);
            regPs.setString(3,nick);
            regPs.executeUpdate();
            System.out.println("注册完成!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
