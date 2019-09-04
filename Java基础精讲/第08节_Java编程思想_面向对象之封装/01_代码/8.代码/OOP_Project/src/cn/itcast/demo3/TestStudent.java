package cn.itcast.demo3;

public class TestStudent {
    public static void main(String[] args) {
        /*
                private:
                    概述:
                        私有的意思, 是一种访问权限修饰符, 用来修饰类的成员.
                    特点:
                        被他修饰的成员只能在本类中访问.
                    结论:
                        private一般用来修饰成员变量,
                        public一般用来修饰成员方法.
         */
        //创建学生类的对象.
        Student stu = new Student();
       /*//给它的年龄赋值为23(设置值)
        stu.age = -23;
        //打印结果(获取值)
        System.out.println(stu.age);*/

       //设置值
        stu.name = "张三";
        stu.setAge(23);
        //获取值
        System.out.println(stu.getAge());

        //需求: 调用成员方法
        stu.study();
    }
}
