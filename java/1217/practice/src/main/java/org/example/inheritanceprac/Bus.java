package org.example.inheritanceprac;

public class Bus extends Vehicle{
    protected static final int MAX_FUEL = 300;
    protected int passengerCount;

    public Bus(String modelName) {
        super(modelName);
        this.passengerCount = 0;
    }

    public int addPassenger(int amount){
        passengerCount += amount;
        return passengerCount;
    }



    @Override
    public int getMaxFuel(){
        return MAX_FUEL;
    }


}
