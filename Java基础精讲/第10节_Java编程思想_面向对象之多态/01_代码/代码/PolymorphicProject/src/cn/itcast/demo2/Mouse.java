package cn.itcast.demo2;

//子类, 老鼠类
public class Mouse extends Animal {
    @Override
    public void eat() {
        System.out.println(getName() + "吃奶酪");
    }
}
