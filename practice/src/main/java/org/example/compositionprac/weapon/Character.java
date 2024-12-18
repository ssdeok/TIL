package org.example.compositionprac.weapon;

public class Character {
    public int hp;
    public Weapon weapon;

    public Character(int hp, Weapon weapon) {
        this.hp = hp;
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon.stamina == 0) {
            System.out.println("basic attack");
        } else {
            weapon.ap += weapon.ap;
            System.out.println("double attack");
        }
    }

    public void specialAttack(String weapon) {
            // 무기를 사용한 특별 공격 구현


    }
}
