package cn.itcast.demo;

public class ForDemo2 {
    public static void main(String[] args) {
        //需求1: 打印1~5之间的数字
        //方式一: 传统做法
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println("---------------");

        //通过观察上述的代码,我们发现: 输出语句的次数是固定的, 只有输出语句里边的内容在发生变化.
        //针对于这种情况, 就可以采用for循环来解决
        //方式二: 采用for循环
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("---------------");

        //需求2: 打印5~1之间的数字
        for(int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
