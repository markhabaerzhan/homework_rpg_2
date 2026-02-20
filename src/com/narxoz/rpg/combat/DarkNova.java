package com.narxoz.rpg.combat;

public class DarkNova implements Ability {
    private final int damage;
    private final int radius;

    public DarkNova(int damage, int radius) {
        this.damage = damage;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Dark Nova";
    }
    @Override
    public int getDamage() {
        return damage;
    }
    @Override
    public String getDescription() {
        return "Releases a dark explosion that deals "  + damage + " shadow damage within a radius of "  + radius + " m";
    }
    @Override
    public Ability clone() {
        return new DarkNova(damage, radius);
    }
}
