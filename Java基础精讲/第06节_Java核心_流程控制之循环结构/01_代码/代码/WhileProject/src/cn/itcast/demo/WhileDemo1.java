package cn.itcast.demo;

/*
        while循环的格式:
            初始化语句;
            while(判断条件语句) {
                循环体语句;
                控制条件语句;
            }
     */
public class WhileDemo1 {
    public static void main(String[] args) {
        //需求: 打印5次HelloWorld
        //方式一: 通过for循环实现
        //初始化语句;  判断条件语句;  控制条件语句
        for(int i = 1; i <= 5; i++) {
            //循环体语句
            System.out.println("HelloWorld");
        }
        System.out.println("---------------");

        //方式二: 通过while循环实现
        //初始化语句
        int i = 1;
        //判断条件语句
        while(i <= 5) {
            //循环体语句
            System.out.println("HelloWorld");
            //控制条件语句
            i++;
        }
    }
}
