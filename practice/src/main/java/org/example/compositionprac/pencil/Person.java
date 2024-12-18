package org.example.compositionprac.pencil;

public class Person {

    public String name;
    public Pencil pencil;

    public Person(String name, Pencil pencil) {
        this.name = name;
        this.pencil = pencil;
    }

    public void write() {
//        System.out.println("글씨를 쓴다");
        pencil.write();
    }

    public void setPencil(Pencil pencil) {
        this.pencil = pencil;
    }
}
