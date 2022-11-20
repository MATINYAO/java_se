package com.baidu.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //我们输入多个数字并且，请平均数和总和。

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入小数");
        double sum = 0;

        //计算输入多少个数字
        int m = 0;

        while (scan.hasNextDouble()){
            double x =scan.nextDouble();

            m++;
            System.out.println("你输入的第"+m+"数据："+x);
            sum += x;
        }

        double Average = 0;
        Average = sum / m;

        System.out.println("输入的数据是几个："+m);
        System.out.println(sum);
        System.out.println(Average);



        scan.close();
    }
}
