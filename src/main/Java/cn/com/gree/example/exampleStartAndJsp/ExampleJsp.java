package cn.com.gree.example.exampleStartAndJsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;


/*
* 测试该示例时，按照运行Example.java的方式，即直接运行，是不可以的，必须使用mvn spring-boot:run命令行
* 才可以执行出结果
* 问题是由main方式启动与mvn spring-boot:run启动时的classpath不同引起的
* 通过main启动后classpath缺少tomcat-embed-jasper.jar；
* 解决方法：去掉将pom.xml中tomcat-embed-jasper依赖provided
* */
@Controller
@EnableAutoConfiguration
public class ExampleJsp {

    // 从 application.properties 中读取配置，如取不到默认值为Hello wfc
    @Value("${application.hello:Hello wfc}")
    private  String hello = "Hello wfc";

    /**
     * 默认页<br/>
     * @RequestMapping("/") 和 @RequestMapping 是有区别的
     * 如果不写参数，则为全局默认页，加入输入404页面，也会自动访问到这个页面。
     * 如果加了参数“/”，则只认为是根页面。
     */
    @RequestMapping(value = {"/","/index"})
    public String index(Map<String, Object> model){
        // 直接返回字符串，框架默认会去 spring.view.prefix 目录下的 （index拼接spring.view.suffix）页面
        // 本例为 /WEB-INF/jsp/index.jsp
        model.put("time", new Date());
        model.put("message", this.hello);
        return "index";
    }

    /**
     * 响应到JSP页面pageOne
     */
    @RequestMapping("/pageOne")
    public ModelAndView pageOne(){
        // 页面位置 /WEB-INF/view/page.jsp
        ModelAndView mav = new ModelAndView("page");
        mav.addObject("content", hello);
        return mav;
    }

    /**
     * 响应到JSP页面pageOne（可以直接使用Model封装内容，直接返回页面字符串）
     *
     */
    @RequestMapping("/pageTwo")
    public String pageTwo(Model model){
        // 页面位置 /WEB-INF/view/page.jsp
        model.addAttribute("content", hello + "（第二种）");
        return "page";
    }

}
