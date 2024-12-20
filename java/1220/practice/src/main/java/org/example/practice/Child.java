package org.example.practice;

import java.util.Objects;

public class Child extends Parent{
    String name = "beemo";
    int age;
    String gender;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return age == child.age && Objects.equals(name, child.name) && Objects.equals(gender, child.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    public void instanceMethod(){
        System.out.println("Child instance");
    }


    public static void staticMethod(){
        System.out.println("Child static");
    }

    @Override
    public String toString(){
        return name;
    }
}
