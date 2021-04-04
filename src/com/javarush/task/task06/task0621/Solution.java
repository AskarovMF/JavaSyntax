package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat grandFather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat grandMother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, null,grandFather);

        String motherName = reader.readLine();
        Cat mother = new Cat(motherName, grandMother,null);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, mother,father);

        String daughterName = reader.readLine();
        Cat daughter = new Cat(daughterName, mother,father);

        System.out.println(grandFather.toString());
        System.out.println(grandMother.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son.toString());
        System.out.println(daughter.toString());
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent, Cat father) {
            this.name = name;
            this.parent = parent;
            this.father = father;
        }

        @Override
        public String toString() {
            if (parent == null & father==null)
                return "The cat's name is " + name + ", no mother " + ", no father";
            else if (father == null)
                return "The cat's name is " + name + ", mother is " + parent.name + ", no father";
            else if (parent == null)
                return "The cat's name is " + name + ", no mother " + ", father is " + father.name;
            else
                return "The cat's name is " + name + ", mother is " + parent.name + ", father is " + father.name;
        }
    }

}
