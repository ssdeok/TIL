package org.example.interfaceprac;

import org.example.interfaceprac.vehicle.Bus;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("happy", 17, "puddle");
        dog.makeSound();

        Cat cat = new Cat("cat", 3);
        cat.makeSound();

        System.out.println("---");

        makeThemSound(dog);
        makeThemSound(cat);


    }

    public static void makeThemSound(Animal animal) {

        System.out.println("cry!");
        animal.makeSound();
    }


}
