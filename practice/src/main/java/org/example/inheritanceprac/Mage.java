package org.example.inheritanceprac;

public class Mage extends Character{
    protected static final int MAX_MP = 100;
    protected int basicHp = 70;
    protected int mpCount;

    public Mage(String name, int hp) {
        super(name, hp);
    }

    public int mp(int amount) {
        mpCount += amount;
        return mpCount;

    }

    @Override
    public void levelup(int amount) {
        level += amount;
        basicHp += 15;
        System.out.println(amount + " level is up " + basicHp + " is plus 15");

    }
}
