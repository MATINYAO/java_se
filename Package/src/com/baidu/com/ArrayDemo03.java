package com.baidu.com;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[][] arr2 = new int[2][10];
//        System.out.println(arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = j+i;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }

    }


}
