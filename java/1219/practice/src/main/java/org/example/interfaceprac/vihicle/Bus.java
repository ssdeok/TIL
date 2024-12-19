package org.example.interfaceprac.vihicle;

public class Bus extends Vehicle implements PassengerBoardable{
    public String busValue = "haha";

    @Override
    public void boardMethod() {
        System.out.println("Bus :board method");
    }

    @Override
    void fuelMethod() {
        System.out.println("Bus :fuel method");
    }

    @Override
    void speedMethod(){
        System.out.println("Bus : speed method");
    }
}
