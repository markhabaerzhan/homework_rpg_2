package com.narxoz.rpg.combat;

public class FrostBreath implements Ability{
    private final int damage;
    private final int slowDuration;

    public FrostBreath(int damage, int slowDuration) {
        this.damage = damage;
        this.slowDuration = slowDuration;
    }
    @Override
    public String getName() {
        return "Frost Breath";
    }
    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public String getDescription() {
        return "Deals ice damage and slows target for " + slowDuration + " seconds";
    }
    @Override
    public Ability clone() {
        return new FrostBreath(damage, slowDuration);
    }
}
