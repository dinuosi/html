package cn.tedu;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBUtils {

    private static DruidDataSource dds;

    static {
        dds = new DruidDataSource();
        //设置数据库连接信息
        dds.setUrl("jdbc:mysql://localhost:3306/empdb?characterEncoding=utf8&serverTimezone=Asia/Shanghai");
        dds.setUsername("root");
        dds.setPassword("root");
        dds.setInitialSize(3);//设置初始连接数量
        dds.setMaxActive(5);//设置最大连接数量
    }
    public static Connection getConn() throws SQLException {

        Connection conn = dds.getConnection();
        System.out.println("连接:"+conn);
        return conn;
    }
}
