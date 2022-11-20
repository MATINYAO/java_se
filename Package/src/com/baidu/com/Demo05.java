package com.baidu.com;

public class Demo05 {
    //递归减少代码量

    public static void main(String[] args) {
    }
        public static int  f ( int n){

            if (n == 1) {
                return 1;
            } else {
                return n * f(n - 1);
            }
    }


}


//new 一个类
//        Demo05 abc = new Demo05();
//        abc.test();

//    public void test(){
//        test();
////        int i=0;
////        i++;
////        if (i==3){
////            break;
////        }
//    }
//计算一个阶乘