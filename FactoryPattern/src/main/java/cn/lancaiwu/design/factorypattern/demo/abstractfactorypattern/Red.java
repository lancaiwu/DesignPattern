package cn.lancaiwu.design.factorypattern.demo.abstractfactorypattern;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}