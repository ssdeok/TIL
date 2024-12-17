package org.example.interfaceprac.vehicle;

public abstract class Vehicle {

    protected String model;
    protected int speed;
    protected int fuel;
    protected static final int MAX_FUEL = 100;

    public Vehicle(String model) {
        this.model = model;
        this.speed = 0;
        this.fuel = 0;
    }


    public abstract void speed();

}
