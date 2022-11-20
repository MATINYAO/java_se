public class Demo06 {
    //属性:变量


    //实例变量，在类里面在方法的外面
    //在这个类里面通用而且不需要初始化
    //除了基本类型，其他都是null
    int age;
    String name;



    boolean flag;

    //类变量  static

    static double salary = 2500;

    //常量，不会变动值，设定后不允许被改变

    //修饰符不分前后，debuff
    static final double Salary1  = 2501;

    // 变量见名知道意思
    //类变量 除了一个字母以外的，其他字母首字符大写
    //例如 lastName

    //局部变量  首字符小写，其他单词首字母大写

    //常量都是大写 MAX_ABC

    //类名
    //首字母大写的驼峰



    public static void main(String[] args) {
        //局部变量，在方法内有效，且必须要初始化
        int i = 1;
        System.out.println(i);


        //自定义类型
        //变量类型 变量名
        Demo06 demo06 = new Demo06();

        //如不初始化，会输出默认值
        System.out.println(demo06.age);
        System.out.println(demo06.name);
        System.out.println(demo06.flag);

        //类变量  static

        System.out.println(salary);


        System.out.println(Salary1);
    }





    //其他方法
    public void add(){

    }


}
