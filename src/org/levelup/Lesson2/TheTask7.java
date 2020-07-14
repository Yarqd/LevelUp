package org.levelup.Lesson2;

public class TheTask7 {
    public static void main(String[] args) {
        System.out.println("Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …");
        System.out.println();

        for (int a = 1, b = 1; b <= 55; a=a+2, b=b+1){
            System.out.println(a + " ");
        }
    }
}
