package org.levelup.Lesson1;

public class Prog1 {

    //Написать программу, которая производит математические операции на двумя переменными a и b и вывести результаты на экран.
    //Т.е. должны быть выведены сумма, разность, проиведение и частное.
    //Попробуйте с разными типами a и b. Есть ли среди результатов отличия?
    public static void main(String[] args) {

        byte a = 8;
        byte b = 16;
        System.out.println("Работаем с типом byte:");

        byte sum = (byte) (a+b);
        byte dif = (byte) (a-b);
        byte com = (byte) (a*b);
        byte div = (byte) (a/b);

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + dif);
        System.out.println("Произведение: " + com);
        System.out.println("Частное: " + div);
        System.out.println("Из-за ограниченного диапазона значений byte, следующее число за 127, будет -128");
        System.out.println();
        System.out.println("Работаем с типом данных short:");

        short c = 8;
        short d = 16;

        short sumS = (short) (c+d);
        short difS = (short) (c-d);
        short comS = (short) (c*d);
        short divS = (short) (c/d);

        System.out.println("Сумма: " + sumS);
        System.out.println("Разность: " + difS);
        System.out.println("Произведение: " + comS);
        System.out.println("Частное: " + divS);
        System.out.println("Всё в норме. Данный тип данных не поддерживает дробные числа.");
        System.out.println();
        System.out.println("Работаем с типом данных int:");

        int e = 10;
        int f = 16;

        int sumI = (int) (e+f);
        int difI = (int) (e-f);
        int comI = (int) (e*f);
        int divI = (int) (e/f);

        System.out.println("Сумма: " + sumI);
        System.out.println("Разность: " + difI);
        System.out.println("Произведение: " + comI);
        System.out.println("Частное: " + divI);
        System.out.println("Всё в норме. Данный тип данных не поддерживает дробные числа.");
        System.out.println();

        long j = 10;
        long h = 16;

        long sumL = (long) (j+h);
        long difL = (long) (j-h);
        long comL = (long) (j*h);
        long divL = (long) (j/h);

        System.out.println("Сумма: " + sumL);
        System.out.println("Разность: " + difL);
        System.out.println("Произведение: " + comL);
        System.out.println("Частное: " + divL);
        System.out.println("Всё в норме. Данный тип данных не поддерживает дробные числа.");
        System.out.println();

        float i = 10;
        float g = 16;

        float sumF = (float) (i+g);
        float difF = (float) (i-g);
        float comF = (float) (i*g);
        float divF = (float) (i/g);

        System.out.println("Сумма: " + sumF);
        System.out.println("Разность: " + difF);
        System.out.println("Произведение: " + comF);
        System.out.println("Частное: " + divF);
        System.out.println("Всё в норме.");
        System.out.println("Отличия заключаются в ограничении длинны шкалы допустимых значений, которые помещаются в типы данных, это зависит от резервируемого объема памяти под тип данных");
        System.out.println("Так же, 2 примитивных типа данных: float и double могут быть разделены с остатком.");
    }
}
