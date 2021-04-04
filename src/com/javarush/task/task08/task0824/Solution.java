package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> children = new ArrayList<>();
        ArrayList<Human> childrenSokrat = new ArrayList<>();
        ArrayList<Human> childrenOlga = new ArrayList<>();
        ArrayList<Human> childrenVadim = new ArrayList<>();
        ArrayList<Human> childrenTamara = new ArrayList<>();
        ArrayList<Human> childrenMaxim = new ArrayList<>();
        ArrayList<Human> childrenLarisa = new ArrayList<>();
        Human boris = new Human("Борис", true, 12, children);
        Human olesya = new Human("Олеся", false, 8, children);
        Human denis = new Human("Денис", true, 5, children);
        childrenSokrat.add(boris);
        childrenSokrat.add(olesya);
        childrenSokrat.add(denis);
        childrenOlga.addAll(childrenSokrat);

        Human sokrat = new Human("Сократ", true, 37, childrenSokrat);
        Human olga = new Human("Ольга", false, 36, childrenOlga);
        childrenVadim.add(sokrat);
        Human vadim = new Human("Вадим", true, 62, childrenVadim);
        childrenTamara.addAll(childrenVadim);
        Human tamara = new Human("Тамара", false, 60, childrenTamara);
        childrenMaxim.add(olga);
        Human maxim = new Human("Максим", true, 65, childrenMaxim);
        childrenLarisa.addAll(childrenMaxim);
        Human larisa = new Human("Лариса", false, 63, childrenLarisa);

        System.out.println(boris.toString());
        System.out.println(olesya.toString());
        System.out.println(denis.toString());
        System.out.println(sokrat.toString());
        System.out.println(olga.toString());
        System.out.println(vadim.toString());
        System.out.println(tamara.toString());
        System.out.println(maxim.toString());
        System.out.println(larisa.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human (String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age= age;
            this.children = children;
        }
        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age= age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
