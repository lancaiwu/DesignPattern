package cn.lancaiwu.design.pattern.builder.demo.director;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(int partA, int partB) {
        builder.buildPartA(partA);
        builder.buildPartB(partB);
    }
}
