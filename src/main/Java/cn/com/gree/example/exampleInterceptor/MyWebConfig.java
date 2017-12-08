package cn.com.gree.example.exampleInterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebConfig extends WebMvcConfigurerAdapter{

    // 多个拦截器组成一个拦截器链
    // addPathPatterns 用于添加拦截规则
    // excludePathPatterns 用户排除拦截
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(new MyInterceptor1()).excludePathPatterns("/");
        registry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/");
        super.addResourceHandlers(registry);
    }
}
