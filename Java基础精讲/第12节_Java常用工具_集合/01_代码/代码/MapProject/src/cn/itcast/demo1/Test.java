package cn.itcast.demo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合的特点
        特点：
            双列集合，元素由键值对（Entry）构成：
            key(键) -- value(值)
        注意:
            键(key)不可以重复，值(value)可以重复
        应用：
            Map<T1, T2> map = new HashMap<>();
            解释:
                T1: 表示键的数据类型.
                T2: 表示值的数据类型
        成员方法:
            V put(K key,V value);  添加元素(键值对的形式),
                                   元素第一次添加, 返回null,
                                   重复添加, 会用新值覆盖旧值, 并返回旧值.

            V get(Object key);     根据键获取其对应的值
            Set<K> keySet();       获取所有键的集合.

       遍历步骤:
            1. 获取所有键的集合.                 keySet()
            2. 遍历所有的键, 获取到每一个键.     迭代器, 增强for.
            3. 根据键, 获取指定的值.             get();
 */
public class Test {
    public static void main(String[] args) {
        //需求: 往Map集合中添加3个学生对象, 然后打印.
        //1. 创建集合对象.
        //键: 学生的编号,  值: 具体的学生对象
        Map<Integer,Student> map = new HashMap<>();
        //2. 创建元素对象.
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("张三", 23);

        //3. 将元素对象添加到集合中.
        /*Student stu1 = map.put(1, s1);
        System.out.println("stu1: " + stu1);
        Student stu2 = map.put(1, s2);
        System.out.println("stu2: " + stu2);*/
        map.put(1, s1);
        map.put(2, s2);
        map.put(3, s3);

        //根据键,获取值
        Student stu3 = map.get(3);
        System.out.println("key: " + 2 + ", value:" + stu3);

        //打印集合
        System.out.println(map);
        System.out.println("----------------------------");

        //4. 遍历集合.
      /*  //4.1. 获取所有键的集合.                 keySet()
        Set<Integer> keys = map.keySet();
        //4.2. 遍历所有的键, 获取到每一个键.     迭代器, 增强for.
        //获取迭代器对象
        Iterator<Integer> it = keys.iterator();
        while(it.hasNext()) {
            //如果迭代器中有数据, 就获取.
            Integer key = it.next();
            //4.3. 根据键, 获取指定的值.             get()
            Student value = map.get(key);
            System.out.println("key: " + key + "...value:" + value);
        }*/

        //通过增强for实现
        //获取到所有的键
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            //key就是双列集合中的每一个键.
            Student value = map.get(key);
            System.out.println(key + "..." + value);
        }
    }
}
