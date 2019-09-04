package cn.itcast.demo;

/**
 *  逻辑运算符:
 *      分类:
 *          逻辑与: &&, 并且的关系, 要求所有条件都满足, 即有false则整体为false
 *          逻辑或: ||, 或者的关系, 要求只要满足任意一个条件即可, 即有true则整体为true
 *          逻辑非: !, 取反的意思, 以前为false, 现在为true; 以前为true, 现在为false.
 *
 *      注意:
 *          偶数个逻辑非, 结果不变.
 */
public class OperatorDemo6 {
    public static void main(String[] args) {
        System.out.println(true && true);           //输出结果: true
        System.out.println(true && false);           //输出结果: false
        System.out.println(false && true);           //输出结果: false
        System.out.println(false && false);          //输出结果: false
        System.out.println("------------------------");

        System.out.println(true || true);           //输出结果: true
        System.out.println(true || false);           //输出结果: true
        System.out.println(false || true);           //输出结果: true
        System.out.println(false || false);          //输出结果: false
        System.out.println("------------------------");

        System.out.println(!true);  //false
        System.out.println(!false); //true
        System.out.println("---------------------");

        System.out.println(!!!!!!true);    //true
    }
}
