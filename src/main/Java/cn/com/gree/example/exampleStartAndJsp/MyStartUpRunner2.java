package cn.com.gree.example.exampleStartAndJsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class MyStartUpRunner2 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>服务2启动中...<<<<<<<<");
    }
}
