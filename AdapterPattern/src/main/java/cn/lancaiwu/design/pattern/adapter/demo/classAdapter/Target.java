package cn.lancaiwu.design.pattern.adapter.demo.classAdapter;

/**
 * 目标角色，定义把其他类转换为我们期望的角色
 */
public class Target implements AbstractTarget {
    @Override
    public void target() {
        System.out.println("qzs 实现目标方法");
    }
}