package com.baidu.com;

public class MethodsDemo04 {
    public static void main(String[] args) {
        //可变参数，不定项参数
        //指定参数类型后加一个 省略号
        // 一个方法中只能指定一个可变参数，它必须是最后一个参数，任何不同的参数必须在它之前声明
        MethodsDemo04 demo04 = new MethodsDemo04();
        MethodsDemo04.test(1,2,3,4,5);
//        test(1,2,3,4,5);

    }
    public static void test(int x,int... i){
        System.out.println(i[0]+"\t");
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);

    }
}
