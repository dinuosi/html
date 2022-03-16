package cn.tedu;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scanner.nextLine();
        System.out.println("请输入密码");
        String passward = scanner.nextLine();
        try (Connection conn = DBUtils.getConn()){
            Statement s = conn.createStatement();
            s.executeUpdate("insert into user value (null,'"+username+"','"+passward+"',null)");
            System.out.println("注册完成!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
