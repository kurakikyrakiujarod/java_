package cn.itcast.demo;

public class ForForDemo {
    public static void main(String[] args) {
        //需求: 按照班级获取该班级所有的同学(假设一共有3个班级, 每个班级5名同学).
        //原始做法
       /* //获取第一个班级的每一位同学
        for(int i = 1; i <= 5; i++) {
            System.out.println("正在获取第1个班级的第" + i + "名同学");
        }
        System.out.println();  //作用: 换行

        //获取第二个班级的每一位同学
        for(int i = 1; i <= 5; i++) {
            System.out.println("正在获取第2个班级的第" + i + "名同学");
        }
        System.out.println();  //作用: 换行

        //获取第三个班级的每一位同学
        for(int i = 1; i <= 5; i++) {
            System.out.println("正在获取第3个班级的第" + i + "名同学");
        }
        System.out.println();  //作用: 换行*/

       //通过观察上述的代码, 我们发现打印每个班级学生的动作都是重复的, 所以我们可以继续通过循环优化.
        //1. 通过for循环获取每一个班级.
        for (int a = 1; a < 4; a++) {       //外循环, 用来获取每一个班级的.
            //2. 再次通过for循环获取到当前班级中的每一位同学.
            for(int i = 1; i <= 5; i++) {   //内循环, 用来获取当前班级的每一位学生的.
                //3. 直接打印该学生的信息即可.
                System.out.println("正在获取第"+ a +"个班级的第" + i + "名同学");
            }
            System.out.println();  //作用: 换行
        }

    }
}
