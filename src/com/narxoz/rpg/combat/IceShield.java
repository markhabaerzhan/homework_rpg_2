package com.narxoz.rpg.combat;

public class IceShield implements Ability{
    private final int defenseBoost;

    public IceShield(int defenseBoost) {
        this.defenseBoost = defenseBoost;
    }
    @Override
    public String getName() {
        return "Ice Shield";
    }
    @Override
    public int getDamage() {
        return 0;
    }
    @Override
    public String getDescription() {
        return "Creates an icy barrier that increases defense by " + defenseBoost + " ";
    }
    @Override
    public Ability clone() {
        return new IceShield(defenseBoost);
    }
}
