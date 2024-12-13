package org.example;

public class ClassPractice {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10, 5);
        int rectangleArea1 = rectangle1.calculateArea();
        System.out.println(rectangleArea1);


        Circle circle1 = new Circle(5);
        double circleArea1 = circle1.calculateArea();
        System.out.println(circleArea1);
        // 첫 번째 사각형
//        int width1 = 10;
//        int height1 = 5;
//        int rectangleArea1 = calculateRectangleArea(width1, height1);
//        System.out.println(rectangleArea1);

        // 두 번째 사각형
//        int width2 = 10;
//        int height2 = 5;
//        int rectangleArea2 = calculateRectangleArea(width2, height2);
//        System.out.println(rectangleArea2);
//
//        // 세 번째 사각형
//        int width3 = 10;
//        int height3 = 5;
//        int rectangleArea3 = calculateRectangleArea(width3, height3);
//        System.out.println(rectangleArea3);
//
//        // 첫 번째 원
//        int radius1 = 5;
//        double circleArea1 = calculateCircleArea(radius1);
//        System.out.println(circleArea1);
//
//        // 두 번째 원
//        int radius2 = 10;
//        double circleArea2 = calculateCircleArea(radius2);
//        System.out.println(circleArea2);

    }
    // 사각형의 면적을 구하는 메서드
    public static int calculateRectangleArea(int width, int height) {
        return width * height;
    }

    // 원의 면적을 구하는 메서드
    public static double calculateCircleArea(int radius) {
        return radius * radius * 3.14;
    }

}
