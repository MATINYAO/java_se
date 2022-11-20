import javax.print.DocFlavor;
import java.util.TreeMap;

public class Demo02 {
    public static void main(String[] args) {
        String a = "";
        //整数
        int num1 = 1;
        byte num5 = 33;
        int num2 = 3;
        short num3 = 999;
        long num4 = 99999999999L;


        //小数，浮点数
        float num6 = 9.9F;
        double num7 = 9.99999999;


        //字符
        char name1 = 'a';
        String name2 = "martinding";

        //布尔，是非
        boolean flag = true;
        boolean key = false;



        //类，接口，数组 都是引用数据类型

        if(flag=true){
            System.out.println("OK! i am fine");

        }

        System.out.println(a);
        System.out.println(key);
    }
}
