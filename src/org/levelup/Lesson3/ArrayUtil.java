package org.levelup.Lesson3;

import org.levelup.Lesson3.Methods.Max;
import org.levelup.Lesson3.Methods.Min;

public class ArrayUtil {
    public static void main(String[] args) {

        int [] Array = {12, 15, 27, 17, 11, -4, 0, 273};

        Min a = new Min();
        Max b = new Max();
        System.out.println();
        System.out.println("Минимальное значение: " + a.min(Array));
        System.out.println();
        System.out.println("Максимальное значение: " + b.max(Array));
        }
    }