package com.narxoz.rpg.combat;

public class MeteorStorm implements Ability{
    private final int damage;
    public MeteorStorm(int damage) {
        this.damage = damage;
    }
    @Override
    public String getName() {
        return "Meteor Storm";
    }
    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public String getDescription() {
        return "Calls down meteors that deal heavy fire damage to all enemies";
    }
    @Override
    public Ability clone() {
        return new MeteorStorm(damage);
    }
}
