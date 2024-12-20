package org.example.interfaceprac.vihicle;

public class Truck extends Vehicle implements CargoLendable{
    @Override
    public void lendMethod() {
        System.out.println("Truck : lend method");
    }

    @Override
    void fuelMethod() {
        System.out.println("Truck : fuel method");
    }
}
