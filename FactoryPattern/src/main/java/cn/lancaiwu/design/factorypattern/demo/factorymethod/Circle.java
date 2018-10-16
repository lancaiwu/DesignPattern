package cn.lancaiwu.design.factorypattern.demo.factorymethod;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}