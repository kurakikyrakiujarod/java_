package cn.itcast.demo;

public class BreakDemo2 {
    public static void main(String[] args) {
        /*
            需求: 程序猿同学受邀加入A公司，现按班级查找程序猿同学。
            已知:
                现有3个班级，每班10个同学，
                假设第2个班级的第5位同学名叫程序猿，找到该同学后则停止查找。
        */
        //1. 通过for循环, 获取到每一个班级.
        label_class:for (int i = 1; i < 4; i++) {       //需求: 外循环, 是用来获取到每一个班级的.
            //2. 在班级循环中, 再次通过for循环获取到每一个学生的信息.
            for (int j = 1; j < 11; j++) {  //需求: 内循环, 是用来获取每一个学生的.
                //3. 打印当前学生的信息.
                System.out.println("正在查找第"+ i +"个班级的第"+ j +"个学生");
                //4. 判断当前学生是否是 程序猿同学(第2个班级的第5位同学)
                if(i == 2 && j == 5) {
                    //5. 如果是, 则结束整个循环.
                    System.out.println("哈哈, 找到程序猿同学了, 整个循环结束");
                    break label_class;          //结束指定的循环
                }

            }
            //换行
            System.out.println();
        }
    }
}
