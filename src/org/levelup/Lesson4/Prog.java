package org.levelup.Lesson4;

import org.levelup.Lesson4.Reader.Reader;

public class Prog {
    public static void main(String[] args) {

    Reader one = new Reader("Марк", 12, "Робототехника", 10.10, 9406202) {
        @Override
        public void takeBook() {
            super.takeBook();
        }
        };
        System.out.println();
    }
}