package cn.itcast.demo1;

//定义一个父类: Parent
public class Parent {
    //成员变量
    private String name;
    private int age;

    //快捷键: alt + insert, 快速生成构造方法和getXXX(),setXXX()方法.
    //构造方法
    public Parent() {
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getXXX()和setXXX()方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
