package cn.lancaiwu.design.factorypattern.demo.abstractfactorypattern;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
