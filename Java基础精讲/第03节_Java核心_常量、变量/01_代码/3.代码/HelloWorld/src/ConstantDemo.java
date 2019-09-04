public class ConstantDemo {
    /*
        为了提高你的开发效率, 记住两个快捷键
        main函数的快捷键: psvm
        输出语句的快捷键: sout

        常量:
            概述:
                在程序的运行过程中, 其值不会发生改变的量.

            字面值常量的分类:
                1. 字符串常量:  "abc"   值必须用""括起来
                2. 字符常量:  'a','0'   值必须用''括起来
                3. 整数常量: 1,2,3,4
                4. 小数常量: 1.2
                5. 布尔常量: true, false,  值只有两个.
                6. 空常量: null   目前先做了解, 后续详细讲解
     */
    public static void main(String[] args) {
        // 1. 字符串常量:
        System.out.println("abc");
        System.out.println("123");

        // 2. 字符常量:
        System.out.println('a');
        System.out.println('1');

        // 3. 整数常量:
        System.out.println(12);
        System.out.println(-12);

        //4. 小数常量:
        System.out.println(1.2);
        System.out.println(-1.2);

        // 5. 布尔常量:
        System.out.println(true);
        System.out.println(false);
    }
}
