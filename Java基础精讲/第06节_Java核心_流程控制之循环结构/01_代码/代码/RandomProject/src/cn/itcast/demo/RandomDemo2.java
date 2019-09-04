package cn.itcast.demo;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo2 {
    public static void main(String[] args) {
          /*
            案例: 猜数字的小游戏
                 系统产生一个1-100之间的随机数，请猜出这个数是多少。
         */
          //1. 获取一个1-100之间的随机数, 让用户猜.
        //1.1 创建Random类的对象
        Random r = new Random();
        //1.2 获取指定范围的随机数.
        int num = r.nextInt(100) + 1;   //r.nextInt(100) -->  0 - 99

        //2. 通过键盘录入获取用户猜的数字, 并接收.
        //2.1 创建键盘录入对象.
        Scanner sc = new Scanner(System.in);

        //4. 因为不知道你多少次能猜对, 所以用死循环改进.
        while(true) {
            //2.2 提示用户录入要猜的数据, 并接收.
            System.out.println("请录入您要猜的数字(1-100):");
            int guessNum = sc.nextInt();

            //3. 比较两个数字, 看是否一致, 并给出相应的提示.
            if (guessNum > num) {
                System.out.println("您猜大了");
            } else if(guessNum < num) {
                System.out.println("您猜小了");
            } else {
                System.out.println("恭喜您, 猜对了, 请找小黑领取奖品!");
                //猜对了, 循环结束.
                break;
            }
        }
    }
}
