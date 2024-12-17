package org.example.interfaceprac.vehicle;

public class Truck extends Vehicle implements BaggageLoad {
    protected static final int MAX_FUEL = 250;
    protected int baggageCount;

    public Truck(String model) {
        super(model);
        this.baggageCount = 0;
    }

    // 짐이 많을수록 스피드는 낮고, 연료도 낮다
    // 짐이 없으면 스피드도 빠르고, 연료도 많다
    @Override
    public void speed() {
        System.out.println("속도에 따라 트럭에 관한 설정");
    }

    @Override
    public void baggaging() {
        System.out.println("연료에 관해 짐에 관한 설정");
    }
}
