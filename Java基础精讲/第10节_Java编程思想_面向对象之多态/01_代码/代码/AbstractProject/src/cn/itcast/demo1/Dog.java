package cn.itcast.demo1;

//子类, 狗类
public class Dog extends Animal {
    //alt + enter: 快捷键, 自动帮你重写方法
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
