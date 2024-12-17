package org.example.inheritanceprac;

public class Animal {
    //    이름, 나이, 소리내기 기능 갖는 Animal 클래스를 구현하시오.
    protected String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("make sound");
    }

    public int getAge() {
        return age;
    }
}
