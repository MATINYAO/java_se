package com.baidu.scanner;

import java.util.Scanner;

public class ChoiceDemo03 {
    public static void main(String[] args) {
        System.out.println("请输入你的成绩");
        Scanner scan = new Scanner(System.in);
        double score = scan.nextDouble();


        if (score<=100&& score>=80){
            System.out.println("恭喜你获得优！");

        } else if (score>=60&& score<80) {
            System.out.println("恭喜你成绩合格！");

        } else if (score<60 && score>=0) {
            System.out.println("很遗憾，不及格再接再厉！");
        } else {
            System.out.println("成绩不和法");
        }
    }
}
