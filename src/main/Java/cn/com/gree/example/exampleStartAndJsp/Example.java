package cn.com.gree.example.exampleStartAndJsp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* @RestController 注解，该注解是Spring 4.0引入的。查
* 看源码可知其包含了 @Controller 和 @ResponseBody 注解。
* 我们可以理解为 @Controller的增强版。专门为响应内容式的 Controller 而设计的，可以直接响应对象为JSON。
*
* */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/home")
    String home(){
        return "Hello World!";
    }

    @RequestMapping("/hello/{requestName}")
    public String index(@PathVariable String requestName){
        return "Hello," + requestName + "!!!";
    }

    @RequestMapping("/map")
    public Map<String,String> getMap(@RequestParam String name){
        Map<String,String> map = new HashMap<String, String>();
        map.put("name",name);
        return map;
    }
   @RequestMapping("/list")
    public List<Map<String,String>> getList(){
       List<Map<String, String>> list = new ArrayList<Map<String, String>>();
       Map<String, String> map;
       for (int i = 1; i <= 5; i++) {
           map = new HashMap<String, String>();
           map.put("name", "wfc--" + i);
           list.add(map);
       }
       return list;
   }

   //test

}
