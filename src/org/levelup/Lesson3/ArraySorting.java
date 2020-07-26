package org.levelup.Lesson3;

import org.levelup.Lesson3.Methods.BubleSort;


class ArraySorting {
    public static void main(String[] args) {

        int [] arr = {12, 15, 27, 17, 11, -4, 0, 273};

        BubleSort a = new BubleSort();

        System.out.println("Массив :" + a.bublesort(arr));
    }
}