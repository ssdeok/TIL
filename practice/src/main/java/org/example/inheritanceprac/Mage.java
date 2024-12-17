package org.example.inheritanceprac;

public class Mage extends Character{
    protected static final int MAX_MP = 100;
    protected int basicHp = 70;
    protected int mpCount;

    public Mage(String name) {
        super(name);
    }

    public int mp(int amount) {
        mpCount += amount;
        return mpCount;

    }

}
