package org.levelup.Lesson2;

public class TheTask9 {
    public static void main(String[] args) {
        System.out.println("Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….");
        System.out.println();
        for (int a =2, b = 1;b<=20; a=a*2, b++){
            System.out.println(a);
        }
    }
}
