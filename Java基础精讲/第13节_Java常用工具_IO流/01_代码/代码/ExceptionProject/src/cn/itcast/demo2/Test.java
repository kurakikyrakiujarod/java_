package cn.itcast.demo2;

/*
    异常处理方式二: throws
        抛出异常, 交给调用者处理.

        特点:
            执行结束后, 程序不再继续执行.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //需求: 调用show()
        //因为show()方法已经抛出了一个异常, 作为调用者(main函数)必须处理这个异常.
        //方案一: 接着抛.
        //show();

        //方案二: 采用try.catch处理.
        try{
            show();
        }catch(Exception e) {
            System.out.println("代码出问题了!");
        }
        System.out.println("看看我执行了吗?");

    }

    //定义一个方法
    public static void show() throws Exception {
        int a = 10 / 0;
        System.out.println("a: " + a);
    }
}
