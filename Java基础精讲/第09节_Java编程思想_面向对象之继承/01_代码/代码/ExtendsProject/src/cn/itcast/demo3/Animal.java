package cn.itcast.demo3;

//定义一个父类(Animal: 动物类), 里边放的是共性内容.
public class Animal {
    /*
         它们共有的属性有：name、age、sex，
        共有的行为有：eat().
     */
    //成员变量
    private String name;    //姓名
    private int age;        //年龄
    private String sex;     //性别

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //成员方法
    //吃饭
    public void eat() {
        System.out.println("会吃饭");
    }
}
