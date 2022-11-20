package com.baidu.com;

import java.util.Arrays;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] a = {464,234,1,2356,564243,12,24,546,345};

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        // 直接打，是一个hashcode ，内存地址
        //System.out.println(a);

        //toString 打印
        System.out.println(Arrays.toString(a));
//        Arrays.toString(a);


        //自己写打印数组
        PrintArray(a);

        Arrays.fill(a,2,4,2);
        System.out.println(Arrays.toString(a));
    }

    //直接写一个打印数组元素的方法。代码都是人写，重复造轮子，我不介意，但是我要会写。
    public static void PrintArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (i==0){
                System.out.print("[");
                System.out.print(a[i]+", ");
            } else if (i< a.length-1) {
                System.out.print(a[i]+", ");
            }else {
                System.out.println(a[i]+"]");
            }


        }
    }
}
