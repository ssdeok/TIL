package org.example.interfaceprac.character;

public class Warrior extends Character implements RageUsable{
    protected int rage;
    protected int maxRage;

    public Warrior() {

        this.maxHealth = 120;
        this.health = 120;
        this.maxRage = 100;
        this.rage = 0;
    }

    static Warrior makeWarrior(){
//        추가적인 무언가의 로직
        return new Warrior();
    }

    @Override
    public void attack() {
        System.out.println("attck!");
        increaseRage();
        if (rage == maxRage){
            rageAttack();
        }
    }

    @Override
    public void attack(Character target) {
//    public void attack(DamangeTakable target) {

            System.out.println("attack" + target);
        target.takeDamage(20);
    }

    @Override
    public void takeDamage(int amount) {
        health -= amount;

    }

    @Override
    public void levelUp() {
        level += 1;
        System.out.println("level up");
    }

    @Override
    public void increaseRage(int amount) {
//        rage += 10;
//        if (rage >= maxRage){
//            rage = maxRage;
//        }
        rage = Math.min(maxRage, rage + amount);

    }
    @Override
    public void increaseRage() {

        rage = Math.min(maxRage, rage + 10);

    }


    @Override
    public void rageAttack() {
        System.out.println("rage Attack!");
        rage = 0;

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("rage : " + rage);
    }
}
