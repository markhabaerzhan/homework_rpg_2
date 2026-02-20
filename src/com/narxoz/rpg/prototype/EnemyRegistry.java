package com.narxoz.rpg.prototype;

import com.narxoz.rpg.enemy.Enemy;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EnemyRegistry {
    private Map<String, Enemy> templates = new HashMap<>();
    public void registerTemplate(String key, Enemy enemy) {
        templates.put(key, enemy);
    }
    public Enemy createFromTemplate(String key) {
        Enemy enemy = templates.get(key);
        if (enemy == null) {
            throw new IllegalArgumentException("Template not found: " + key);
        }
        return enemy.clone();
    }
    public void showTemplates() {
        for (String key : templates.keySet()) {
            System.out.println("Template: " + key);
        }
    }
}
