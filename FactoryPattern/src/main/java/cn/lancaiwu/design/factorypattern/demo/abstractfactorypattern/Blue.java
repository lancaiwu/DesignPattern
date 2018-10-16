package cn.lancaiwu.design.factorypattern.demo.abstractfactorypattern;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}