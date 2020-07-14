package org.levelup.Lesson2;

import java.util.Scanner;

public class TheTask10 {
    public static void main(String[] args) {
        System.out.println("Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.");
        System.out.println();

        long b=1;

        System.out.println("Введите натуральное число");
        Scanner scaner = new Scanner(System.in);
        int in = scaner.nextInt();

        if (in<=0){
            System.out.println("Ваше число должно быть положительным");
        } else { for (int a = in; a>0; a--){
            b*=a;
        }
            System.out.println(b);

        }
    }
}
