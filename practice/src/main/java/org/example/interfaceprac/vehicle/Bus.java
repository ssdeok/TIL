package org.example.interfaceprac.vehicle;

public class Bus extends Vehicle implements PassengerLide {
    protected static final int MAX_FUEL = 300;
    protected int passengerCount;

    public Bus(String model, int speed) {
        super(model);
        this.passengerCount = 20;
        this.speed = speed;
    }

    // 승객이 많으면 스피드가 느리고, 연료가 적다
    // 승객이 없으면 스피드가 빠르고, 연료도 많다

    @Override
    public void speed() {
        if (passengerCount >= 10) {
            speed -= 1;
        } else {
            speed += 1;
        }
        System.out.println(passengerCount + " speed is " + speed);
    }

    @Override
    public void passenger() {
        if (speed >= 10) {
            passengerCount -= 1;
        } else {
            passengerCount += 1;
        }
        System.out.println(speed + " passengerCount is " + passengerCount);

    }
}
