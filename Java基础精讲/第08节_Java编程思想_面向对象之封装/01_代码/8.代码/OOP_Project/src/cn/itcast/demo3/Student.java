package cn.itcast.demo3;

/*
    定义一个类, 演示封装
 */
public class Student {
    //成员变量
    String name;    //姓名
    private int age; //年龄

    //提供公共的访问方式, 分别设置值, 获取值.
    //设置age的值.
    public void setAge(int a) {
        //在这里, 对age的值进行限定.
        //这里虽然可以对age的值做限定, 但是不用做.
        //因为从前端传过来的数据本身就是已经校验过的合法的数据.
        /*if(a > 200 || a <= 0) {
            //非法值
            age = 1;
        }else {
            //合法值
            age = a;
        }*/
        age = a;
    }
    //获取age的值
    public int getAge() {
        return age;
    }

    //成员方法
    //学习
    public void study() {
        System.out.println(name + "正在努力的学习...");
    }
}
