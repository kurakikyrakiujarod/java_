package cn.itcast.demo7;

//子类
public class Worker extends  Person {
    public Worker() {
        //super();    //用于初始化父类成员的.
        super("小黑");
        System.out.println("Worker类的 空参构造");
    }
}
