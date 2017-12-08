package cn.com.gree.example.exampleStartAndJsp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyStartUpRunner implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>服务0启动中...<<<<<<<<");
    }
}
