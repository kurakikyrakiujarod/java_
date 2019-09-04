package cn.itcast.demo;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //需求: 演示数组索引越界异常(ArrayIndexOutOfBoundsException)
        int[] arr = new int[3];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;

        System.out.println(arr[3]); //报错, 因为你访问了数组中不存在的元素


        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
