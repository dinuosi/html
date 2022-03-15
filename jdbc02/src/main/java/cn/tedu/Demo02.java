package cn.tedu;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("请输入英雄名");
        String name = scanner.nextLine();
        System.out.println("请输入价格");
        double money = scanner.nextDouble();
        try(Connection conn = DBUtils.getConn()) {
            Statement s = conn.createStatement();
            s.executeUpdate("insert into hero values(null,'"+name+"',"+money+")");
            System.out.println("添加完成");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
