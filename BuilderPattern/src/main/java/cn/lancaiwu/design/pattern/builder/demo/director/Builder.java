package cn.lancaiwu.design.pattern.builder.demo.director;

public abstract class Builder {
    /**
     * 创建零件A
     *
     * @param partA
     */
    public abstract void buildPartA(int partA);

    /**
     * 创建零件b
     *
     * @param partB
     */
    public abstract void buildPartB(int partB);

    /**
     * 组装
     *
     * @return
     */
    public abstract Product build();
}