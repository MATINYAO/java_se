public class Demo10 {
    public static void main(String[] args) {
        System.out.println("bbb");

        int a = 10;
        int b = 20;

        //a += b;

        a-=b;
        System.out.println(a);

        System.out.println("a"+a+b);
        System.out.println(a+b+"");


        //三元运算符  x ? y : z
        //如果x为真 选y, 如何x为假 为z
        int score = 50;
        String type = score <60 ? "不及格" : "及格";
        System.out.println(type);

        //优先级(), 遇事不决()。



        //java 包机制
        //包的本质，就是文件夹
        //一般为包名为，公司名的导致 如www.test.cupdata.com
        //com.cupdata.test.www


    }
}
