package org.example.interfaceprac.vehicle;

public class Brucks extends Vehicle implements BaggageLoad, PassengerLide {
    protected static final int MAX_FUEL = 1000;
    protected int passengerCount;
    protected int baggageCount;

    // 버스와 트럭의 기능을 동시에 한다고 가정해보자
    public Brucks(String model) {
        super(model);
        this.passengerCount = 0;
        this.baggageCount = 0;
    }

    // 승객과 짐이 많으면 속도도 느리고, 연료도 없다
    // 승객과 짐이 없으면 속도가 빠르고, 연료도 많다.
    @Override
    public void speed() {
        System.out.println("속도와 관련해서 브럭에 대해");
    }

    @Override
    public void baggaging() {
        System.out.println("짐과 관련한 브럭");
    }

    @Override
    public void passenger() {
        System.out.println("승객과 관련한 브럭");
    }
}
