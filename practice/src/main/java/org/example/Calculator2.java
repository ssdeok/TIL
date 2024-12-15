package org.example;

public class Calculator2 {


    // 덧셈 , 인스턴스 입장에서 실행
    int add(int num1, int num2) {
        return num1 + num2;
    }

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num2;
    }

    int add(double num1, double num2) {
        return (int) (num1 + num2);
    }

    // 클래스 입장에서 실행
    static int staticAdd(int num1, int num2) {
        return num1 + num2;
    }

    // 뺄셈
    int minus(int num1, int num2) {
        return num1 - num2;
    }

    // 곱셈
    int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // 나눗셈
    int divide(int num1, int num2) {
        return num1 / num2;
    }

    //- 두 정수를 활용하여 이항연산을 할 수 있는 계산기 클래스를 구현하시오.
           // - 단, 두 정수는 계산기가 생성될 때 입력된다
}
