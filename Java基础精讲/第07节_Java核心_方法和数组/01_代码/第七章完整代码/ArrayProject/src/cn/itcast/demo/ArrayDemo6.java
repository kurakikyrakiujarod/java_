package cn.itcast.demo;

public class ArrayDemo6 {
    public static void main(String[] args) {
        //需求: 演示空指针异常(NullPointerException)
        int[] arr = new int[3];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;

        arr = null;
        System.out.println(arr[0]);
    }
}
