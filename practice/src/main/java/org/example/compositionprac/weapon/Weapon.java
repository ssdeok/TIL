package org.example.compositionprac.weapon;

public class Weapon {
    public int ap;
    public int stamina;

    public Weapon(int ap, int stamina) {
        this.ap = ap;
        this.stamina = stamina;
    }

    public int getAp() {
        return ap;
    }

    public int getStamina() {
        return stamina;
    }
}
