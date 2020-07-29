package org.levelup.Lesson3;

public class Calculator {

    int a;
    int b;

    public static int add(int a, int b) { return a+b; }

    public static double add(double a, double b) { return a+b; }

    public static long add(long a, long b) { return a+b; }

    public static int div(int a, int b){ return a-b; }

    public static double div (double a, double b){ return a-b; }

    public static long div (long a, long b){ return a-b; }

    public static int mul(int a, int b) { return a*b; }

    public static double mul(double a, double b) { return (a * b); }

    public static long mul(long a, long b) { return (a * b); }

    public static int sub(int a, int b) { return (a / b); }

    public static double sub(double a, double b) { return (a / b); }

    public static long sub(long a, long b) { return (a / b); }

    public static void main(String[] args) {
        System.out.println(add(12.5,40000.4));
    }
}