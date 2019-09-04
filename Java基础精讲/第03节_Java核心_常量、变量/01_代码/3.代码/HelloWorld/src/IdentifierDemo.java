public class IdentifierDemo {
    public static void main(String[] args) {
        /*
            标识符:
                组成:
                    英文大小写字母, 数字, _, $
                命名规则:
                    遵循驼峰命名, 见名知意.
                    类和接口:   所有单词的首字母都大写, 其他小写.
                    方法和变量: 从第二个单词开始, 所有单词的首字母大写, 其他全部小写.
                    常量:      全部大写, 单词之间用_隔开.         (目前先做了解)
                    包名:      全部小写, 多级包之间用.隔开, 一般是公司的域名反写.
                                cn.itcast

                               作用: 包其实就是文件夹, 用来区分重名类的.

                注意事项:
                    1. 不能以数字开头.
                    2. 不能和Java中的关键字重名.
                    3. 严格区分大小写.
         */
        int age = 20;
        System.out.println(age);

        int zhangSanAge = 23;
        System.out.println(zhangSanAge);

        int b2 = 10;
        // 1. 不能以数字开头.
        //int 2b = 10;
        System.out.println(b2);

        //2. 不能和Java中的关键字重名.
        int classNumber = 20;


        // 3. 严格区分大小写.
        int a = 10;
        int A = 20;
    }
}
