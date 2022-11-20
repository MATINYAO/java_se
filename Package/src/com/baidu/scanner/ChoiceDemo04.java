package com.baidu.scanner;

public class ChoiceDemo04 {
    public static void main(String[] args) {



        char grade ='G';
        //小心case穿透
        //匹配具体的值
        //if 使用，多在匹配区间有优势

        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("不及格");
                break;

            default:
                System.out.println("输入有误");
        }
    }
}
