package cn.itcast.demo4;

//定义一个水果类, 父类
public class Fruit {
    String color; //颜色
    String size;  //大小,  大, 中, 小

    //晒果干
    public void drying() {
        System.out.println(color + "水果, 正在晒果干");
    }

    //榨果汁
    public void juice() {
        System.out.println(color + "水果, 正在榨果汁");
    }
}
