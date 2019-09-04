package cn.itcast.demo4;

/*
    需求:
        定义父类Fruit（水果类），属性和行为：
            color（颜色），size（尺寸）
            晒果干: drying(), 榨果汁: juice()
       定义子类Apple（苹果类），属性和行为：
            color（颜色）, 吃: eat()
       定义测试类，分别创建子父类对象并使用

 */
public class Test {
    public static void main(String[] args) {
        //需求: 测试父类
        Fruit f = new Fruit();
        //设置颜色
        f.color = "白色";
        f.drying();
        f.juice();
        System.out.println("----------------");


        //需求: 测试子类
        Apple a = new Apple();
        a.color = "红色";
        a.size = "大";
        //调用本类中的方法
        a.eat();
        //调用父类的方法
        a.drying();

    }
}
