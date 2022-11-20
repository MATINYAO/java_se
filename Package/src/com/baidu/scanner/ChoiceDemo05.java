package com.baidu.scanner;

import java.util.Scanner;

public class ChoiceDemo05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        String name = "martinding";

        String name = scan.nextLine();
        switch (name){
            case "martinding":
                System.out.println("丁师傅您来啦！");
                break;
            case "caijisrc":
                System.out.println("菜鸟src！");
                break;
            case "aaaaa":
                System.out.println("aaa！");
                break;
            case "999999":
                System.out.println("丁师傅您来啦！");
                break;
            default:
                System.out.println("你好！");
        }
    }
}
