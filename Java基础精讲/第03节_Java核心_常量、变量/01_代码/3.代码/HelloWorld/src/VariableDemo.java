/*
 *  变量的定义格式:
 *      数据类型 变量名 = 初始化值;
 *   数据类型:
 *      byte, short, int, long, float, double, char, boolean
 *   注意事项:
 *      A: 整形默认是int类型, 定义long类型变量的时候, 后边要加字母L(大小写均可)
 *      B: 浮点型默认是double类型, 定义float类型变量的时候, 后边要加字母F(大小写均可)
 */
public class VariableDemo {
    public static void main(String[] args) {
        //byte类型的数据
        byte b = 10;
        System.out.println(b);
        //System.out.println(10);

        //short类型的数据
        short s = 10;
        System.out.println(s);

        //int类型的数据
        int i = 10000;
        System.out.println(i);

        //long类型的数据
        long l = 10000000000L;
        System.out.println(l);

        //float类型的数据
        float f = 12.3F;
        System.out.println(f);

        //double类型的数据
        double d = 12.3;
        System.out.println(d);

        //char类型的数据
        char ch = 'a';
        System.out.println(ch);

        //boolean类型的数据
        boolean b1 = true;          //是
        boolean b2 = false;         //否
        System.out.println(b1);
        System.out.println(b2);
    }
}
