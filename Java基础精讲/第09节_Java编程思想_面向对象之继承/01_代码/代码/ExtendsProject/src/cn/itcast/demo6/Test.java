package cn.itcast.demo6;

/*
    需求:
        定义武功类Martial:
            练习内功: internalStrength()
            练习招式: stroke()
	    定义九阴真经类NineYin，继承Martial类
	        练习内功: internalStrength()
            练习招式: stroke()
        九阴真经的修炼，不仅要练习基本内功，还要能够以柔克刚，需要扩展父类方法；
        简单的招式已经不足为用，必须有九阴白骨爪这样的大招才能制胜，需要重新实现父类方法
 */
public class Test {
    public static void main(String[] args) {
        //需求: 调用NineYin类中的功能
        NineYin ny = new NineYin();
        ny.internalStrength();
        ny.stroke();
    }
}
