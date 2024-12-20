package org.example.etc;

public class Main {

    public static void main(String[] args) {
        GenericPrac<Integer> integerGenericPrac = new GenericPrac<Integer>();

        integerGenericPrac.setValue(123);
//        integerGenericPrac.setValue("123");

        GenericPrac<String> stringGenericPrac = new GenericPrac<>();

        stringGenericPrac.setValue("123");

        String word = new String();

        Day monday = Day.MONDAY;


    }
}
