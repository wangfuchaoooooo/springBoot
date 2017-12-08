package cn.com.gree.example.exampleMybatis.annotation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.com.gree.example.exampleMybatis.annotation")
public class ApplicationMyBatis_a {

    public static void main(String[] args){
        SpringApplication.run(ApplicationMyBatis_a.class,args);
    }

}
