package com.baidu.object;

import java.io.IOError;
import java.io.IOException;

public class Demo01 {

    //main 方法
    public static void main(String[] args) {
        //面向对象的本质就是： 以类的方式组织代码，以对象的组织(封装)数据。
        // 三大特性： 封装，继承，多态


        max(9,100);
        System.out.println(max(9,200));

    }


    /*
    修饰符 返回值类型 方法名( 方法参数){

    }
     */

    public String sayHello(){

        return "hello world!";
    }


    //没有返回值
    public void hello(){
        //返回一个空值
        return;
    }


    public static int max(int a,int b){
        return a>b ? a:b;
    }


    //break  和 return 的区别
    //break 结束所有循环   ，return 就是方法结束了，返回一个结果，可能为空（void），或者是其他的值（布尔，String,int ....）

    //参数类型和参数名，可以多种，多个


    //数组下标越界Arrayindexout..

    //异常抛出
    public void readFile(String file) throws IOException{

    }


    //方法调用的





}
