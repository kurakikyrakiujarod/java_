package cn.itcast.demo;

public class ForDemo6 {
    public static void main(String[] args) {
        //需求: 打印所有的水仙花数的个数.
        //1. 定义一个计数器, 用来记录水仙花数的个数.
        int count = 0;
        //2. 获取到所有的三位数.
        for(int i = 100; i < 1000; i++) {
            //i记录的就是所有的三位数
            //3. 获取到该数字的个位, 十位, 百位数字.
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            //4. 判断该数字是否是水仙花数, 如果是, 计数器自增1.
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
                //能走到这里, 说明i是一个水仙花数,
                //count = count + 1;
                //count++;
                ++count;
            }
        }
        //5. 打印计数器的结果即可.
        System.out.println("水仙花数的个数是: " + count);
    }
}
