package cn.itcast.demo4;

/*
   需求:
        多态的好处:
            可维护性.
            可扩展性.
        多态的弊端:
            父类引用不能使用子类的特有成员.

            解决方案:
                通过"类型转换"实现.
            注意:
                只能在继承层次内进行转换, 否则会报ClassCastException异常
                将父类对象转换成子类之前，使用instanceof进行检查
                instanceof关键字的用法:
                    对象名 instanceof 数据类型
                   意思是判断前边的对象是否是后边的数据类型.
 */
public class Test {
    public static void main(String[] args) {
        //需求: 通过多态创建对象, 调用子类中的成员.
        Animal an = new Dog();

        //调用eat()方法
        an.eat();

        //调用watch()方法, 属于子类独有的方法.
        //an.watch();
        //正确的写法
        /*Dog dog = (Dog)an;
        dog.watch();*/

        //不正常的转换.
        //Cat c = (Cat)an;

        //优化后的方案: 判断当前对象是否是Dog类的对象, 如果是, 再调用watch()方法.
        if(an instanceof Dog) { //判断an是否是Dog类的对象
            //能走到这里, 说明条件满足
            Dog dog = (Dog)an;
            dog.watch();
        }
    }
}
