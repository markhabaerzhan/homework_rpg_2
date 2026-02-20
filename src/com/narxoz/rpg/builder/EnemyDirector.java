package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.factory.EnemyComponentFactory;

public class EnemyDirector {
    private EnemyBuilder builder;
    public EnemyDirector(EnemyBuilder builder) {
        this.builder = builder;
    }
    public Enemy createMinion(EnemyComponentFactory factory) {
        return builder
                .setName("Minion")
                .setHealth(100)
                .setDamage(15)
                .setDefense(5)
                .setSpeed(30)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .build();
    }
    public Enemy createElite(EnemyComponentFactory factory) {
        return builder
                .setName("Elite Enemy")
                .setHealth(250)
                .setDamage(40)
                .setDefense(15)
                .setSpeed(35)
                .setAbilities(factory.createAbilities())
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .build();
    }
    public Enemy createMiniBoss(EnemyComponentFactory factory) {
        return builder
                .setName("Mini Boss")
                .setHealth(800)
                .setDamage(90)
                .setDefense(40)
                .setSpeed(25)
                .setAbilities(factory.createAbilities())
                .addPhase(1, 800)
                .addPhase(2, 400)
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .build();
    }
    public Enemy createRaidBoss(EnemyComponentFactory factory) {
        return builder
                .setName("Raid Boss")
                .setHealth(5000)
                .setDamage(300)
                .setDefense(150)
                .setSpeed(20)
                .setAbilities(factory.createAbilities())
                .addPhase(1, 5000)
                .addPhase(2, 3000)
                .addPhase(3, 1500)
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .build();
    }
}
