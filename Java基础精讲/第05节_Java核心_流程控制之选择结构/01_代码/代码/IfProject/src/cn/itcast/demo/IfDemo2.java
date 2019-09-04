package cn.itcast.demo;

/*
    选择结构之if语句:
        第二种格式:
            if(关系表达式) {
                语句体1;
            } else {
                语句体2;
            }
        执行流程:
            先判断关系表达式, 看其是否成立(true:成立, false:不成立).
            如果关系表达式成立, 则执行语句体1,
            如果关系表达式不成立, 则执行语句体2.
 */
public class IfDemo2 {
    public static void main(String[] args) {
        System.out.println("开始执行");
        //需求: 判断两个整数是否相等, 相等则打印"相等", 不相等则打印"不相等"
        int a = 20;
        int b = 20;

        //调用if语句的第二种格式
        if(a == b) {        //if: 如果
            //能走这里, 说明条件成立
            System.out.println("相等");
        } else {            //else: 否则
            //能走这里, 说明条件不成立
            System.out.println("不相等");
        }

        System.out.println("结束执行");
    }
}
