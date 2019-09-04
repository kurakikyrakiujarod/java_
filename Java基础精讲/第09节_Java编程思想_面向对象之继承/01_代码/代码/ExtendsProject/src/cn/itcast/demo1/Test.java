package cn.itcast.demo1;

//测试类
public class Test {
    //main函数是程序的主入口, 所有的代码都是从这里开始执行的.
    public static void main(String[] args) {
        //创建Child类的对象
        Child c = new Child();

        //给对象c的姓名设置为: 张三.
        c.setName("张三");
        //c.name = "李四";

        //打印姓名的值
        System.out.println(c.getName());

        /*
            Java中, 子类只能继承父类的非私有成员(成员变量, 成员方法)
         */
    }
}
