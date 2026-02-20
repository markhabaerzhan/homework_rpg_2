package com.narxoz.rpg.loot;
import java.util.ArrayList;
import java.util.List;

public class FireLootTable implements LootTable {
    private final List<String> items;
    private final int gold;
    private final int experience;

    public FireLootTable() {
        this.items = new ArrayList<>();
        items.add("Fire Gem");
        items.add("Dragon Scale");
        items.add("Flame Rune");

        this.gold = 430;
        this.experience = 940;
    }
    private FireLootTable(List<String> items, int gold, int experience) {
        this.items = items;
        this.gold = gold;
        this.experience = experience;
    }
    @Override
    public List<String> getItems() {
        return items;
    }
    @Override
    public int getGoldDrop() {
        return gold;
    }
    @Override
    public int getExperienceDrop() {
        return experience;
    }
    @Override
    public String getLootInfo() {
        return "items: " + items + " Gold: " + gold + " Experience: " + experience;
    }
    @Override
    public LootTable clone() {
        return new FireLootTable(new ArrayList<>(items), gold, experience);
    }
}
