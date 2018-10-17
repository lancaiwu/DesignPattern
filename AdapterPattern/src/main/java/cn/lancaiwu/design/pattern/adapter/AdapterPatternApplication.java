package cn.lancaiwu.design.pattern.adapter;

import cn.lancaiwu.design.pattern.adapter.demo.TestDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 适配器模式
 *          1、类适配器模式     类适配器：对象继承的方式，静态的定义。
 *          2、对象适配器模式   对象适配器：依赖于对象的组合，都是采用对象组合的方式，也就是对象适配器实现的方式。
 *
 * 适用场景
 * 1，系统需要使用现有的类，但现有的类却不兼容。
 * 2，需要建立一个可以重复使用的类，用于一些彼此关系不大的类，并易于扩展，以便于面对将来会出现的类。
 * 3，需要一个统一的输出接口，但是输入类型却不可预知。
 *
 *
 *      建议尽量使用对象的适配器模式，少用继承
 */
@SpringBootApplication
public class AdapterPatternApplication {

    public static void main(String[] args) {
        TestDemo.start();
        SpringApplication.run(AdapterPatternApplication.class, args);
    }
}
