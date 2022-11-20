package com.baidu.com;

public class MethodsDemo03 {
    public static void main(String[] args) {
        //args 是一个数组，可以用来命令行传参数

        //命令行传参
        //fori 快速for

        for (int i = 0; i < args.length; i++) {
            System.out.println("当前第【"+i+"】"+args[i]);
        }
    }
}
