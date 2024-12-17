package org.example.interfaceprac.vihicle;

public abstract class Vehicle {

    protected int maxFuel = 100;

    // 연료 관련
    abstract void fuelMethod();

    // 속도 관련
//    abstract void speedMethod();
    void speedMethod(){
        System.out.println("vehicle : speed method");
    }
}
