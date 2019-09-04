package cn.itcast.demo;

/*
    for循环
        格式:
            for(初始化语句; 判断条件语句; 控制条件语句) {
                循环体
            }
        执行流程;
            第一次循环：　先执行初始化语句，　然后执行判断条件语句，
                        　如果条件不成立：　循环结束
                          如果条件成立：　　执行循环体，然后执行控制条件语句，此时，第一次循环执行结束．
           第二次循环：　执行判断条件语句
                          如果条件不成立：　循环结束
                          如果条件成立：　　执行循环体，然后执行控制条件语句，此时，第一次循环执行结束．
           以此类推．．．
 */
public class ForDemo1 {
    public static void main(String[] args) {
        //需求: 打印5次HelloWorld
        for(int i = 1; i <= 5; i++) {
            System.out.println("HelloWorld!");
        }
    }
}
