package org.example.compositionprac;

public class Character {
    public int health;
    public int power = 10;

    public Weapon weapon;


    public Character(int health) {
        this.health = health;
    }

    public void attack(){

        if (weapon == null){
            System.out.println("attack!" + power);
        } else{
//            System.out.println("attack!" + weapon.power);
            System.out.println("attack!" + (power + weapon.power));
        }
    }

    public void specialAttack(){

        if (weapon instanceof  SpecialAttackable){
            ((SpecialAttackable) weapon).specialAttack();
        }


    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
