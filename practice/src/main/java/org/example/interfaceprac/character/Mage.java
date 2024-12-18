package org.example.interfaceprac.character;

public class Mage extends Character{

    public Mage() {
        this.maxhp = 70;
        this.hp = 70;
    }

    @Override
    public void attack() {

    }

    @Override
    public void attack(Character target) {
        System.out.println("attack" + target);
        target.takeDamage(20);
    }

    @Override
    public void takeDamage(int amount) {
        hp -= amount + 10;
    }

    @Override
    public void levelUp() {

    }
}
