package cn.itcast.demo5;

//测试类
public class Test {
    public static void main(String[] args) {
        /*
            使用变量遵循就近原则.
                先在局部位置找, 有就使用.
                没有就去本类的成员位置找, 有就使用.
                没有就去父类的成员位置找, 有就使用, 没有就报错.

             如果局部变量, 本类的成员变量, 父类的成员变量重名了, 如何解决?
                直接写变量名:     局部变量.
                this.成员变量名:  本类的成员变量
                super.成员变量名: 父类的成员变量
         */
        Zi zi = new Zi();
        zi.show();
    }
}
