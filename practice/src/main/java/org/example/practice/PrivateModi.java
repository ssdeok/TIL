package org.example.practice;

public class PrivateModi {
    public int publicNum = 1;

    private int privateNum = 10;

    public void publicHi() {
        System.out.println("hi, public");
    }

    private void privateHi() {
        System.out.println("hi, private");
    }

    public void sayHi() {
        privateHi();
    }
}
