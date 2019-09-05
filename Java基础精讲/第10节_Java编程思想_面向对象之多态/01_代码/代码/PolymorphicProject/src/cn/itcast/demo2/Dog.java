package cn.itcast.demo2;

//子类, 狗类.
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println(getName() + "吃骨头");
    }
}
