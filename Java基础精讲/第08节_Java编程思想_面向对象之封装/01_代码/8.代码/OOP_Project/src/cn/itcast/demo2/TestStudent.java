package cn.itcast.demo2;

/*
    学生类的测试类

        局部位置:
            方法的参数列表 或者 方法体语句(方法内部)

        成员位置:
           类中, 方法外.

        Java中使用变量的规则:
            使用变量遵循"就近原则", 如果局部位置有, 就使用.
            没有就去本类的成员位置找, 有就使用. 没有就报错.(先这么记忆, 不严谨)
 */
public class TestStudent {
    //main方法是程序的主入口, 所有的代码都是从这里开始执行的.
    public static void main(String[] args) {
        //1. 创建学生类的对象.
        Student s = new Student();

        //2. 给成员变量赋值, 并打印结果.
        s.name = "张三丰";
        s.age = 141;
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println("--------------");

        //3. 调用成员方法.
        s.study();

    }
}
