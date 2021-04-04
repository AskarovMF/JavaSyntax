package com.javarush.task.task09.task0927;



import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        map.put("Барсик", new Cat("Барсик"));
        map.put("Мурзик", new Cat("Мурзик"));
        map.put("Котя", new Cat("Котя"));
        map.put("Васька", new Cat("Васька"));
        map.put("Мурка", new Cat("Мурка"));
        map.put("Цезарь", new Cat("Цезарь"));
        map.put("Багира", new Cat("Багира"));
        map.put("Боря", new Cat("Боря"));
        map.put("Виталя", new Cat("Виталя"));
        map.put("Гром", new Cat("Гром"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set <Cat> list = new HashSet<>();
        for (Map.Entry<String, Cat> pair:  map.entrySet()) {
            list.add(pair.getValue());
        }
        return list;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
