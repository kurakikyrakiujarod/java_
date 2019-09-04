package cn.itcast.demo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //需求: 定义一个长度为5的int型数组, 将前三个元素分别赋值为1,2,3. 通过for循环遍历数组, 打印数组中每个元素的值.
        /*
            1. 直接输出数组变量名, 得到的是数组的内存地址值.
            2. 数组中未手动赋值的元素, 其实是有默认值的. 例如: int型数组默认值是0, double型数组默认值是0.0
            3. 数组的长度:      数组名.length
               数组的最大索引:  数组的长度 - 1
         */

        //1. 定义一个长度为5的int型数组
        int[] arr = new int[5];
        //2. 将前三个元素分别赋值为1,2,3.
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        //传统做法, 遍历数组.
        //System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("arr数组的长度是: " + arr.length);
        System.out.println("arr数组的最大索引是: " + (arr.length - 1));
        System.out.println("--------------------");

        //3. 通过for循环遍历数组, 打印数组中每个元素的值.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
