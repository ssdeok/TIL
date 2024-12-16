package org.example.inheritanceprac;

public class Character {

   protected String name;
   protected int level;
   protected int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.level = 1;
        this.hp = hp;
    }

    public void basicAttack() {
        System.out.println("basic attack");
    }

    public void levelup(int amount) {
        level += amount;
        System.out.println(amount + " level is up");
    }


    public boolean monsterKill(int amount) {
        return amount > 50;
    }
}
