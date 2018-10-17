package cn.lancaiwu.design.pattern.adapter.demo.classAdapter;

/**
 * 适配器角色
 * <p>
 * 类适配器：对象继承的方式，静态的定义。
 *
 * <p>
 * 适配器需要新创建，通过继承等方式把初始角色转换成为目标角色。
 */
public class Adapter extends Adaptee implements AbstractTarget {
    @Override
    public void target() {
        adaptee();
    }
}