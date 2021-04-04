package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String firstName;
        private String lastName;
        private int age;
        private boolean sex;
        private int tall;
        private String hobby;

       public Human(){};
        public Human(String firstName, String lastName){
            this.firstName=firstName;
            this.lastName = lastName;
        }
        public Human(String firstName, String lastName, int age){
            this(firstName,lastName);
            this.age = age;
        }
        public Human(String firstName, String lastName, int age, boolean sex){
            this(firstName,lastName, age);
            this.sex = sex;
        }
        public Human(String firstName, String lastName, int age, boolean sex, int tall){
            this(firstName,lastName, age, sex);
            this.tall = tall;
        }
        public Human(String firstName, String lastName, int age, boolean sex, int tall, String hobby){
            this(firstName,lastName, age, sex, tall);
            this.hobby = hobby;
        }
        public Human(String firstName, String lastName, boolean sex){
            this(firstName,lastName);
            this.sex = sex;
        }
        public Human(String firstName, String lastName, String hobby){
            this(firstName,lastName);
            this.hobby = hobby;
        }
        public Human(String firstName, String lastName, boolean sex, int tall){
            this(firstName,lastName, sex);
            this.tall = tall;
        }
        public Human(String firstName, String lastName, int age, int tall){
            this(firstName,lastName, age);
            this.tall = tall;
        }


    }
}
