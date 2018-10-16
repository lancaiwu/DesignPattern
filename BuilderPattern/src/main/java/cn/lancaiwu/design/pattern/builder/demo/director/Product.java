package cn.lancaiwu.design.pattern.builder.demo.director;

public class Product {
    public int partB;
    public int partA;

    public int getPartA() {
        return partA;
    }

    public void setPartA(int partA) {
        this.partA = partA;
    }

    public int getPartB() {
        return partB;
    }

    public void setPartB(int partB) {
        this.partB = partB;
    }

    @Override
    public String toString() {
        return "partA : " + partA + "   partB : " + partB;
    }
}
