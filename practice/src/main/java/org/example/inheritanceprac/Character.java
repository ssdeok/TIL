package org.example.inheritanceprac;

public class Character {

   private String name;
   private int level;
   protected int hp;
   protected int maxHealth;

    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.hp = 100;
        this.maxHealth = 100;
    }

    public void basicAttack() {
        System.out.println("basic attack");
    }

    public void levelUp() {
        level += 1;
        System.out.println("level = " + level);
    }


//    public boolean monsterKill(int amount) {
//        return amount > 50;
//    }
}
