package com.baidu.scanner;

import java.util.Scanner;

public class Choice01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入：\n");
        String s = scan.nextLine();

        //equals 比较字符串是否一致
        if (s.equals("Hello")){
            System.out.println("你好！");
        }else{
            System.out.println("滚！");
        }
        scan.close();

    }
}
