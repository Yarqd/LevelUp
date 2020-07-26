package org.levelup.Lesson3;

import org.levelup.Lesson3.Methods.Flip;

public class Point {
    public static void main(String[] args) {

        int x = -3;
        int y = 2;
        System.out.println();
        System.out.println("Ваши кординаты: (" + x + ", " + y + ")");
        System.out.println();

        Flip a = new Flip();
        Flip b = new Flip();

        System.out.print("Ваши новые координаты: (" + a.Flipx(x));
        System.out.println(", " + b.Flipy(y) + ")");
    }
}
