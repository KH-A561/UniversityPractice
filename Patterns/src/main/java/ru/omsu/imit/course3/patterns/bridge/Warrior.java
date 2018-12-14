package ru.omsu.imit.course3.patterns.bridge;

import ru.omsu.imit.course3.patterns.bridge.decorator.Attack;
import ru.omsu.imit.course3.patterns.bridge.decorator.BasicAttack;
import ru.omsu.imit.course3.patterns.bridge.decorator.BasicWarriorAttack;

public class Warrior implements GameCharacter {
    private String name;
    private float hitPoints;
    private float staminaPoints;
    private float damagePoints;
    private Inventory inventory;

    public Warrior(String name, float hitPoints, float staminaPoints, float damagePoints, Inventory inventory) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.staminaPoints = staminaPoints;
        this.damagePoints = damagePoints;
        this.inventory = inventory;
    }

    @Override
    public void attack(GameCharacter enemy) {
        Attack basicAttack = new BasicAttack(damagePoints);
        basicAttack = new BasicWarriorAttack(basicAttack, this, enemy);
        enemy.setHitPoints(enemy.getHitPoints() - basicAttack.computeDamage());
        staminaPoints -= staminaPoints * 0.25;
        System.out.println(basicAttack);
    }

    @Override
    public void useItem(String itemName) {
        if (inventory.getItems().get(itemName) instanceof ConsumableItem) {
            ((ConsumableItem) inventory.getItems().get(itemName)).useItem(this);
        } else {
            throw new IllegalArgumentException("Item cannot be used");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(float hitPoints) {
        this.hitPoints = hitPoints;
    }

    public float getStaminaPoints() {
        return staminaPoints;
    }

    public void setStaminaPoints(float staminaPoints) {
        this.staminaPoints = staminaPoints;
    }

    public float getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(float damagePoints) {
        this.damagePoints = damagePoints;
    }

    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public void setArmor(Armor armor) {
        inventory.setArmor(armor);
    }

    @Override
    public void setWeapon(Weapon weapon) {
        inventory.setWeapon(weapon);
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
