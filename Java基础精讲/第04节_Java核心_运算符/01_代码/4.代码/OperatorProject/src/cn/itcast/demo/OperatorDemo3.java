package cn.itcast.demo;

/**
 * 自增运算符(++)演示:
 *  作用:
 *      表示自身的值 + 1
 *
 *  用法:
 *      单独使用：放在变量前或后结果一样, 都是自身+1
 *      参与运算：
 *          在变量前，先自增，再以新值进行其它运算
 *          在变量后，先以原值进行其它运算, 再自增
 */
public class OperatorDemo3 {
    public static void main(String[] args) {
        //定义一个int类型的变量
        int a = 5;

        //单独使用
       /* //a++;
        ++a;
        //下述输出语句的结果是: 把字符串"a: " 和 变量a的值进行拼接
        System.out.println("a: " + a);*/

      /* //参与运算
        //++在后
        int b = a++;
        System.out.println("a: " + a);      //6
        System.out.println("b: " + b);      //5*/

        //参与运算
        //++在前
        int b = ++a;
        System.out.println("a: " + a);      //6
        System.out.println("b: " + b);      //6
    }
}
