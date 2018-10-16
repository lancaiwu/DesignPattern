package cn.lancaiwu.design.factorypattern;

import cn.lancaiwu.design.factorypattern.demo.abstractfactorypattern.AbstractFactoryPatternDemo;
import cn.lancaiwu.design.factorypattern.demo.factorymethod.FactoryPatternDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * http://www.runoob.com/design-pattern/factory-pattern.html
 *
 * 工厂模式
 * 1）简单工厂模式（Simple Factory）
 *          简单工厂实际不能算作一种设计模式
 * 2）工厂方法模式（Factory Method）
 *          定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个，工厂方法让类把实例化推迟到了子类。
 * 3）抽象工厂模式（Abstract Factory）
 *          提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。
 */
@SpringBootApplication
public class FactoryPatternApplication {

    public static void main(String[] args) {
        // FactoryPatternDemo.start();
        AbstractFactoryPatternDemo.start();
        SpringApplication.run(FactoryPatternApplication.class, args);
    }
}
