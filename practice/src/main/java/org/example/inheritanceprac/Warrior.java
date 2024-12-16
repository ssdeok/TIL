package org.example.inheritanceprac;

public class Warrior extends Character {
    protected static final int MAX_RAGE = 100;
    protected int rageCount;
    protected int basicHp = 120;

    public Warrior(String name, int hp) {
        super(name, hp);
        this.rageCount = 0;
    }

    public int rage(int amount) {
        rageCount += amount;
        return rageCount;
    }

    @Override
    public void levelup(int amount) {
        level += amount;
        basicHp += 30;
        System.out.println(amount + " level is up " + basicHp + " is plus 30");

    }
}
