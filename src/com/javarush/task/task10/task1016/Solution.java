package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        result.put(list.get(0),0);
        for (String x: list){
            if(!result.containsKey(x)){
                result.put(x,0);
            }
        }
        for (Map.Entry<String, Integer> pair: result.entrySet()) {
            String word = pair.getKey();
            int num = pair.getValue();
            for (int i = 0; i<list.size(); i++){
                if (word.equals(list.get(i))){
                    result.put(word, ++num);
                }
            }
        }
        return result;
    }

}

