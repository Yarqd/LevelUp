package org.levelup.Lesson2;

import java.util.Scanner;

public class Prog1 {

    //1. Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным либо нечётным.

    public static void main(String[] args) {

        int inputNumber;

        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();

        if (inputNumber%2==0){
            System.out.println("Выше число: " + inputNumber + " чётное");
        } else {
            System.out.println("Ваше число: " + inputNumber + " не чётное");
        }
    }
}
