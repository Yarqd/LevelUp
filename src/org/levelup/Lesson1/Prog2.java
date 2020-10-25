package org.levelup.Lesson1;

public class Prog2 {

    //Написать программу осуществляющую решение линейного уравнения ax + b = 0. a и b задаете в программе, х выводите на экран.

    public static void main(String[] args) {

        float a = 17;
        float b = 34;
        //Для решения уравнения, выносим b в правую часть уравнения и меняем знак на противоположный: ax = -b
        // 17 * x = -34 для решения нужно b разделить на a
        float newB = b * (-1);
        float x = newB / a;

        System.out.println("Х = " + x);
    }
}
