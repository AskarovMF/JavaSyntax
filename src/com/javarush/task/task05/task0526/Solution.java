package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man boris = new Man("Борис", 32, "Россия");
        Man nikolai = new Man("Николай", 17, "Россия");
        Woman tomara = new Woman("Томара", 25, "Россия");
        Woman veronika = new Woman("Вероника", 25, "Россия");
        System.out.println(boris.name + " " + boris.age + " " + boris.address);
        System.out.println(nikolai.name + " " + nikolai.age + " " + nikolai.address);
        System.out.println(tomara.name + " " + tomara.age + " " + tomara.address);
        System.out.println(veronika.name + " " + veronika.age + " " + veronika.address);
    }

    //напишите тут ваш код
    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String a, int b, String c) {
            name = a;
            age = b;
            address = c;
        }
    }
    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String a, int b, String c) {
            name = a;
            age = b;
            address = c;
        }
    }
}
