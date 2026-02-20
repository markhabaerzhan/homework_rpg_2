package com.narxoz.rpg;
import com.narxoz.rpg.builder.*;
import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.prototype.EnemyRegistry;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Enemy System - Creational Patterns Capstone ===\n");
        System.out.println("PART 1: ABSTRACT FACTORY  ");
        EnemyComponentFactory fireFactory = new FireComponentFactory();
        EnemyComponentFactory iceFactory = new IceComponentFactory();
        EnemyComponentFactory shadowFactory = new ShadowComponentFactory();
        System.out.println("Fire Factory Components:");
        fireFactory.createAbilities().forEach(a ->
                System.out.println("- " + a.getName()));
        System.out.println(fireFactory.createLootTable().getLootInfo());
        System.out.println("AI: " + fireFactory.createAIBehavior());
        System.out.println(" Ice Factory Components:");
        iceFactory.createAbilities().forEach(a ->
                System.out.println("- " + a.getName()));
        System.out.println(iceFactory.createLootTable().getLootInfo());
        System.out.println("AI: " + iceFactory.createAIBehavior());

        System.out.println(" PART 2: BUILDER ");
        Enemy fireDragon = new BossEnemyBuilder()
                .setName("Ancient Fire Dragon")
                .setHealth(63100)
                .setDamage(450)
                .setDefense(260)
                .setSpeed(50)
                .setElement("FIRE")
                .setAbilities(fireFactory.createAbilities())
                .setLootTable(fireFactory.createLootTable())
                .setAI(fireFactory.createAIBehavior())
                .addPhase(1, 50000)
                .addPhase(2, 30000)
                .addPhase(3, 15000)
                .build();
        fireDragon.displayInfo();
        System.out.println("Speed: " + fireDragon.getSpeed());
        System.out.println("AI: " + fireDragon.getAI());
        System.out.println("Loot: " + fireDragon.getLootTable().getLootInfo());
        EnemyDirector director = new EnemyDirector(new BossEnemyBuilder());
        Enemy miniBoss = director.createMiniBoss(fireFactory);
        System.out.println(" Director created Mini Boss:");
        miniBoss.displayInfo();
        Enemy raidBoss = director.createRaidBoss(fireFactory);
        System.out.println(" Director created Raid Boss:");
        raidBoss.displayInfo();
        Enemy elite = director.createElite(fireFactory);
        System.out.println(" Director created Elite:");
        elite.displayInfo();
        Enemy minion = director.createMinion(fireFactory);
        System.out.println(" Director created Minion:");
        minion.displayInfo();

        System.out.println(" PART 3: PROTOTYPE ");
        EnemyRegistry registry = new EnemyRegistry();
        registry.registerTemplate("dragon", fireDragon);
        registry.showTemplates();
        DragonBoss eliteDragon =
                (DragonBoss) registry.createFromTemplate("dragon");
        eliteDragon.multiplyStats(2.0);
        System.out.println("Elite Dragon:");
        eliteDragon.displayInfo();
        System.out.println(" Deep Copy Test:");
        System.out.println("Original abilities: " + fireDragon.getAbilities().size());
        System.out.println("Clone abilities: " + eliteDragon.getAbilities().size());

        System.out.println(" PART 4: FULL PIPELINE ");
        EnemyComponentFactory shadow = new ShadowComponentFactory();
        Enemy demonLord = new BossEnemyBuilder()
                .setName("Demon Lord")
                .setHealth(57200)
                .setDamage(600)
                .setDefense(250)
                .setSpeed(45)
                .setElement("SHADOW")
                .setAbilities(shadow.createAbilities())
                .setLootTable(shadow.createLootTable())
                .setAI(shadow.createAIBehavior())
                .addPhase(1, 57200)
                .addPhase(2, 32000)
                .addPhase(3, 14000)
                .build();
        registry.registerTemplate("demon", demonLord);
        DragonBoss greaterDemon =
                (DragonBoss) registry.createFromTemplate("demon");
        greaterDemon.multiplyStats(2.0);
        System.out.println("Greater Demon:");
        greaterDemon.displayInfo();
        System.out.println(" PATTERN SUMMARY ");
        System.out.println("Abstract Factory: Themed component families");
        System.out.println("Builder: Step-by-step enemy construction");
        System.out.println("Factory Method: build() creates Enemy objects");
        System.out.println("Prototype: Template cloning with deep copy");
        System.out.println(" === Demo Complete === ");
    }
}


