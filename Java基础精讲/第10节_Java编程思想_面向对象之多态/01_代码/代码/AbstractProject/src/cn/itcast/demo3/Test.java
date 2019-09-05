package cn.itcast.demo3;

/*
    需求：
        开发团队中有程序员和经理两种角色，他们都有姓名、工资、工号等属性，都有工作的行为，
        经理还有奖金属性。请使用继承思想设计出上述需求中的类，并分别创建对象使用。
    父类Employee
	    name，salary，id；work();
	程序员类Coder，继承Employee，属性和行为：
	    work();
    经理类Manager，继承Employee，属性和行为：
	    bonus; work();
 */
public class Test {
    public static void main(String[] args) {
        //测试程序猿类
        Employee em = new Coder();
        em.work();

        //测试经理类
        Employee em2 = new Manager();
        em2.work();
        System.out.println("------------------");

        //扩展内容, 快速实例化对象
        //需求: 创建一个姓名叫张三, 工资为30000, 工号为: 研发部007的程序猿.
       /* Coder c = new Coder();
        c.setName("张三");
        c.setSalary(30000);
        c.setId("研发部007");*/
       Coder c = new Coder("张三",30000,"研发部07");
        System.out.println("姓名: " + c.getName());
        System.out.println("工资: " + c.getSalary());
        System.out.println("工号: " + c.getId());
        System.out.println("----------------------");

        //需求: 创建一个名字叫: 李四, 工资为: 40000, 工号为: 研发部01, 奖金为100000 的经理
        Manager m = new Manager("李四",40000,"研发部01",100000);
        System.out.println("姓名: " + m.getName());
        System.out.println("工资: " + m.getSalary());
        System.out.println("工号: " + m.getId());
        System.out.println("奖金: " + m.getBonus());
    }
}
