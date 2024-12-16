package org.example.inheritanceprac;

public class Child extends Parent{
    public String childValue = "childValue";

    public Child(String publicValue) {
        super(publicValue);
    }

    public Child(String publicValue, String childValue) {
        super(publicValue);
        this.childValue = childValue;
    }

    public void childMethod(){
        System.out.println("childMethod");
    }

    @Override
    public void publicMethod(){
        super.publicMethod();
        System.out.println(super.publicValue);
        System.out.println(super.protectedValue);
        System.out.println("child public method");
    }
}
