package org.example;

class Rectangle {


    static String color = "red";
    static int angleCount =  4;

    int width;
    int height;

    Rectangle() {
//        this.width = 10;
//        this.height = 10;
        this(10, 10);
    }

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int calculateArea() {
        return width * height;
    }



    public void printColor() {
        System.out.println("사각형의 색깔: " + color);
    }
    public void printSize() {
        System.out.println("사각형의 크기: " + width + " x " + height);
    }
}
