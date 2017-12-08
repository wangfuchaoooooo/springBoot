package cn.com.gree.example.exampleMybatis.annotation;

import cn.com.gree.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stu")
public class MyBatisController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/getById")
    public Student getById(@RequestParam int id){
      Student list = studentMapper.getById(id);
        return list;
    }
}
