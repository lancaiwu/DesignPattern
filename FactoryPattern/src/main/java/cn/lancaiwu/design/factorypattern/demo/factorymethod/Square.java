package cn.lancaiwu.design.factorypattern.demo.factorymethod;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}