package cn.itcast.demo;

/*
    需求: 用do.while循环模拟 练习知识点的过程.
    要求:
        至少练习一次, 并且练习次数不小于3次就表示这个知识点你学会了.
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        //1. 定义一个变量, 记录练习次数.
        int count = 1;
        //2. 定义一个变量, 用来标记是否学会这个知识点. true: 学会了, false: 没学会.
        boolean isOK = false;
        //3. 在do..while循环中模拟这个动作.
        do{
            //输出练习次数
            System.out.println("正在进行第" + count + "次练习");
            //判断练习次数, 看是否不小于三, 如果条件成立, 表示学会了.
            if (count >= 3) {
                //能进来, 说明学会了.
                //将boolean类型变量的值改为: true
                isOK = true;
            }
            //不管是否学会, 每练习一次, 次数要+1
            count++;
        }while(!isOK);
    }
}
