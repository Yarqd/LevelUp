package org.levelup.lesson1;

public class MathOperation {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        //"my english is perfect" :DDD
        long summa = a + b;
        long raznost = a - b;
        long proizvedenie = a * b;
        long chasnoe = a / b;

        System.out.println("Сумма: " + summa);
        System.out.println("Разность: " + raznost);
        System.out.println("Произведение: " + proizvedenie);
        System.out.println("Часное: " + chasnoe);
        System.out.println("Результат интересный. Частное должно быть 0.5 но int округляет до целого. Попробую во float >>>");
        System.out.println();

        float c = 10;
        float d = 20;

        float summaF = c + d;
        float raznostF = c - d;
        float proizvedenieF = c * d;
        float chasnoeF = c / d;

        System.out.println("Сумма: " + summaF);
        System.out.println("Разность: " + raznostF);
        System.out.println("Произведение: " + proizvedenieF);
        System.out.println("Часное: " + chasnoeF);
        System.out.println("Float Занимает в 2 раза меньше память чем Long + результат деления для восприятия человеком лучше. Возможно Float лучше использовать при создании калькулятора.");
        System.out.println();
        System.out.println("Попробуем char");

        char e = '\u0417';
        char f = '\u0438';
        char g = '\u043D';
        char h = '\u0430';
        System.out.println("e = " +e);
        System.out.println("f = " +f);
        System.out.println("g = " +g);
        System.out.println("h = " +h);
        System.out.println();
        System.out.println("Сложим первые 2 буквы. Ожидаю, что получится: Зи ");
        System.out.println();
        System.out.print("Ответ: ");
        System.out.println(e + f);
        System.out.println("Моё предположение не верно. Воспользовавшись програмистским калькулятором, я понял что SOUT складывает значения в 10-ной системе счисления, а в char 16-ричная система. НО Если записать немного по другому..");
        System.out.println("Ответ: " + e + f);
        System.out.println("Я могу только предположить, что при выводе чисел sout использует 10-ную систему счисления. При выводе символов: 16-ричную");
    }
}
