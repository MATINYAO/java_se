package com.baidu.com;

import java.util.Map;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //变量的类型  变量名    =   变量的值;
        //数组类型
        //定义

        //首选这个
        int[] nums;

        //兼容c++，建议使用上面的。
        int num2[];

        //使用new操作符来创建数组
        nums = new int[10];

        //应该可以简单这么写
        int[] num3 = new int[20];   //放二十个变量到里面
        //给数组赋值
        for (int i = 0; i < num3.length; i++) {
            num3[i] = i;

        }


        for (int i = 0; i < num3.length; i++) {
            System.out.println(num3[i]);
        }


        //静态初始化
        int[] abc = {1,2,3,4,56,7,8,9,0};

        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);

        }

        //System.out.println(num3.length);

        //引用类型
        //Man[] mans = {new Man(),new Man()};
        int[] b = new int[10];
        b[0] = 1;
        System.out.println(b[0]);
        System.out.println(b[2]);

    }
}
