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

        System.out.println("Animal");
        Animal happy = new Animal("happy", 3);
        happy.soundOn();

        Dog goorm = new Dog("goorm", 3, "puddle");
        goorm.soundOn();

        Cat tom = new Cat("tom", 4);
        tom.soundOn();
        tom.grrr();

        System.out.println();
        System.out.println();
        Vehicle sonata = new Vehicle("sonata");

//
//        Bus bus = new Bus("school", 30, 400);
//        bus.pickupPassenger();
//
//        Truck truck = new Truck("ford", 50, 200);
//        truck.loadBaggage();

        Character basic = new Character("basic");
        basic.basicAttack();
        basic.levelUp();

        Warrior warrior = new Warrior("Warrior");
        System.out.println(warrior.hp);

        System.out.println();

        warrior.basicAttack();
        warrior.rageUp();
        warrior.basicAttack();

    }
}
