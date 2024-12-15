package org.example;

public class Triangle {
    int side;
    int circumference;

    public Triangle(int side) {
        this.side = side;
        this.circumference = side * 3;
    }
    // 입력 : 안받죠. // 넓이 계산 // 어떤걸 return 넓이
    double caculateArea(){
        double area = (Math.sqrt(3) / 4) * side * side;
        area = Math.floor(area*100)/100;
        return area;
    }
}
