package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human irina = new Human("Ирина", false,56);
        Human dmitriy = new Human("Дмитрий", true, 57);
        Human zina = new Human("Зина", false, 60);
        Human oleg = new Human("Олег", true, 61);
        Human valentin = new Human("Валентин", true, 30, dmitriy, irina);
        Human maria = new Human("Мария", false, 34, dmitriy, irina);
        Human nadya = new Human("Надя", false, 35, dmitriy, irina);
        Human slava = new Human("Слава", true, 25, oleg, zina);
        Human alla = new Human("Алла", false, 30, oleg,zina);

        System.out.println(irina.toString());
        System.out.println(dmitriy.toString());
        System.out.println(zina.toString());
        System.out.println(oleg.toString());
        System.out.println(valentin.toString());
        System.out.println(maria.toString());
        System.out.println(nadya.toString());
        System.out.println(slava.toString());
        System.out.println(alla.toString());
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name,  boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this(name,sex,age);
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}