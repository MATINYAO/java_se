package com.baidu.object;

import com.sun.corba.se.spi.orbutil.fsm.FSMTest;

public class Demo02 {
    public static void main(String[] args) {
        //静态方法
//        Student.say();


        //非静态方法,无法直接调用，需要实例化
        //对象类型 对象名字
        //实例化的格式
        //对象类型（这个可以是个方法）  对象名 = 对象值
//        Student student = new Student();
//        student.say();
        //真实的开发，都是这么操作的

    }


    // 两个静态方法可以相互调用，两个不是静态方法的也可以相互调用
    public void a(){
        System.out.println("我是a");
        b();
    }

    public void b(){
        System.out.println("我是B");
        a();
    }

    //    public static void a(){
    //        System.out.println("我是a");
    //        b();
    //    }
    //
    //    public static void b(){
    //        System.out.println("我是B");
    //        a();
    //    }

}
