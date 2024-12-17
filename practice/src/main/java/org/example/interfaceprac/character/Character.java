package org.example.interfaceprac.character;

public abstract class Character {
    protected String name;
    protected int level;
    protected int hp;

    public Character(String name) {
        this.name = name;
        this.level = 1;
        this.hp = 100;
    }

    public void basicAttack() {
        System.out.println("basic attack");
    }

    public abstract void levelUp();
}
