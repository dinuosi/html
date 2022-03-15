package cn.tedu;

import java.sql.*;

public class Demo06 {
    public static void main(String[] args) throws SQLException {

        //1. 获取数据库连接 导包java.sql 异常抛出 参数:数据库连接地址,用户名,密码
        Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb?characterEncoding=utf8&serverTimezone=Asia/Shanghai",
                        "root","root");
        System.out.println("连接对象:"+conn);
        //2. 创建执行SQL语句的对象
        Statement s = conn.createStatement();
        //3. 执行查询
        ResultSet rs =s.executeQuery("select name,sal from emp");
        while (rs.next()){
           /* String name = rs.getString("name");
            double sal = rs.getDouble("sal");
            System.out.println(name+":"+sal);*/
            String name = rs.getString(1);
            double sal = rs.getDouble(2);
            System.out.println(name+":"+sal);
        }
        //4. 关闭连接
        conn.close();
        System.out.println("执行完成");
    }
}
