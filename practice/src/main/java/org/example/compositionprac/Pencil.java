package org.example.compositionprac;

public class Pencil implements Tool {

    public String color;

    public Pencil(String color) {
        this.color = color;
    }

    public void write() {
        System.out.println("good color " + color);
    }

    @Override
    public void use() {
        write();
    }
}