package cn.com.gree.example.exampleMybatis.annotation;

import cn.com.gree.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StudentMapper extends MyMapper<Student> {

    List<Student> likeName(String name);

    @Select("select * from student where id = #{id}")
    Student getById(@Param("id") int id);
    String getNameById(int id);
}
