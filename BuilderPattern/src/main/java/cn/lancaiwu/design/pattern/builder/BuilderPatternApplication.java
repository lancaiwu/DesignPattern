package cn.lancaiwu.design.pattern.builder;

import cn.lancaiwu.design.pattern.builder.demo.TestDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 建造者模式中，有如下四种角色：
 * 1.抽象建造者（Builder）：该绝是用于规范产品的各个组成部分，并进行抽象，一般独立于应用程序的逻辑。
 * 2.具体建造者（Concrete Builder）：该角色实现抽象建造者中定义的所有方法，并且返回一个组件好的产品实例。
 * 3.产品（Product）：该角色是建造者中的复杂对象，一个系统中会有多个产品类，这些产品类不一定有共同的接口，可以是完成不相关的。
 * 4.导演者（Director）：该角色负责安排已有模块的顺序，然后告诉Builder开始建造
 * <p>
 * ---------------------
 * <p>
 * Director 类
 * <p>
 * 统一组装过程，同样值得注意的是，
 * 在现实开发过程中，Director 角色也经常会被省略，
 * 而直接使用一个 Builder 来进行对象的组装，
 * 这个 Builder 通常为链式调用，也就是上面提到的 fluent interface ，
 * 它的关键点是每个 setter 方法都返回自身，也就是 return this，
 * 这样就使得 setter 方法可以链式调用，最典型的仍然是 AlertDialog.Builder 类，
 * 使用这种方式不仅去除了 Director 角色，
 * 使得整个结构更加简单，也能对 Product 对象的组件过程有着更精细的控制。
 */
@SpringBootApplication
public class BuilderPatternApplication {

    public static void main(String[] args) {
        TestDemo.start();
        SpringApplication.run(BuilderPatternApplication.class, args);
    }
}
