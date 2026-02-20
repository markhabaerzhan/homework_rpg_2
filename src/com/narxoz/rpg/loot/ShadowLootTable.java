package com.narxoz.rpg.loot;
import java.util.ArrayList;
import java.util.List;

public class ShadowLootTable implements LootTable{
    private final List<String> items;
    private final int gold;
    private final int experience;

    public ShadowLootTable() {
        this.items = new ArrayList<>();
        items.add("Shadow Gem");
        items.add("Dark Essence");
        items.add("Shadow Rune");

        this.gold = 555;
        this.experience = 1250;
    }
    private ShadowLootTable(List<String> items, int gold, int experience) {
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
        return new ShadowLootTable(new ArrayList<>(items), gold, experience);
    }
}
