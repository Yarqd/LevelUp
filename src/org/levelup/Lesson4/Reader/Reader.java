package org.levelup.Lesson4.Reader;

public abstract class Reader {

    private String name;
    private int number;
    private String fac;
    private double happyBirthday;
    private int mob;

    public Reader(String name, int number, String fac, double happyBirthday, int mob){
        this.name = name;
        this.number = number;
        this.fac = fac;
        this.happyBirthday = happyBirthday;
        this.mob = mob;
    }

    public void takeBook(){
        System.out.println("Взял 3 книги");
    }
    public void returnBook(){
        System.out.println("Вернул 3 книги");
    }
}