package cn.tedu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo02 {
    public static void main(String[] args) throws SQLException {

        //1. 获取数据库连接 导包java.sql 异常抛出 参数:数据库连接地址,用户名,密码
        Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?characterEncoding=utf8&serverTimezone=Asia/Shanghai",
                        "root","root");
        System.out.println("连接对象:"+conn);
        //2. 创建执行SQL语句的对象
        Statement s = conn.createStatement();
        //3. 执行SQL语句 execute执行
        s.execute("drop table jdbct1");
        //4. 关闭连接
        conn.close();
        System.out.println("删除完成!");
    }
}
