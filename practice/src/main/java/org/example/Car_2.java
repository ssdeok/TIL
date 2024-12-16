package org.example;

public class Car_2 {

    String model;
    int speed;

    public Car_2(String model, int speed) {
        this.model = model;
        this.speed = 0;
    }

    int increaseSpeed() {
        this.speed += 10;
        return this.speed;
    }

    int decreaseSpeed() {
        if (this.speed != 0) {
            this.speed -= 10;
        }
        return this.speed;
    }

    void showInfo() {
        System.out.println("model : " + this.model + " speed : " + this.speed);
        System.out.printf("model : %s speed : %d \n", model, speed);
    }


}
