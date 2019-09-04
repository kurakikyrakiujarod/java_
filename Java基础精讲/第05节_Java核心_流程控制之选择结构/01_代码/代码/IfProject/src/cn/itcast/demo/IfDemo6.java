package cn.itcast.demo;

import java.util.Scanner;

public class IfDemo6 {
    public static void main(String[] args) {
          /*
            需求：键盘录入学生考试成绩，请根据成绩判断该学生属于哪个级别
                 90-100	            皇帝
                 80-90(不包含)      宰相
                 70-80(不包含) 	    大臣
                 60-70(不包含) 	    县官
                 60(不包含) 以下    草民
         */
        //1. 创建键盘录入对象.
        Scanner sc = new Scanner(System.in);

        //2. 提示学生录入成绩, 并接收.
        System.out.println("请录入您的成绩: ");
        int score = sc.nextInt();   //正确的数据, 错误的数据, 边界数据

        //3. 根据学生录入的成绩, 和题设的条件进行对比, 并按照要求进行输出即可.
        if (score >= 90 && score <= 100) {
            System.out.println("皇帝");
        } else if(score >= 80 && score < 90) {
            System.out.println("宰相");
        } else if(score >= 70 && score < 80) {
            System.out.println("大臣");
        } else if(score >= 60 && score < 70) {
            System.out.println("县官");
        } else if(score >= 0 && score < 60) {
            System.out.println("草民");
        } else {
            System.out.println("没有这样的成绩, 你是从火星来的吧?");
        }
    }
}
