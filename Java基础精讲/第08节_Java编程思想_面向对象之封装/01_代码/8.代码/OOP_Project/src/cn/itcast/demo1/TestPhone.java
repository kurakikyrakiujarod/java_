package cn.itcast.demo1;

/*
    手机类的测试类
 */
public class TestPhone {
    //main方法是程序的主入口, 所有代码的执行都是从这里开始的.
    public static void main(String[] args) {
        //1. 创建对象.
        Phone p = new Phone();

        //2. 调用成员变量, 并打印.
        //给成员变量赋值.
        p.brand = "苹果";
        p.model = "X";
        p.name = "程序猿";

        //打印成员变量的值.
        System.out.println(p.brand);
        System.out.println(p.model);
        System.out.println(p.name);

        //3. 调用成员方法.
        System.out.println("------------");
        p.call("乔布斯");
        p.sendMessage();
        p.playGame();
    }
}
