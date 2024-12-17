package org.example.inheritanceprac;

import java.sql.SQLOutput;

public class Warrior extends Character {
    private static final int MAX_RAGE = 100;
    private int rageCount;
//    private int basicHp = 120;

    public Warrior(String name) {
        super(name);
        this.rageCount = 0;
        this.hp = 120;
        this.maxHealth = 120;
    }

    @Override
    public void basicAttack() {
        System.out.println("attack!");
        rageCount += 10;

        if (rageCount >= 50) {
            System.out.println("rage attack!");
        }
    }

    public void rageUp() {
        rageCount += 50;
        System.out.println("rage Up!");
    }

//    public int rage(int amount) {
//        rageCount += amount;
//        return rageCount;
//    }

    @Override
    public void levelUp() {
        super.levelUp();
        maxHealth += 30;
        hp += 30;
//        hp = maxHealth;(풀피)
    }

}
