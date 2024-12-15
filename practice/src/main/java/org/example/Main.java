package org.example;

import org.example.JavaIntro.Dog;
import org.example.practice.*;

import static java.lang.Math.*;
import static org.example.practice.Coffee.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int value = 3;
        int[] array = new int[6];
        Rectangle rect1 = new Rectangle(100, 200);
        System.out.println(rect1.width);
        System.out.println(rect1.calculateArea());

        Rectangle rect2 = new Rectangle(10, 1000);
        System.out.println(rect2.calculateArea());

        String word = new String("hahahoho");

        Circle c1 = new Circle(3);
        System.out.println();


        // 이름 : jun, 나이 : 18
        Person jun = new Person("jun",18 );
        Person jun2 = new Person("jun",18 );
        System.out.println(jun.name);
        System.out.println(jun.age);
        System.out.println(jun == jun2);


        Dog happy = new Dog("pome", "happy");
        happy.seat();
        happy.hand();

        Triangle smallTriangle = new Triangle(4);
        System.out.println(smallTriangle.circumference);
        System.out.println(smallTriangle.calculateArea());

        Car myCar = new Car("Avante");
        myCar.increaseSpeed();
        myCar.increaseSpeed();
        myCar.increaseSpeed();
        myCar.decreaseSpeed();
        myCar.showInfo();
        myCar.increaseSpeedByAmount(110);
        myCar.showInfo();

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

        Calculator cal = new Calculator(12, 4);
        System.out.println(cal.add());
        System.out.println(cal.minus());
        System.out.println(cal.multiply());
        System.out.println(cal.divide());
        System.out.println("-----------------------------------");

        // cal2는 인스턴스
        Calculator2 cal2 = new Calculator2();
        System.out.println(cal2.add(10, 4));
        System.out.println(cal2.minus(30,12));

        // Calculator2는 클래스
        System.out.println(Calculator2.staticAdd(10,4));
//        System.out.println(Calculator2.add()); // add는 인스턴스 매서드라 실행불가능

        System.out.println();
        Rectangle rectangle = new Rectangle(10, 30);
        System.out.println(Rectangle.angleCount);
        Rectangle.angleCount = 10;
        System.out.println("rectangle.angleCount = " + Rectangle.angleCount);
        System.out.println(Rectangle.angleCount);

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

        abs(-1);

    }
}
















