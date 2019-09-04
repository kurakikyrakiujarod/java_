package cn.itcast.demo6;

public class TestStudent {
    public static void main(String[] args) {
        //需求: 通过空参创建对象.
        Student stu1 = new Student();
        stu1.setName("张无忌");
        stu1.setAge(23);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println("-------------------");

        //需求: 通过全参创建对象.
        Student stu2 = new Student("韦小宝", 40);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
    }
}
