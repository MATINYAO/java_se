package com.baidu.cycle;

public class WhileDemo01 {
    public static void main(String[] args) {

        //大多数有停止的机制

//            int i = 0;
//            while (i<=100){
//                System.out.println(i);
//                i++;
//}

        //一直为真，判断条件退出
//        int i = 3;
//        while (true){
//            i++;
//            System.out.println(i);
//            if(i==200){
//                break;
//            }
//        }



        int i =0;
        int sum = 0;
        while (i<=100){

            sum += i;
            System.out.println(sum);
//            sleep(500);
            i++;

        }
        System.out.println(sum);
    }


}
