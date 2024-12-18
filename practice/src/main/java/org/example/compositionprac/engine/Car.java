package org.example.compositionprac.engine;

public class Car {

    public String model;
    public Engine engine;
    public int speed;


    public Car(String model) {
        this.model = model;
        this.speed = 0;
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void accel() {
        // 엔진의 마력에 따라 속도가 크게 빨라진다

        engine.horsepower += 1;
        speed += 1;
        System.out.println("speed up!" + this.engine.horsepower);
    }

}
