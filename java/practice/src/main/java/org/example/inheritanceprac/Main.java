package org.example.inheritanceprac;

public class Main {
    public static void main(String[] args) {
        Person.introduce();
        Student.introduce();

        Student s = new Student();
        s.study();

        System.out.println("parent");
        Parent parent = new Parent("parent Public value");
        System.out.println(parent.publicValue);
//        System.out.println(parent.privateValue);
        System.out.println(parent.protectedValue);
        parent.publicMethod();


        System.out.println();
        System.out.println("child");
        Child child = new Child("child Public value");
//        Child child = new Child("child Public value", "child value");
        System.out.println(child.publicValue);
//        System.out.println(child.privateValue);
        System.out.println(child.protectedValue);
        child.publicMethod();
        child.childMethod();


    }
}
