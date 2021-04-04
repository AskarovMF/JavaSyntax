package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int cat1Win = 0, cat2Win = 0;
        if (this.age> anotherCat.age)
            cat1Win++;
        else if (this.age<anotherCat.age)
            cat2Win++;
        if (this.weight > anotherCat.weight)
            cat1Win++;
        else if (this.weight<anotherCat.weight)
            cat2Win++;
        if (this.strength>anotherCat.strength)
            cat1Win++;
        else if (this.strength<anotherCat.strength)
            cat2Win++;
        if (cat1Win>cat2Win)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

    }
}
