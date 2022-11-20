import sun.font.TrueTypeFont;

import java.util.concurrent.TransferQueue;

public class Demo04 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;
        //b最大的为127，内存溢出了，导致b输入错误

        //强制转换 （类型）  如(int)
        //高到低强制转换
        //低到高自动转换
        //强制转换可能导致内存溢出或者精度问题
        //大数的时候容易溢出
        //数字下面可以加下划线

        int money = 10_0000_1000;
        System.out.println(money);

        int years = 20;
        int total;
        total = years*money;
        System.out.println(total);

        long total2 = (long)years*(long)money;
        System.out.println(total2);

        //l和L的区别，建议使用大写L,不容易看错

        System.out.println(i);
        System.out.println(b);


        //
        int e = 3;
        double c = e;
        System.out.println(e);
        System.out.println(c);


        System.out.println((int)99.9);
        System.out.println((int)-99.8);

        //布尔不能转换
        //不相干的不可以转换

//        boolean flag = true;
//        try {
//            int int_flag = (flag);
//        }catch (Exception e1){
//            int int_flag = 9;
//            System.out.println();
//        }
//        System.out.println(int_flag);
    }
}
