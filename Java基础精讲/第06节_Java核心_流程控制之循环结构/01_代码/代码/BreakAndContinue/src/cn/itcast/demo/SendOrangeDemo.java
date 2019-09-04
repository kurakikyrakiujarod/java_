package cn.itcast.demo;

public class SendOrangeDemo {
    public static void main(String[] args) {
           /*
            需求: 1024程序员节，小黑带你发橙子
            已知条件:
                假设有3个班级，每个班级有35个同学，现在要将100个橙子分别发放给每位同学，每人只能拿一个。
                如果该同学已经有了橙子，则不再发给该同学；如果橙子发完了，则发放活动终止。
                假设编号为5的倍数的同学都已经有了橙子.
         */
        //1. 定义变量, 记录发送的橙子总数.
        int count = 0;
        //2. 通过for循环, 获取到每一个班级.
        A:
        for (int i = 1; i < 4; i++) {     //外循环, 获取到每一个班级.
            //3. 在班级for中, 在通过for获取到每一个同学.
            for (int j = 1; j < 36; j++) {  //内循环, 获取到每一个同学.
                //4. 判断该学生是否有橙子.
                if (j % 5 == 0) {
                    //5. 如果有, 就不发了.
                    continue;      //结束本次循环, 进行下一次循环.
                }
                //6. 如果没有, 就给该学生发橙子.
                System.out.println("正在给第" + i + "个班级的第" + j + "个同学发橙子");
                //7. 每发送一个橙子, 计数器都要+1.
                count++;
                //8. 如果橙子发完了, 结束发放活动.
                if (count >= 100) {
                    System.out.println("break");
                    break A;
                }
            }
        }
        //9. 打印发送的橙子数量.
        System.out.println("总共发送了" + count + "个橙子");
    }
}
