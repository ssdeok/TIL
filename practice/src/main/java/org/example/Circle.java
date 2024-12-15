package org.example;

public class Circle {

    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return radius * radius * 3.14;
    }

//    int radius;
//
//    // 이건 생성자. 클래스의 이름을 그대로 가져옴
//    Circle(int radius) {
//        this.radius = radius;
//    }
//   double calculateArea() {
//        return 3.14 * radius * radius;
//    }
}
