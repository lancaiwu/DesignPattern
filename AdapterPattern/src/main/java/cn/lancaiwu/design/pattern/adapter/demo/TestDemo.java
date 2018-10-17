package cn.lancaiwu.design.pattern.adapter.demo;

import cn.lancaiwu.design.pattern.adapter.demo.classAdapter.AbstractTarget;
import cn.lancaiwu.design.pattern.adapter.demo.classAdapter.Adapter;
import cn.lancaiwu.design.pattern.adapter.demo.classAdapter.Target;
import cn.lancaiwu.design.pattern.adapter.demo.objectAdapter.M5DataLine;
import cn.lancaiwu.design.pattern.adapter.demo.objectAdapter.M5DataLineAdapter;

/**
 * 1、类适配器
 * <p>
 * Target：目标角色，定义把其他类转换为我们期望的角色
 * Adaptee：初始角色，即我们原始的类和接口对象，如“A->B”，其中 A就是初始角色，它是一直存在的
 * Adapter：适配器角色，也就是我们今天的重点，适配器需要新创建，通过继承等方式把初始角色转换成为目标角色。
 * <p>
 * <p>
 * 2、对象适配器
 * <p>
 * 创建适配器类，实现标准接口，将这个调用委托给实现新接口的对象来处理
 */
public class TestDemo {
    public static void start() {
        /**
         * 类适配器
         */
        System.out.println("类适配器---------------");
        AbstractTarget abstractTarget = new Adapter();
        abstractTarget.target();

        /**
         * 对象适配器
         */
        System.out.println("\n\n对象适配器---------------");
        // 使用特殊功能类，即适配类
        cn.lancaiwu.design.pattern.adapter.demo.objectAdapter.Target adapter = new M5DataLineAdapter(new M5DataLine());
        adapter.connection();
    }
}
