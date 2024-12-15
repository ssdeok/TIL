package org.example;

public class Triangle {

        int side;
        int circumference;

    public Triangle(int side) {
        this.side = side;
        this.circumference = side *3;
    }
    // 입력 : 안받죠, // 넓이 계산 // 어떤걸 return 넓이
   double calculateArea() {
    double area = (Math.sqrt(3) / 4 ) * side*side;
    area = Math.floor(area*100)/100;
    return area;
    }
}
//    public static int calculateTriangleLengh(int length1, int length2, int length3) {
//
//        return length1 + length2 + length3;
//    }
//
//    public static int calculateTriangleArea(int length1, int length2, int length3) {
//        return (length1 * (length2+length3)) / 2;
//    }

