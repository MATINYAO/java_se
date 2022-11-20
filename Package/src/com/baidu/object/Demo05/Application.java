package com.baidu.object.Demo05;

//只放一个mian的类
public class Application {
    public static void main(String[] args) {

        //实例化了一个对象
//        Person person = new Person("狂神",22);
//
//        System.out.println(person.name);
        Student03 s1 = new Student03();


        //设置变量，操作set方法
        s1.setName("martinding");

        //通过get方法获取参数
        s1.getName();
        System.out.println(s1.getName());

        //get/set  ，提供一些可以操作这个属性的方法！
        //提供一些public 的get、set方法

        s1.setAge(1);
        System.out.println(s1.getAge());



    }
}

/*
        //抽象的类。需要具体实例化出来
        //类的实例化,默认初始化为null
        Student1 zhangsan = new Student1();
        zhangsan.name = "张三";
        zhangsan.age = 22;
        Student1 lisi = new Student1();
        lisi.name = "李四";


        System.out.println("=====================");
        System.out.println(zhangsan.name);
        zhangsan.study();


        System.out.println("==========================");
        System.out.println(lisi.name);
        lisi.study();
 */