/*
    +: 加法.

    类型转换:
        隐式类型转换:     小转大的关系
            数据类型的范围从小到大如下:
             byte,short,char  --> int(默认的整形) --> long --> float --> double(默认的浮点型)
        强制类型转换:     大转小的关系
            目标类型 变量名 = (目标类型)要转换的值;

            注意: 强制类型转换在使用的时候可能会出现丢失精度的问题.
 */
public class ConversionDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);  //30

        int c = a + b;
        System.out.println(c);
        System.out.println("--------------------------");

        //定义一个int类型的变量 和 一个byte类型的变量
        int aa = 2;
        byte bb = 3;
        System.out.println(aa + bb);    //5
        //尝试用变量接收 aa+bb的结果
       //byte cc = aa + bb;      //代码报错了, 为什么呢? 因为涉及到了 自动类型转换.
        int dd = aa + bb;
        System.out.println(dd);

        System.out.println("----------------------------");

        //思考: 我就想用cc接收 aa + bb的结果
        // 目标类型 变量名 = (目标类型)要转换的值;
        byte cc = (byte)(aa + bb);      //强制类型转换
        System.out.println(cc);

        System.out.println("-------------------------");
        double d = 3.2;
        int ee = 2;
        double d2 = d + ee;
        System.out.println(d2);     //5.2

        //尝试用int类型接收: d + ee
        int i = (int)(d + ee);
        System.out.println(i);      //5 ?    因为丢失了精度.
    }
}
