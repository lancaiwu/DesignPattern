package cn.lancaiwu.design.pattern.adapter.demo.objectAdapter;

/**
 * 对象适配器：依赖于对象的组合，都是采用对象组合的方式，也就是对象适配器实现的方式。
 */
public class M5DataLineAdapter implements Target {

    private Target target;

    public M5DataLineAdapter(Target target) {
        this.target = target;
    }

    @Override
    public void connection() {
        System.out.println("插入 type-c 转接头");
        target.connection();
    }
}