package cn.itcast.demo;

/*
    定义方法的注意事项:
        1. 方法必须定义在类中.
        2. 方法与方法之间是平级关系, 不能嵌套定义.
        3. 方法没有返回值时, 返回值类型必须写成: void.
        4. 方法返回值类型为void时, 可以省略方法最后的 return语句.
        5. return语句后值的类型必须和方法的返回值的类型一致.
        6. return之后不能再放置语句.
 */
public class MethodDemo3 {
    public static void main(String[] args) {
        //调用方法
        boolean c = compare(10, 20);
        System.out.println(c);

        //return; //return语句表示方法的结束.
    }//main方法的结束标记

    //定义方法, 比较两个整数是否相等
    public static boolean compare(int a, int b) {
        //return 10;  //这样写不行, 因为返回值的类型必须 和 return后边数据的类型一致
        return a == b;

        //System.out.println("你好");
    }//compare方法的结束标记

}//MethodDemo3类的结束标记
