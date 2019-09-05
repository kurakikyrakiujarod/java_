package cn.itcast.demo;

import java.util.Calendar;

/*
    Calendar类:
        简介:
            日历类. 用于操作日期相关信息。
        成员方法
            static Calendar getInstance()： 根据当前系统时区和语言环境获取日历对象
            int get(int field)：            返回给定日历字段的值
            void set(int field, int value)：将给定的日历字段设置为指定的值
 */
public class Test2 {
    public static void main(String[] args) {
        //创建Calendar类型的对象.
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //获取年月日的信息
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);  //Java中使用0-11的数字表示月份的, 对应1-12月
        int day = c.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + day + "日");
        System.out.println("------------------------");

        //设置指定时间为: 2022年2月2日
       /* c.set(Calendar.YEAR,2022);
        int year2 = c.get(Calendar.YEAR);
        System.out.println(year2 + "年" + (month + 1) + "月" + day + "日");*/
        c.set(2022, 1, 2);
        //重新获取年月日的值
        int year2 = c.get(Calendar.YEAR);
        int month2 = c.get(Calendar.MONTH);  //Java中使用0-11的数字表示月份的, 对应1-12月
        int day2 = c.get(Calendar.DATE);
        System.out.println(year2 + "年" + (month2 + 1) + "月" + day2 + "日");
    }
}
