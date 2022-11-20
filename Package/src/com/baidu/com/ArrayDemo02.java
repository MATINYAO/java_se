package com.baidu.com;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr1 = {1,3,4,57,9,54};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

//        printArray(arr1);
        System.out.println("=========================");

        //计算所有类型的和
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum+= arr1[i];

        }
        System.out.println("数组的和为 ：" + sum);

        int max = 0;

        //int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            //int max = 0;
            if (arr1[i]>max){
                max = arr1[i];
            }
            //System.out.println("数组中最大的数是 " +max);
        }
        System.out.println("数组中最大的数是 "+ max);


        System.out.println("========================");

        //for echo 循环， 数组名.for   如arr1.for
        //省去了数组的一个下标，适合打印输入
        for (int i : arr1) {
            System.out.println(i);

        }

        System.out.println("printArray 数组输出的");
        printArray(arr1);

        System.out.println("===========================");
        System.out.println("revInt方法输出的");

        int[] b  = revInt(arr1);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

            //方法打印一个数组
            public static void printArray(int[] arrays){
            for (int i = 0; i < arrays.length; i++) {
                System.out.println(arrays[i]);
            }
        }


        //反转数组
        public static int[] revInt(int[] arrays){

            int[] result = new int[arrays.length];
            for (int i = 0; i < arrays.length; i++) {
                result[i] = arrays[arrays.length-i-1];
            }
            return result;
        }

}
