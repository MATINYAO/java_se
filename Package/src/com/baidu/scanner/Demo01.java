package com.baidu.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器
        Scanner scanner = new Scanner(System.in);
        Scanner abc = new Scanner(System.in);

        System.out.println("使用next方式接收：");


        //has
        if (scanner.hasNext()){
            //接收用户的输入
            String str = scanner.next();
            System.out.println("用户的输入为" + str);

        }

        //IO流，用完需要关掉
        scanner.close();

    }
}
