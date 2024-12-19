package org.example.compositionprac;

public class Person{

    public String name;
    public Pencil pencil;
    public Tool tool;

//    public Person(String name, Pencil pencil) {
//        this.name = name;
//        this.pencil = pencil;
//    }

    public Person(String name, Tool tool) {
        this.name = name;
        this.tool = tool;
    }

    public void write() {
//        System.out.println("글씨를 쓴다");
        pencil.write();
    }

    public void use() {
        tool.use();
    }

    public void setPencil(Pencil pencil) {
        this.pencil = pencil;
    }

}
