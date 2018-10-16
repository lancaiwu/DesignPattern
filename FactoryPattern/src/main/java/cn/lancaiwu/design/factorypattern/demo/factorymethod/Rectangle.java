package cn.lancaiwu.design.factorypattern.demo.factorymethod;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
