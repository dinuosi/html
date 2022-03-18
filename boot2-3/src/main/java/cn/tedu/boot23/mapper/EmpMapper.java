package cn.tedu.boot23.mapper;

import cn.tedu.boot23.entity.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpMapper {
    //#{变量} 会自动查找方法参数列表中的同名变量,如果没有同名变量
    //会查找自定义对象类型里面的同名属性并调用get变量的方法
    @Insert("insert into myemp values(null,#{name},#{sal},#{job})")
    void insert(Emp emp);



}
