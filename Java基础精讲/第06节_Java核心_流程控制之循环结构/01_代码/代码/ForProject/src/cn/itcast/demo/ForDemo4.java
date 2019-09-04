package cn.itcast.demo;

public class ForDemo4 {
    public static void main(String[] args) {
        //需求: 计算1~100之间的所有偶数和.
        //1. 定义一个求和变量sum.
        int sum = 0;
        //2. 获取1~100之间所有的数据.
        for(int i = 1; i <= 100; i++) {
            //循环体
            //i的值其实就是1~100之间的数字, 只要判断i是否是偶数即可.
            //3. 判断当前获取到的数据是否是偶数, 是就累加.
            if(i % 2 == 0) {
                //能走到这里, 说明i是偶数, 累加即可.
                sum += i;
            }
        }
        //4. 打印结果.
        System.out.println("sum: " + sum);
    }
}
