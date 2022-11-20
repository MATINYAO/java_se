package com.baidu.object;

public class Demo03 {
    public static void main(String[] args) {
        // 类型  变量名 = new 类
        int add = new Demo03().add(9,10);
        System.out.println(add);

        int a=1;
        System.out.println(a);

        Demo03.change(a);
        System.out.println(a);
    }


    //实际参数和形式参数保证参数的类一致
    public int add(int a,int b ){
        return a+b;
    }


    //值传递和引用传递
    public static void change(int a){
        a =10;
        return;
    }

}
