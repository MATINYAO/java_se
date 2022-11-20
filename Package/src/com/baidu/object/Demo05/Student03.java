package com.baidu.object.Demo05;

//封装
//类
public class Student03 {
    //名字,属性私有
    private String name;
    private int id;//学号
    private char sex; //性别

    private int age;

//    public String getName(){
//        return this.name;
//    }
//
//    //set 给这个数据设置值
//    public void setName(String name){
//        this.name = name;
//    }

    //alt + insert 可以自动生成get set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setSex(char sex,int age){
        this.sex = sex;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=150 || age<0){
            System.out.println("年龄异常");
            this.age = 0;
        }else {
            this.age = age;
        }

    }

    //学习

    //睡觉

}
