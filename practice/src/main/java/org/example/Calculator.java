package org.example;

public class Calculator {
    int num1;
    int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // 덧셈
    int add() {
        return this.num1 + this.num2;
    }

    // 뺄셈
    int minus() {
        return this.num1 - this.num2;
    }

    // 곱셈
    int multiply() {
        return this.num1 * this.num2;
    }

    // 나눗셈
    int divide() {
        return this.num1 / this.num2;
    }

    //- 두 정수를 활용하여 이항연산을 할 수 있는 계산기 클래스를 구현하시오.
           // - 단, 두 정수는 계산기가 생성될 때 입력된다
}
