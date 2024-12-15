package org.example;

public class Triangle_2 {

    int side;
    int circumference;

    public Triangle_2(int side, int circumference) {
        this.side = side;
        this.circumference = side*3;
    }

    double calculateArea() {
        double area = (Math.sqrt(3) / 4) * side * side;
        area = Math.floor(area * 100) / 100;
        return area;
    }
}

