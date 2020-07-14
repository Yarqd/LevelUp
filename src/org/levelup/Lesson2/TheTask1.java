package org.levelup.Lesson2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TheTask1 {
    public static void main(String[] args) {
        System.out.println("Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным либо нечётным.");
        System.out.println();
        System.out.println("Введите число:");

        int n = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if (n%2==0){
            System.out.println("Ваше число: " + n + " Чётное!");
        }
        else {
            System.out.println("Ваше число: " + n + " Не чётное!");
        }

    }
}
