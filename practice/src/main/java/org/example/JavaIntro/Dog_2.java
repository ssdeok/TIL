package org.example.JavaIntro;

public class Dog_2 {
  public String breed;
  public String name;

    public Dog_2(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public void seat() {
        System.out.println("here " + this.name + " seat down");
    }

    public void hand() {
        System.out.println("here, hand");
    }
}
