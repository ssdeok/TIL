package org.example.inheritanceprac;

public class Truck extends Vehicle {
protected static final int MAX_FUEL = 250;
protected int baggageCount;

    public Truck(String model) {
        super(model);
        this.baggageCount = 0;

    }
    public int addBaggage(int amount) {
        baggageCount += amount;
        return baggageCount;
    }

    @Override
    public int getMaxFuel() {
        return MAX_FUEL;
    }


//    public void loadBaggage() {
//        if (fuel <= 250) {
//            System.out.println("baggage is light");
//        } else {
//            System.out.println("baggage is heavy");
//        }
//
//    }

}
