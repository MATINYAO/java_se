package com.baidu.cycle;

public class ForDemo01 {
    public static void main(String[] args) {
        for(int a= 3;a <= 100; a+=2){
            System.out.println(a);
        }



        //关于for循环，初始化可能为空
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        //for()死循环
//        for(;;){
//            System.out.println("a");
//        }


        int oddSum = 0;
        int evenSum = 0;

//        for (int i = 1; i < 100; i+=2) {
//
//            oddSum += i;
//        }
//
//        for (int i = 0; i < 100; i+=2) {
//
//            evenSum += i;
//        }
//
//        System.out.println("奇数和 ："+oddSum);
//        System.out.println("偶数和 ："+evenSum);

        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                oddSum += i;
            }else{
                evenSum += i;
            }

        }

        //100.for
        System.out.println("奇数和 ："+oddSum);
        System.out.println("偶数和 ："+evenSum);

    }
}
