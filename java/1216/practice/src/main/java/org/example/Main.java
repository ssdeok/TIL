package org.example;


import org.example.javaintro.Dog;
import org.example.practice.*;

import static java.lang.Math.*;
import static org.example.practice.Coffee.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Reactangle
        System.out.println("Rectangle");
        int value = 3;
        int[] array = new int[6];
        Rectangle rect1 = new Rectangle(100, 200);
        System.out.println(rect1.width);
        System.out.println(rect1.calculateArea());

        Rectangle rect2 = new Rectangle(10, 1000);
        System.out.println(rect2.calculateArea());

        String word = "hahahoho";

        // Circle
        System.out.println("Circle");
        Circle c1 = new Circle(3);
        System.out.println(c1.radius);
        System.out.println(c1.calclateArea());

        // Person
        System.out.println("Person");
//        이름 : jun, 나이 : 18
        Person jun = new Person("jun", 18);
        Person jun2 = new Person("jun", 18);
        System.out.println(jun.name);
        System.out.println(jun.age);
        System.out.println(jun == jun2);


        // Dog
        System.out.println("Dog");
        Dog happy = new Dog("pome", "happy");
        happy.seat();
        happy.hand();
        happy.hi();
        Dog.hi();

        // Triangle
        System.out.println("Triangle");
        Triangle smallTriangle = new Triangle(4);
        System.out.println(smallTriangle.circumference);
        System.out.println(smallTriangle.caculateArea());


        // Car
        System.out.println("Car");
        Car myCar = new Car("Avante");
        myCar.increaseSpeed();
        myCar.increaseSpeed();
        myCar.increaseSpeed();
        myCar.decreaseSpeed();
        myCar.showInfo();
        myCar.increaseSpeedByAmout(110);
        myCar.showInfo();

        // MP3Player
        System.out.println("MP3Player");
        MP3Player ipod = new MP3Player("ipod");
        ipod.pushPowerButton();
//        ipod.turnOn();
        ipod.increaseVolume();
        ipod.increaseVolume();
        ipod.increaseVolume();

        ipod.decreaseVolume();

        ipod.showInfo();
        ipod.pushPowerButton();
        ipod.showInfo();

        // Calulator
        System.out.println("Calulator");
        Calculator cal = new Calculator(12, 4);
        System.out.println(cal.add());
        System.out.println(cal.minus());
        System.out.println(cal.multiply());
        System.out.println(cal.divide());
        System.out.println("---------------------");

        Calculator2 cal2 = new Calculator2();
        Calculator2 cal3 = new Calculator2();
        System.out.println(cal2.add(10, 4));
        System.out.println(cal2.minus(30, 12));

        System.out.println(Calculator2.staticAdd(10, 4));
//        System.out.println(Calculator2.add()); // add는 인스턴스 메서드

        // Rectangle static
        System.out.println("Rectangle");
        Rectangle rectangle = new Rectangle(10, 30);
        System.out.println(Rectangle.angleCount);
        Rectangle.angleCount = 10;
        System.out.println("rectangle.angleCount = " + rectangle.angleCount);
        System.out.println(Rectangle.angleCount);

        // Dog static
        System.out.println("Dog");
        Dog poppy = new Dog("puddle", "poppy");
        Dog poppyJunior = new Dog("puddle", "poppy");
        System.out.println(Dog.count);
        System.out.println(Dog.count);

        // Person 생성자
        System.out.println("person");
        Person p1 = new Person();
        Person p2 = new Person("kyle", 19);
        System.out.println(p1.name);
        System.out.println(p2.name);

        taste();
        Bread.taste();

        abs(-3);
        pow(3, 5);
    }
}

