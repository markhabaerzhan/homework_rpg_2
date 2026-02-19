package com.narxoz.rpg.combat;

public class FireShield implements Ability{
    private final int shieldValue;

    public FireShield(int shieldValue) {
        this.shieldValue = shieldValue;
    }
    @Override
    public String getName() {
        return "Fire Shield";
    }
    @Override
    public int getDamage() {
        return 0;
    }
    @Override
    public String getDescription() {
        return "Surrounds the user with fire, blocking up to " + shieldValue + " damage";
    }
    @Override
    public Ability clone() {
        return new FireShield(shieldValue);
    }
}
