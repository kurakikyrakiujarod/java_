package cn.itcast.demo;

/*
    包装类:
        简介
            基本数据类型不是对象，所以Java针对基本类型提供了对应的包装类，以对象的形式来使用。

            基本类型                对应的           包装类(可以理解为: 就是引用类型)
            byte                                    Byte
            short                                   Short
            int                                     Integer
            long                                    Long
            char                                    Character
            float                                   Float
            double                                  Double
            boolean                                 Boolean
        装箱
            基本类型转包装类型（对象类型）
        拆箱
            包装类型（对象类型）转基本类型

        成员方法
            static 基本类型 parseXxx(String)：  将字符串类型的数据转换成对应的基本类型
            例如:
               static int parseInt(String)：  将字符串类型的整数转换成对应的int类型的整数
        注意:
            除了Character类以外, 其他的7种包装类都有parseXXX()方法.
            因为如果字符串想转换成char类型的数据, 可以通过: String类中的方法toCharArray(), charAt();
 */
public class Test {
    public static void main(String[] args) {
        //因为变量a属于基本类型, 不能通过 对象名. 的形式调用方法.
        //解决方案: 将其转换成对应的 包装类(引用类型)即可.
        int a = 10;

        //装箱
//        Integer i1 = new Integer(20);
        Integer i1 = 20;
        //拆箱
        int b = i1.intValue();
        System.out.println(i1);
        System.out.println(b);
        System.out.println("------------------");

        //JDK5的新特性, 自动拆装箱.
        Integer i2 = 30;        //装箱
        int c = i2;             //拆箱
        System.out.println("---------------------------");

        //需求: 将字符串类型的"10", 转换成int类型的 10
        String s = "10";
        int num = Integer.parseInt(s);
        System.out.println("num: " + num);
        System.out.println("num + 100 = " + (num + 100));

    }
}
