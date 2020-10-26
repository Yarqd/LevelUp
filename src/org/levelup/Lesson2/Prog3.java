package org.levelup.Lesson2;

import java.sql.SQLOutput;
import java.util.Random;

public class Prog3 {

    //3. Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100)
    //и сообщать результат на экран.

    public static void main(String[] args) {

        int a;

        Random random = new Random();
        a = random.nextInt(156);

        if (a<=99 && a>=26){
            System.out.println("Число: " + a + " Входит в заданный диапазон");
        } else {
            System.out.println("Число: " + a + " Не входит в заданный диапазон");
        }

    }
}