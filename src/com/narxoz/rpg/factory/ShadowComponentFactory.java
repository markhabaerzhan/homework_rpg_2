package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.ShadowLootTable;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;

public class ShadowComponentFactory implements EnemyComponentFactory {
    @Override
    public List<Ability> createAbilities() {
        return List.of( new ShadowStrike(250, 3), new Vanish(40, 5), new DarkNova(400, 8));
    }
    @Override
    public LootTable createLootTable() {
        return new ShadowLootTable();
    }
    @Override
    public String createAIBehavior() {
        return "TACTICAL";
    }
}
