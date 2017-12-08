package cn.com.gree.example.exampleMybatis.xml;

import cn.com.gree.entity.Student;
import java.util.List;

public interface StudentMapper extends MyMapper<Student> {
    List<Student> likeName(String name);
    Student getById(int id);
    String getNameById(int id);
}
