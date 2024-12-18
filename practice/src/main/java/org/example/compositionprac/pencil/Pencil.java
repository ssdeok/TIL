package org.example.compositionprac.pencil;

public class Pencil {

    public String color;

    public Pencil(String color) {
        this.color = color;
    }

    public void write() {
        System.out.println("good color " + color);
    }

}
