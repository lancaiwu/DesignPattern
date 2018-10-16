package cn.lancaiwu.design.singleton.pattern;

import cn.lancaiwu.design.singleton.pattern.demo.SingletonPatternDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternApplication {

    public static void main(String[] args) {
        SingletonPatternDemo.start();
        SpringApplication.run(PatternApplication.class, args);
    }
}
