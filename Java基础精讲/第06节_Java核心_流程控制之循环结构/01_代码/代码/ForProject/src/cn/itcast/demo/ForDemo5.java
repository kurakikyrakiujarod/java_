package cn.itcast.demo;

public class ForDemo5 {
    public static void main(String[] args) {
         /*
            需求: 打印所有的水仙花数.
                水仙花数解释: 指的是一个三位数, 其各位数字的立方和等于它本身. 例如:
                             1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
         */
         //1. 通过for循环, 获取所有的三位数.
        for(int i = 100; i < 1000; i++) {
            //i表示的就是所有的三位数.
            //2. 获取该数据的个位, 十位, 百位数字.
            int ge = i % 10;
            int shi = i/10%10;
            int bai = i/10/10%10;

            //3. 判断该数字是否是水仙花数, 如果是, 直接打印即可.
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
                //能走到这里, 说明i是水仙花数
                System.out.println(i);
            }
        }


    }
}
