package cn.lancaiwu.design.singleton.pattern.demo.stati;

/**
 * 通过static静态代码块 初始化 单例
 */
public class Singleton6 {
    // 私有构造
    private Singleton6() {
    }

    private static Singleton6 single = null;

    // 静态代码块
    static {
        single = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return single;
    }
}
