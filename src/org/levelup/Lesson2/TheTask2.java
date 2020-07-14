package org.levelup.Lesson2;

import java.util.Scanner;

import static java.lang.Math.abs;

public class TheTask2 {
    public static void main(String[] args) {
        System.out.println("Создать программу, выводящую на экран ближайшее к 10 из двух положительных чисел, записанных в переменные m и n");
        System.out.println();
        System.out.println("Что бы числа были положительными, к ним будет применён модуль");
        System.out.println("Введите первое число:");

        float m = 0;
        Scanner inm = new Scanner(System.in);
        m = inm.nextFloat();
        m = abs(m);

        System.out.println("Введите второе число");

        float n = 0;
        Scanner inn = new Scanner(System.in);
        n = inn.nextFloat();
        n = abs(n);

        if (abs(m-10)>abs(n-10)){
            System.out.println("Число: " + n +" Ближайшее к 10");
        }
        else {
            System.out.println("Число: " + m + " Ближайшее к 10");
        }
    }
}
