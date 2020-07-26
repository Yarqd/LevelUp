package org.levelup.Lesson3.Methods;

public class Min {
    public int min(int[] Array) {
        int min = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] < min) {
                min = Array[i];
            }
        }
        return min;
    }
}