package cn.lancaiwu.design.pattern.prototype.demo;

import cn.lancaiwu.design.pattern.prototype.demo.deepclone.DeepSheep;
import cn.lancaiwu.design.pattern.prototype.demo.shallowclone.ShallowSheep;

import java.util.Date;

/**
 * 原型模式 --- 浅克隆
 * <p>
 * 原型模式 --- 深克隆
 *
 * 浅深 克隆的区别就是 在 clone 方法里面，深克隆
 */
public class TestDemo {
    public static void start() {
        {
            /**
             * 浅 克隆
             */
            System.out.println("原型模式 ---------------浅克隆------------------开始");
            Date date = new Date(1274397294739L);
            ShallowSheep s1 = new ShallowSheep("原型羊", date);
            ShallowSheep s2 = (ShallowSheep) s1.clone();//克隆一个羊
            System.out.println(s1);
            System.out.println(s1.getSname());
            System.out.println("原日期：" + s1.getBirthday());

            date.setTime(34732834827389L);//改变原有date的值
            System.out.println("改变后的日期：" + date.toString());
            s1.setSname("咩咩羊");

            //克隆羊的信息
            System.out.println("---------------------------------");
            System.out.println(s2);
            System.out.println(s2.getSname());
            System.out.println(s2.getBirthday());//此时的birthday日期使用的是改变后的日期对象引用

            System.out.println("原型模式 ---------------浅克隆------------------完成");
            System.out.println("\n\n");

        }
        {
            /**
             * 深 克隆
             */
            System.out.println("原型模式 ---------------深克隆------------------开始");
            Date date = new Date(1274397294739L);
            DeepSheep s1 = new DeepSheep("原型羊", date);
            DeepSheep s2 = (DeepSheep) s1.clone();//克隆一个羊
            System.out.println(s1);
            System.out.println(s1.getSname());
            System.out.println("原日期：" + s1.getBirthday());

            date.setTime(34732834827389L);//改变原有date的值
            System.out.println("改变后的日期：" + date.toString());
            s1.setSname("咩咩羊");

            //克隆羊的信息
            System.out.println("---------------------------------");
            System.out.println(s2);
            System.out.println(s2.getSname());
            System.out.println(s2.getBirthday());//此时的birthday日期使用的是改变后的日期对象引用
            System.out.println("原型模式 ---------------深克隆------------------完成");
        }
    }
}
