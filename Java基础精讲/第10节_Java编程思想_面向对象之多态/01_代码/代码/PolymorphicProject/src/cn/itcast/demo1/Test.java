package cn.itcast.demo1;

/*
     动物类案例:
         已知父类Animal, 成员变量为: 姓名, 成员方法为: eat()方法.
         其有一子类Dog类, 请用该案例模拟多态.
  */
public class Test {
    public static void main(String[] args) {
        //需求: 演示多态
        /*
            Java中实现多态的三个步骤:
                1. 要有继承(或者实现)关系.
                2. 要有方法重写.
                3. 要有父类引用指向子类对象.
         */
        //多态
        Animal an = new Dog();

        //测试成员方法的调用
        //结论: 多态中调用成员方法是编译看左(左边的类型有没有这个成员),
        //     运行看右(运行时具体用的是右边类中的该成员).
        an.setName("哈士奇");
        an.eat();
    }
}
