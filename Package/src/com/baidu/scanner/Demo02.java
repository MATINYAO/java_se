package com.baidu.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("使用nextLine 接收数据\n");


        //经常使用nextLine
        if(scan.hasNextLine()){
            String str =scan.nextLine();
            System.out.println("输入的内容为" + str);
        }

    }
}
