package com.narxoz.rpg.loot;
import java.util.ArrayList;
import java.util.List;

public class IceLootTable implements LootTable{
    private final List<String> items;
    private final int gold;
    private final int experience;

    public IceLootTable() {
        this.items = new ArrayList<>();
        items.add("Ice Gem");
        items.add("Frost Scale");
        items.add("Ice Rune");

        this.gold = 390;
        this.experience = 800;
    }
    private IceLootTable(List<String> items, int gold, int experience) {
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
        return new IceLootTable(new ArrayList<>(items), gold, experience);
    }
}
