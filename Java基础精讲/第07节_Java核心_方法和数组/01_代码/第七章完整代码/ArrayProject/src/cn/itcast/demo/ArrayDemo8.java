package cn.itcast.demo;

public class ArrayDemo8 {
    public static void main(String[] args) {
        //需求: 定义一个方法用来打印数组, 并调用.
        //1. 定义一个数组.
        int[] arr = {2, 3, 5, 9, 6, 7};

        //3. 调用方法.
        printArray(arr);
    }

    /*
        2. 定义一个方法, 是用来打印数组的.
            明确方法名:          printArray
            明确参数列表:        int[] arr
            明确返回值的类型:    void
     */
    public static void printArray(int[] arr) {
        //这里边写的是具体的遍历数组的代码
        for (int i = 0; i < arr.length; i++) {
            //i的最大值为: arr.length - 1, 相当于数组的最大索引
            System.out.println(arr[i]);
        }
    }
}
