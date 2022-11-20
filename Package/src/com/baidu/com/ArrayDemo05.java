package com.baidu.com;

import java.util.Arrays;

//冒泡排序
public class ArrayDemo05 {
    public static void main(String[] args) {
        //冒泡排序
        int[] a = {1,99,2321,34252345,12,355,123};
        sort(a);
        System.out.println(Arrays.toString(a));
        //Arrays.toString(a);
    }

    public static int[]  sort(int[] array){
        //内层循环
        for (int i = 0; i < array.length-1; i++) {
            //内层循环
//            int tmp = 0;
//            if (array[i]>array[i+1]){
//                int tmp = 0;
//                tmp  = array[i+1];
//                array[i+1]= array[i];
//                array[i] = tmp;

            for (int j = 0; j < array.length -1 -i; j++) {
                if (array[j]>array[j+1]){
                int tmp = 0;
                tmp  = array[j+1];
                array[j+1]= array[j];
                array[j] = tmp;
            }

            }

        }
        return array;
    }
}
