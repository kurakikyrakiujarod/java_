package cn.itcast.demo;

public class WhileDemo2 {
    public static void main(String[] args) {
        //需求: 计算1~100之间的所有数据之和.
        //1. 定义一个求和变量sum.
        int sum = 0;

        //2. 通过while循环, 获取1~100之间所有的数据.
        //初始化语句
        int a = 1;
        //判断语句
        while(a <= 100) {
            //循环体语句
            //3. 将获取到的数据累加给变量sum.
            sum += a;
            //控制条件语句
            a++;
        }
        //4. 将sum的结果打印到控制台上.
        System.out.println("sum: " + sum);
    }
}
