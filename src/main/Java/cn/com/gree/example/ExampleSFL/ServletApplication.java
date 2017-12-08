package cn.com.gree.example.ExampleSFL;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class ServletApplication {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return new ServletRegistrationBean(new MyServlet(),"/");
    }

    @Bean
    public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(dispatcherServlet);
        servletRegistrationBean.getUrlMappings().clear();
        servletRegistrationBean.addUrlMappings("*.do");
        servletRegistrationBean.addUrlMappings("*.action");
        return servletRegistrationBean;
    }

    public static void main(String[] args){
        SpringApplication.run(ServletApplication.class,args);
    }

}
