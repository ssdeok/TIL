package org.example.inheritanceprac;

public class Parent {
    public String publicValue = "public Value";
    private String privateValue = "private Value";
    protected String protectedValue = "protected Value";

    public static String staticValue = "staticValue";



    public Parent(String publicValue) {
        this.publicValue = publicValue;
    }

    public void publicMethod() {
        System.out.println("public method");
    }

    public static void staticMethod(){
        System.out.println("static method");
    }
}
