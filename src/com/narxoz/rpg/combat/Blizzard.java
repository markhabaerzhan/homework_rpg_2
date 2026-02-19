package com.narxoz.rpg.combat;

public class Blizzard implements Ability{
    private final int damage;
    private final int radius;

    public Blizzard(int damage, int radius) {
        this.damage = damage;
        this.radius = radius;
    }
    @Override
    public String getName() {
        return "Blizzard";
    }
    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public String getDescription() {
        return "Summons a powerful snowstorm that deals " + damage +
                " ice damage within a radius of " + radius + " m";
    }
    @Override
    public Ability clone() {
        return new Blizzard(damage, radius);
    }
}
