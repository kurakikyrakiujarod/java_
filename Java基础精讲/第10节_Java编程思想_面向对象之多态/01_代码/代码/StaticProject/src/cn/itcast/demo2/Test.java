package cn.itcast.demo2;

/*
    static修饰成员方法
    静态方法：
        静态方法中没有对象this，所以不能访问非静态成员
    静态方法的使用场景
        如果某方法只访问静态成员, 并且不需要通过 对象名. 的形式调用, 就可以考虑将其定义为: 静态方法.

    需求：定义静态方法，反转数组中的元素
        核心:
            1. 其实就是arr[i]  和 arr[arr.length - 1 - i] 在交换.
            2. 循环次数只需要执行数组长度的一般就可以了, 也就是: arr.length/2
  */
public class Test {
    public static void main(String[] args) {
        //测试show()方法
        ReverseArray.show();

        //小需求: 交换变量.
        int a = 10;
        int b = 20;
        int temp = a;   //temp=10, a=10, b=20
        a = b;          //temp=10, a=20, b=20
        b = temp;       //temp=10, a=20, b=10
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("-------------------------");
        int[] arr = {1, 6, 4, 5, 2, 3};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("-------------------------");

        //调用方法, 反转数组
        ReverseArray.reverse(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
