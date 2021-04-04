package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Аскаро", dateFormat.parse("MAY 1 2012"));
        map.put("Секиров", dateFormat.parse("MAY 1 2012"));
        map.put("Шадоу", dateFormat.parse("MAY 1 2012"));
        map.put("Уиллис", dateFormat.parse("MAY 1 2012"));
        map.put("Моррис", dateFormat.parse("MAY 1 2012"));
        map.put("Дорис", dateFormat.parse("MAY 1 2012"));
        map.put("Элмо", dateFormat.parse("MAY 1 2012"));
        map.put("Коббейн", dateFormat.parse("MAY 1 2012"));
        map.put("Симпсон", dateFormat.parse("MAY 1 2012"));
        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().toString().contains("Jun") || pair.getValue().toString().contains("Jul") || pair.getValue().toString().contains("Aug")){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}
