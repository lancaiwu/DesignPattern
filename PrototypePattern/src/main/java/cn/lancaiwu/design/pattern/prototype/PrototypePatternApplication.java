package cn.lancaiwu.design.pattern.prototype;

import cn.lancaiwu.design.pattern.prototype.demo.TestDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 原型模式：
 *
 *      使用原型实例指定待创建对象的类型，并且通过复制这个原型来创建新的对象。
 *
 *   实现原型模式，必须实现Cloneable接口，而这个接口里面是空的。
 *
 * 克隆某个对象有浅克隆和深克隆
 *
 * 1、浅克隆：copy该对象，然后保留该对象原有的引用。也就是说不克隆该对象的属性。
 *
 * 2、深克隆：copy该对象，并且把该对象的所有属性也克隆出一份新的。
 *
 */
@SpringBootApplication
public class PrototypePatternApplication {

    public static void main(String[] args) {
        TestDemo.start();
        SpringApplication.run(PrototypePatternApplication.class, args);
    }
}
