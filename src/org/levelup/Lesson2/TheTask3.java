package org.levelup.Lesson2;

import java.util.Random;

public class TheTask3 {
    public static void main(String[] args) {
        System.out.println("Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран.");

        int min = 5;
        int max = 155;
        int diff = max - min;
        Random a = new Random();
        int i = a.nextInt(diff + 1);
        i += min;

        System.out.println("Число: " + i);

        if (i>25 && i<100){
            System.out.println("Наше число: " + i + " попадает в диапазон 25-100.");}

        else {
            System.out.println("Наше число: " + i + "  не попадает в диапазон 25-100");

        }
    }
}
