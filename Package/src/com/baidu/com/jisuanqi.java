package com.baidu.com;

import java.util.Scanner;

public class jisuanqi {
    public static void main(String[] args) {
        //接收键盘输入
        Scanner scan = new Scanner(System.in);

        //定义结果
        double result = 0;

        System.out.println("请输入第一个数");
        double a = scan.nextDouble();

        System.out.println("请输入运算符（如+ - * %）");
        String method = scan.next();

        System.out.println("请输入第二个数");
        double b = scan.nextDouble();

        scan.close();




//        while (true){
            switch (method){
                case "+":
                    System.out.println(add(a,b));
                    break;
                case "-":
                    System.out.println(sub(a,b));
                    break;
                case "*":
                    System.out.println(mul(a,b));
                    break;
                case "%":
                    System.out.println(div(a,b));
                    break;

 //           }
        }
    }


    public static double add(double i,double j){
        return i+j;
    }
    public static double sub(double i,double j){
        return i-j;
    }
    public static double mul(double i,double j){
        return i*j;
    }
    public static double div(double i,double j){
        return i%j;
    }
}
