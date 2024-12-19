package org.example.compositionprac;

public class Main {
    public static void main(String[] args) {
//        Pencil red = new Pencil("red");
//        Person beemo = new Person("beemo", red);
//
//        beemo.write();
//
//        Pencil blue = new Pencil("blue");
//        beemo.setPencil(blue);
//
//        beemo.write();
//        System.out.println();
//
//        Pencil yellow = new Pencil("yellow");
//        beemo.setPencil(yellow);
//        beemo.write();



        Engine e10 = new Engine(10);
        Engine e20 = new Engine(20);

        Car carE10 = new Car("avante", e10);
        Car carE20 = new Car("sonata", e20);

        carE10.speedUP();
        System.out.println(carE10.speed);

        carE20.speedUP();
        System.out.println(carE20.speed);

        //Person
        Pencil pencil = new Pencil("red");

        Person p1 = new Person("beemo", pencil);
        p1.use();

        p1.tool = carE20;
        System.out.println(carE10.speed);
        p1.use();
        System.out.println(carE10.speed);


    }
}

// Person new Person(name, 도구)

// person.use() => 도구로 pencil => 연필을 사용하고
// .user() 도구로 car를 가지고 있다 => 속력을 높이자