package cn.itcast.demo4;

public class TestStudent {
    public static void main(String[] args) {
        //需求1: 调用show()方法

        Student stu = new Student();
        stu.show();
        System.out.println("--------------");


        //需求2: 按照格式, 优化setAge()中的参数名, 并调用.
        //设置年龄
        stu.setAge(50);
        //获取年龄
        System.out.println(stu.getAge());
    }
}
