package cn.com.gree.example.exampleMybatis.xml;

import cn.com.gree.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class MyBatisController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/likeName")
    public List<Student> likeName(@RequestParam String name){
      List<Student> list = studentMapper.likeName(name);
        return list;
    }
}
