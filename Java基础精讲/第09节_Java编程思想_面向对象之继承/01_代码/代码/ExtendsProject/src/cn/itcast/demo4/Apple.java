package cn.itcast.demo4;

//定义一个子类(苹果类)
public class Apple extends Fruit{
    String color; //颜色

    //吃
    public void eat() {
        System.out.println("吃一个" + color + size +  "苹果");
        super.color = color;    //将本类的color属性值, 设置给 父类的color属性.
    }
}
