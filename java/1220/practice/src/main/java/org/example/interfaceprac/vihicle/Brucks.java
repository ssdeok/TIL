package org.example.interfaceprac.vihicle;


public class Brucks extends Vehicle implements CargoLendable, PassengerBoardable {
    @Override
    public void lendMethod() {
        System.out.println("Brucks : lend method");
    }

    @Override
    public void boardMethod() {
        System.out.println("Brucks : board method");
    }

    @Override
    void fuelMethod() {
        System.out.println("Brucks : board method");
    }
}
