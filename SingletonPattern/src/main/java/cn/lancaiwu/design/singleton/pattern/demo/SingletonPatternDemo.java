package cn.lancaiwu.design.singleton.pattern.demo;

import cn.lancaiwu.design.singleton.pattern.demo.lanhan.Singleton4;

/**
 * 单例模式特点：
 * 　　1、单例类只能有一个实例。
 * 　　2、单例类必须自己创建自己的唯一实例。
 * 　　3、单例类必须给所有其他对象提供这一实例。
 */
public class SingletonPatternDemo {
    public static void start() {
        //获取唯一可用的对象
        Singleton4 object = Singleton4.getInstance();
        //显示消息
        object.showMessage();
    }
}