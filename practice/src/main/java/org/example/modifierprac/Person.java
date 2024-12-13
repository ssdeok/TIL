package org.example.modifierprac;

public class Person {
    private String name;
    public int age;
    double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    private void run() {
        System.out.println("running - private");
    }

    public void walk() {
        System.out.println("walk - public");
    }

    void study() {
        System.out.println("study - default");
    }

    public void exercise() {
        run();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
