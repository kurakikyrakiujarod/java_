package cn.itcast.demo;

public class ArrayDemo9 {
    public static void main(String[] args) {
        /*
            结论:
                1. 基本类型的变量作为参数传递时, 传的是 值.
                2. 引用类型的变量作为参数传递时, 传的是 地址值.
         */
        int x = 3;
        int y = 4;
        int z = sum(x, y);   //sum(3, 4);    z = 7;
        System.out.println(x);   //3
        System.out.println(y);   //4
        System.out.println(z);  //7
    }


    public static int sum(int a, int b) {  //int a = 3; int b = 4;
        int c = a + b;      //c = 7;
        a++;                //a = 4;
        b++;                //b = 5;
        return c;           //返回: 7
    }

}
