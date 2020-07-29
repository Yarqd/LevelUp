package org.levelup.Lesson3.Methods;

public class Max {
    public static int max (int[] Array){
        int max = Array[0];
        for (int i = 1; i < Array.length; i++){
            if (Array[i] > max){
                max = Array[i];
            }
        }
        return max;
    }
}
