package com.baidu.com;

public class FunctionDemo01 {
    public static void main(String[] args) {
    int sum = add(1,2);
        System.out.println(sum);

        int sum2 = add(1,2,3);
        System.out.println(sum2);
        //test();
    }


    //程序中创建然后被调用
    //一个方法只做一个功能
    public static int add(int a,int b){
        return a+b;
    }

    public static int add(int a,int b, int c){
        return a+b+c;
    }


    public static void test(){
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(i+"*"+j+"="+(j*i)+"\t");
            }
            System.out.println();
    }
}}
