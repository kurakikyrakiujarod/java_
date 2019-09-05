package cn.itcast.demo;

import java.util.Date;

/*
    Date
        简介:
            日期类，用于操作时间相关信息。
        构造方法:
            Date()：     构造一个日期对象，当前系统时间，精确到毫秒
            Date(long)： 构造一个日期对象，时间为自“1970年1月1日00:00:00 GMT”起，至指定参数的毫秒数
        成员方法
            long getTime()： 将日期对象转换成对应时间的毫秒值
*/
public class Test {
    public static void main(String[] args) {
        //测试Date类
        //测试空参构造, 采用当前操作系统的默认时间
        Date date1 = new Date();
        System.out.println("date1:" + date1);

        //获取当前操作系统时间的毫秒值
        long time = date1.getTime();
        System.out.println("time:" + time);

        //Sun Jun 06 17:04:39 CST 2066   --> 3043040679456
        //创建一个指定的时间
        Date date2 = new Date(3043040679456L);
        System.out.println("date2:" + date2);
    }
}
