package com.baidu.com;

public class MethodsDemo01 {
    //void 不需要return ,其他的需要return

    public static void main(String[] args) {

        double result1 =max(10.0,20.0);
        System.out.println("最大数为"+ result1);
    }
    //比大小
    public static int max(int num1,int num2){

        int result = 0;
        if(num1 >num2){
            result = num1;
        } else if (num1 <num2) {
            result = num2;
        } else {
            return 0;
        }
        return result;
        //return 0; 用于结束方法。

    }
//什么是值传递，什么是引用传递
    //即使再小的帆也要远航


    //重构,方法名称必须相同
    // 参数列表必须不相同，类型不同或者参数个数不同，再或者摆列的顺序不同等

    //直接改类型就可以是重构了
    //java 的jvm 可以按照返回的类型来区别类
    public static double max(double num1,double num2){

        double result = 0;
        if(num1 >num2){
            result = num1;
        } else if (num1 <num2) {
            result = num2;
        } else {
            return 0;
        }
        return result;
        //return 0; 用于结束方法。

    }

}
