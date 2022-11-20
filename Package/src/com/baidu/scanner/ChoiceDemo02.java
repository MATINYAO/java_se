package com.baidu.scanner;

import java.util.Scanner;

public class ChoiceDemo02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的成绩：");
        double score = scan.nextDouble();
        try{
        if (score>=60){
            System.out.println("恭喜你考试合格！");
        }else {
            System.out.println("很可惜，考试不合格，再接再厉！");
        }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("输入有误");
        }
    }
}
