package cn.com.gree.example.exampleStartAndJsp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class MyStartUpRunner1 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>服务1启动中...<<<<<<<<");
    }
}
