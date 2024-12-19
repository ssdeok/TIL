package org.example.compositionprac;

public class Car implements Tool {

    public String model;
    public Engine engine;
    public int speed;

    public Car() {
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.speed = 0;
    }

    public void speedUP() {
        int amount = engine.horsepower;
        speed += amount;
    }

    @Override
    public void use() {
        speedUP();
    }


//    public void accel() {
//        // 엔진의 마력에 따라 속도가 크게 빨라진다
//
//        engine.horsepower += 1;
//        speed += 1;
//        System.out.println("speed up!" + this.engine.horsepower);
//    }

}
