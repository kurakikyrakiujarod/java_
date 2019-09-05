package cn.itcast.demo2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
    字符流写数据
        Writer类中的方法:
            void write(int ch);                          一次写一个字符
            void write(char[] chs,int index,int len);    一次写一个指定的字符数组
            void write(String str);                      一次写一个字符串

        FileWriter类的构造方法:
            public FileWriter(String pathname);           根据传入的字符串形式的路径, 获取字符输出流对象
 */
public class WriterDemo {
    public static void main(String[] args) throws IOException {
        //需求: 通过字符流, 写数据.
        //1. 创建字符输出流对象.
        Writer writer = new FileWriter("lib/3.txt");
        //2. 写数据.
        //一次写一个字符
//        writer.write('好');

        //一次写一个指定的字符数组
        char[] chs = {'黑','马','程','序','员'};
        writer.write(chs,2,3);

        //一次写一个字符串
//        writer.write("好好学习, 知识改变命运!");

        //3. 释放资源.
        writer.close();
    }
}
