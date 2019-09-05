package cn.itcast.demo1;
/*
    抽象类解释:
        有抽象方法的类就是抽象类, 用abstract关键字修饰.

    抽象方法解释:
        没有方法体的方法就是抽象方法, 用abstract关键字修饰.

    抽象方法的由来:
        当需要定义一个方法，却不明确方法的具体实现时，可以将方法定义为abstract，具体实现延迟到子类

 */

public class Test {
    public static void main(String[] args) {
        //测试狗类
        Dog dog = new Dog();
        dog.eat();
        //测试老鼠类
        Mouse mouse = new Mouse();
        mouse.eat();
        System.out.println("-------------------");
        //通过多态进行测试.
        Animal an = new Dog();
        an.eat();


    }
}
