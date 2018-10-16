package cn.lancaiwu.design.pattern.prototype.demo.deepclone;

import java.util.Date;

/**
 * 原型模式:  深  克隆
 * <p>
 * 1、Cloneable是一个空接口（标记接口），是一个规范。但是如果要克隆这个类对象的话必须实现Cloneable接口
 * 2、重写 clone 方法 ， return super.clone();
 */
public class DeepSheep implements Cloneable {
    private String sname;
    private Date birthday;

    public DeepSheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    /**
     * 重写Object对象的clone方法
     *
     * 并将引用对象也进行clone ，并设置值，再返回
     */
    @Override
    public Object clone() {
        //直接调用Object对象的clone方法
        try {
            Object object = super.clone();
            DeepSheep sheep = (DeepSheep) object;
            sheep.birthday = (Date) this.birthday.clone();
            return sheep;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    //省略get，set方法和构造方法
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}