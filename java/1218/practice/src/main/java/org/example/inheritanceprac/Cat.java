package org.example.inheritanceprac;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println(name + " nyaong");
    }

    public void grrr(){
        System.out.println("grrr");
    }
}
