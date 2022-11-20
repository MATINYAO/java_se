package com.baidu.object;

//对象和内存
public class Demo04 {
    public static void main(String[] args) {
    Person person = new Person();
        System.out.println(person.name);


        System.out.println("==========================");
        Demo04.change(person);
        System.out.println(person.name);
    }


    public static void change(Person person){

        //实例化后，现在person现在是一个对象，现在是一个具体的对象，可以进行赋值，可以改变
        person.name = "martinding";
    }

}


//定义了一个Person类，有一个属性叫:name：
class Person{
    String name;
}
