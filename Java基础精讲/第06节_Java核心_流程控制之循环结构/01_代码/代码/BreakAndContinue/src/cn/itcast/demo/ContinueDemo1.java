package cn.itcast.demo;

public class ContinueDemo1 {
    public static void main(String[] args) {
        //需求: 模拟逢7必过的小游戏.
        //1. 通过for循环获取到1~100之间所有的数据.
        for (int i = 1; i <= 100; i++) {
            //2. 判断当前数字是否是合法数据.
            //包含7或者是7的倍数, 这些数据都是不合法的.
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                //3. 如果数据不合法, 直接跳过本次循环, 直接进行下次循环.
                System.out.println("...");
                continue;
            }
            //4. 如果数据合法, 直接打印即可.
            System.out.println(i);
        }
    }
}
