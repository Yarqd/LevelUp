package org.levelup.Lesson2;

import java.util.Random;

public class TheTask5 {
    public static void main(String[] args) {
        System.out.println("В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.");
        System.out.println("Создать программу, которая переставит числа в переменных таким образом,");
        System.out.println("чтобы при выводе на экран последовательность a, b и c оказалась строго возрастающей.");

        int a = -208;
        int b = 1;
        int c = 0;
        System.out.println();
        System.out.println("Наша последовательность:");

        if (a < b && a < c && b < c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a < b && a < c && c < b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b < a && b < c && a < c) {
            System.out.println (b + " " + a + " " + c);
        } else if (b < a && b < c && c < a) {
            System.out.println (b + " " + c + " " + a);
        } else if (c < a && c < b && a < b) {
            System.out.println (c + " " + a + " " + b);
        } else
            System.out.println(c + " " + b + " " + a);
    }
}