package cn.itcast.demo;

/**
 * 字符参与加法运算, 其实就是拿该字符在计算机中存储所表示的数据值来运算的.
 *  'a'     97
 *  'A'     65
 *  '0'     48
 *
 * 字符串参与加法运算, 其实这里不是加法, 而是字符串的拼接.
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
       //字符的加法运算
        //定义两个变量, int, char
        int a = 10;
        char ch = 'a';  //97
        System.out.println(a + ch); //107

        //字符串的加法运算
        System.out.println("hello" + "world");      //"helloworld"
        System.out.println("hello" + 10);           //"hello10"
        System.out.println("hello" + 10 + 20);      //"hello10" + 20  --> "hello1020"
        System.out.println(10 + 20 + "hello");      //30 + "hello"    --> "30hello"
    }
}
