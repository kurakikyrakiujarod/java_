package cn.itcast.demo;

//1. 导包
import java.util.Scanner;
public class ScannerDemo2 {
    public static void main(String[] args) {
        //需求: 键盘录入两个整数, 求它们的和
        //2. 创建键盘录入对象.
        Scanner sc = new Scanner(System.in);

        //3. 提示用户录入数据, 并接收.
        System.out.println("请录入第一个整数: ");
        int a = sc.nextInt();
        System.out.println("请录入第二个整数: ");
        int b = sc.nextInt();

        //4. 计算整数和.
        int sum = a + b;

        //5. 打印结果.
        System.out.println("sum: " + sum);
    }
}
