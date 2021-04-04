package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name = null;
    private String address = null;
    private String color = "Black";
    private int weight=3;
    private int age = 3;

    public void initialize (String name){
        this.name = name;
        color = "Black";
        weight = 3;
        age = 3;

    }
    public void initialize (String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "Black";
    }
    public void initialize (String name, int age){
        this.name = name;
        this.age = age;
        weight = 3;
        color = "Black";
    }
    public void initialize (int weight, String color){
        this.weight = weight;
        this.color = color;
        age=3;
    }
    public void initialize (int weight, String color, String address){
        this.weight = weight;
        this.color=color;
        this.address =address;
        age=3;
    }


    public static void main(String[] args) {

    }
}
