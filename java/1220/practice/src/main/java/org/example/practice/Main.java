package org.example.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Child c1 = new Child();
        Parent c2 = new Child();

        c1.instanceMethod();
        c2.instanceMethod();

        // static 다형성을 적용받지 않음
        c1.staticMethod();
        c2.staticMethod();

        System.out.println(c1);


    }
}
