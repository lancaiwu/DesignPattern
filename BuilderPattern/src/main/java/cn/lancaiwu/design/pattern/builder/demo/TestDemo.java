package cn.lancaiwu.design.pattern.builder.demo;

import cn.lancaiwu.design.pattern.builder.demo.dialog.OpTaskBean;
import cn.lancaiwu.design.pattern.builder.demo.dialog.OpTaskBuilder;
import cn.lancaiwu.design.pattern.builder.demo.director.Builder;
import cn.lancaiwu.design.pattern.builder.demo.director.ConcreteBuilder;
import cn.lancaiwu.design.pattern.builder.demo.director.Director;
import cn.lancaiwu.design.pattern.builder.demo.director.Product;

import java.util.HashMap;

public class TestDemo {
    public static void start() {
        /**
         * Director 类 指导创建
         */
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct(1, 2);
        Product product = builder.build();
        System.out.println(product.toString());

        /**
         * Builder 类 不断set 创建
         */
        OpTaskBean opTaskBean = new OpTaskBuilder()
                .addDeviceId(1)
                .addTaskType(1)
                .addTaskLevel(2)
                .addData(new HashMap<>())
                .build();

        System.out.println(opTaskBean.toString());

    }
}
