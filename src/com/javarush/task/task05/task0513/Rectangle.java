package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int top;
    private int left;
    private int width=0;
    private int height = 0;

    public void initialize (int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize (int top, int left){
        this.top = top;
        this.left = left;
        this.width=0;
        this.height=0;
     }
    public void initialize (int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public void initialize (Rectangle top, Rectangle left, Rectangle width, Rectangle height){
        this.top = this.top;
        this.left = this.left;
        this.width = this.width;
        this.height = this.height;
    }


    public static void main(String[] args) {

    }
}
