package org.example.inheritanceprac;

public class Main {
    public static void main(String[] args) {
        Person.introduce();
        Student.introduce();

        Student s = new Student();
        s.study();

        System.out.println("parent");
        Parent parent = new Parent("parent Public value");
        System.out.println(parent.publicValue);
//        System.out.println(parent.privateValue);
        System.out.println(parent.protectedValue);
        parent.publicMethod();


        System.out.println();
        System.out.println("child");
        Child child = new Child("child Public value");
//        Child child = new Child("child Public value", "child value");
        System.out.println(child.publicValue);
//        System.out.println(child.privateValue);
        System.out.println(child.protectedValue);
        child.publicMethod();
        child.childMethod();

        System.out.println();
        System.out.println(Parent.staticValue);
        System.out.println(Child.staticValue);

        System.out.println("Animal");
        Animal happy = new Animal("happy", 3);
        happy.makeSound();

        Dog goorm = new Dog("goorm", 3, "puddle");
        goorm.makeSound();

        Cat tom = new Cat("tom", 4);
        tom.makeSound();
        tom.grrr();

        System.out.println();
        System.out.println("Vehicle ");

        Vehicle avante = new Vehicle("Avante");
        avante.addFuel(20);
        avante.increaseSpeed(19);
        System.out.println(avante.speed);
        System.out.println(Vehicle.MAX_FUEL);


        System.out.println();
        System.out.println("Bus");

        Bus county = new Bus("County");
        county.addFuel(30);
        county.increaseSpeed(13);
        System.out.println("county.speed = " + county.speed);
        System.out.println("Bus.MAX_FUEL = " + Bus.MAX_FUEL);
        System.out.println("county.addPassenger(3) = " + county.addPassenger(3));
        county.addFuel(400);
        System.out.println("county.fuel = " + county.fuel);

        System.out.println();
        System.out.println("Character");

        Character basic = new Character("basic");
        basic.attack();


        Worrior worrior = new Worrior("Worrior");
        System.out.println(worrior.health);
        worrior.attack();
        worrior.rageUp();
        worrior.attack();

    }
}
