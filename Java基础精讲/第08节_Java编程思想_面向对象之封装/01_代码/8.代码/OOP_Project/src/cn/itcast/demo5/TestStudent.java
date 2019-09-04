package cn.itcast.demo5;

/*
    构造方法:
        作用: 用来初始化对象的.
        格式:
            修饰符 构造方法名(参数列表) {
                //方法体
            }
        要求:
            构造方法名必须和类名相同(包括大小写)
            构造方法没有返回值(但是里边可以写return)
            构造方法没有返回值类型(连void都不能写)
       注意:
            若未提供任何构造方法，系统会给出默认无参构造
            若已提供任何构造方法，系统不再提供无参构造
            构造方法可以重载
 */
public class TestStudent {
    public static void main(String[] args) {
        //需求: 定义一个姓名叫: 张三, 年龄为: 23 的学生
        //格式一: 通过无参构造实现.
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(23);

        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println("--------------------");

        //格式二: 通过构造方法实现快速初始化.
        Student stu2 = new Student("李四", 24);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());

    }
}
