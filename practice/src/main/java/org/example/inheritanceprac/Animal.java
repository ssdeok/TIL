package org.example.inheritanceprac;

public class Animal {
    protected String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void soundOn() {
        System.out.println("sound On");
    }

    public int getAge() {
        return age;
    }
}