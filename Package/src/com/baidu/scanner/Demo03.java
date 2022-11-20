package com.baidu.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        //从键盘接收数据

        int i = 0;
        float f = 0.0f;

        System.out.println("请输入一个整数");

        if(scan.hasNextInt()){

            i    = scan.nextInt();
            System.out.println("这个数为 ："+ i);
        }else {
            System.out.println("你输入的不是一个整数数据。");
        }


        System.out.println("请输入一个小数");

        if (scan.hasNextFloat()) {
            f = scan.nextFloat();
            System.out.println("这个小数是" + f);
        }else {
            System.out.println("你输入的这个不是一个小数。");
        }




        scan.close();
    }
}
