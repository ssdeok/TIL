package org.example.compositionprac;

public class Pencil {

    public String color;

    public Pencil(String color) {
        this.color = color;
    }

    public void write(){
        System.out.println("writing! with " + color);
    }
}
