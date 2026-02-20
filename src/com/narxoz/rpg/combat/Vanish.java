package com.narxoz.rpg.combat;

public class Vanish implements Ability {
    private final int evasionBoost;
    private final int duration;

    public Vanish(int evasionBoost, int duration) {
        this.evasionBoost = evasionBoost;
        this.duration = duration;
    }
    @Override
    public String getName() {
        return "Vanish";
    }
    @Override
    public int getDamage() {
        return 0;
    }
    @Override
    public String getDescription() {
        return "Grants stealth and increases evasion by " + evasionBoost + " for " + duration + " seconds";
    }
    @Override
    public Ability clone() {
        return new Vanish(evasionBoost, duration);
    }
}
