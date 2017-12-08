package cn.com.gree.example.ExampleSFL;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ServletApplication1 {

  /*  @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return new ServletRegistrationBean(new MyServlet(),"/wfc/*");
    }*/



    public static void main(String[] args){
        SpringApplication.run(ServletApplication1.class,args);
    }

}
