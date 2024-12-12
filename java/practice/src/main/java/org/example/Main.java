package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int value = 3;
//        int[] array = new int[6];
//        Rectangle rect1 = new Rectangle(100, 200);
//        System.out.println(rect1.width);
//        System.out.println(rect1.calculateArea());
//
//        Rectangle rect2 = new Rectangle(10, 1000);
//        System.out.println(rect2.calculateArea());
//
//        String word = new String("hahahoho");
//
//        Circle c1 = new Circle(3);
//        System.out.println(c1.radius);
//        System.out.println(c1.calclateArea());

//        이름 : jun, 나이 : 18
        Person jun = new Person("jun", 18);
        Person jun2 = new Person("jun", 18);
        System.out.println(jun.name);
        System.out.println(jun.age);
        System.out.println(jun == jun2);

        Dog happy = new Dog("pome", "happy");
        happy.seat();
        happy.hand();

        Triangle smallTriangle = new Triangle(4);
        System.out.println(smallTriangle.circumference);
        System.out.println(smallTriangle.caculateArea());

        Car myCar = new Car("Avante");
        myCar.increaseSpeed();
        myCar.increaseSpeed();
        myCar.increaseSpeed();
        myCar.decreaseSpeed();
        myCar.showInfo();
        myCar.increaseSpeedByAmout(110);
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

    }
}

