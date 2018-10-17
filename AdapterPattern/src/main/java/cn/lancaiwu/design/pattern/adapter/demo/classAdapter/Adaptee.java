package cn.lancaiwu.design.pattern.adapter.demo.classAdapter;

/**
 * 初始角色，即我们原始的类和接口对象，如“A->B”，其中 A就是初始角色，它是一直存在的
 */
public class Adaptee {
    //初始的方法
    public void adaptee() {
        System.out.println("qzs 初始的逻辑");
    }
}