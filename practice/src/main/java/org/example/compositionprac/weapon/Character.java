package org.example.compositionprac.weapon;

public class Character {
    public int hp;
    public int ap = 10;

    public Weapon weapon;

    public Character(int hp) {
        this.hp = hp;

    }

    public void attack() {
        if (weapon == null) {
            System.out.println("attack!" + ap);

        } else {
            System.out.println("attack" + (ap + weapon.ap));
        }
    }

//    public void attack() {
//        if (weapon.stamina == 0) {
//            System.out.println("basic attack");
//        } else {
//            weapon.ap += weapon.ap;
//            System.out.println("double attack");
//        }
//    }

    public void specialAttack() {
            // 무기를 사용한 특별 공격 구현
        if (weapon instanceof SpecialAttackable) {
            ((SpecialAttackable) weapon).specialAttack();
        }


    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
