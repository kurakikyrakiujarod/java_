package cn.itcast.demo1;

//子类, 老鼠类
public class Mouse extends Animal {
    @Override
    public void eat() {
        System.out.println("老鼠吃奶酪");
    }
}
