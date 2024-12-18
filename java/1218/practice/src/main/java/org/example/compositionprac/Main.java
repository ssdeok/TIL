package org.example.compositionprac;

public class Main {
    public static void main(String[] args) {
        Pencil red = new Pencil("red");
        Person beemo = new Person("beemo", red);

        beemo.write();

        Pencil blue = new Pencil("blue");
        beemo.setPencil(blue);

        beemo.write();
        System.out.println();

        Pencil yellow = new Pencil("yellow");

        Pencil[] pencils = {red, blue, yellow};
        Person lynda = new Person("lynda", pencils);

        lynda.writeMany();


    }
}
