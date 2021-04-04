package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<>();
        map.put("Аскаров","Марат");
        map.put("Аскаров","Дмитрий");
        map.put("Аскаров","Дмитрий");
        map.put("Сидоров","Дмитрий");
        map.put("Соколов","Валений");
        map.put("Сонин","Валентин");
        map.put("Синицын","Александр");
        map.put("Соколов","Дмитрий");
        map.put("Соколов","Иван");
        map.put("Сорокин","Дмитрий");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
