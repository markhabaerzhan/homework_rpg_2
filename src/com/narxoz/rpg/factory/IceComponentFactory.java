package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.IceLootTable;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;

public class IceComponentFactory implements EnemyComponentFactory {
    @Override
    public List<Ability> createAbilities() {
        return List.of(
                new FrostBreath(168, 3), new IceShield(110), new Blizzard(290, 13));
    }
    @Override
    public LootTable createLootTable() {
        return new IceLootTable();
    }
    @Override
    public String createAIBehavior() {
        return "DEFENSIVE";
    }
}
