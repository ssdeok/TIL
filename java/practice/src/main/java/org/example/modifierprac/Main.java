package org.example.modifierprac;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("beemo", 18, 183.7);

//        System.out.println(p.name);
        System.out.println(p.getName());
        System.out.println(p.age);
        System.out.println(p.height);

//        p.name = "ken";
        p.setName("ken");
        p.age = 20;
        p.height = 175.3;

        System.out.println(p.getName());
        System.out.println(p.age);
        System.out.println(p.height);

//        p.run();
        p.exercise();
        p.walk();
        p.study();
    }
}
