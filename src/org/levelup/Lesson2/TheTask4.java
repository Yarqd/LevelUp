package org.levelup.Lesson2;

import java.util.Random;

public class TheTask4 {
    public static void main(String[] args) {
        System.out.println("Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру. ");

        int min = 100;
        int max = 999;
        int diff = max - min;
        Random random = new Random();
        int a = random.nextInt(diff + 1);
        a += min;

        //К сожалению, если выпадает число с первыми двумя одинаковыми цифрами, программа работает не по задумке. Я не знаю как это исправить, было бы круто это разобрать в ДЗ
        //a=776;

        System.out.println("Рандомное число: " + a);

        int a1 = a / 100;
        int a21 = a / 10;
        int a2 = a21 % 10;
        int a3 = a % 10;

        if (a1 > a2 && a1 > a3) {
            System.out.println("Наибольшая цифра в данном числе: " + a1);
        } else if (a2 > a1 && a2 > a3) {
            System.out.println("Наибольшая цифра в данном числе: " + a2);
        } else {
            System.out.println("Наибольшая цифра в данном числе: " + a3);
        }
    }
}
