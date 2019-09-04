public class VariableDemo2 {
    public static void main(String[] args) {
        /*
            1. 变量未赋初值, 不能使用.
            2. 变量只在它所属的那对大括号内(变量的作用域)有效.
            3. 一行上可以写多个变量, 但是不建议.
         */
        int a = 10;
        System.out.println(a);

        int b;
        b = 20;
        System.out.println(b);

        {
            //代码块
            int c = 30;
            //System.out.println(c);
        }
        //System.out.println(c);  //超出变量c的作用域了, 所以不能使用

        int d = 40,e=1,f=2,g=30;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
