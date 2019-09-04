package cn.itcast.demo;

/*
    算数运算符:
        分类:
            +,-,*,/,%

        /和%的区别:
            /: 获取两个数据相除的商.
            %: 获取两个数据相除的余数.

        注意:
            整数相除结果还是整数.
            想要得到小数, 就必须有浮点数参与运算.
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        //定义两个int类型的变量
        int a = 5;
        int b = 3;

        System.out.println(a + b);      //输出8
        System.out.println(a - b);      //输出2
        System.out.println(a * b);      //输出15
        System.out.println(a / b);      //输出1
        System.out.println(a % b);      //输出2
        System.out.println("----------------------");

        System.out.println(5/4);        //输出1
        System.out.println(5.0/4);      //输出1.25
        System.out.println(5/4.0);      //输出1.25
    }
}
