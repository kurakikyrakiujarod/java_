package cn.itcast.demo;

public class BreakDemo1 {
    public static void main(String[] args) {
        //需求: 假设班级有15名学生, 查找编号为3的学生, 找到后循环就结束了.
        //1. 通过for循环获取到每一位学生的编号.
        for(int i = 1; i <= 15; i++) {
            //为了让你更好的理解break的作用, 我加一个输出语句
            System.out.println("我是编号为:" + i + "的学生");

            //2. 判断该学生的编号是否为3.
            if (i == 3) {
                //3. 如果编号为3, 则结束整个循环.
                System.out.println("找到了编号为" + i + "的学生, 循环结束");
                break;  //终止循环
            }
        }

    }
}
