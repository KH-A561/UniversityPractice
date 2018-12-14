package ru.omsu.imit.course3.patterns.bridge;

import ru.omsu.imit.course3.patterns.bridge.decorator.Attack;
import ru.omsu.imit.course3.patterns.bridge.decorator.BasicAttack;
import ru.omsu.imit.course3.patterns.bridge.decorator.BasicMageAttack;

import java.util.List;

public class Mage implements GameCharacter {
    private String name;
    private float hitPoints;
    private float manaPoints;
    private Inventory inventory;
    private List<String> spells;

    @Override
    public void attack(GameCharacter enemy) {
        Attack basicAttack = new BasicAttack(hitPoints);
        basicAttack = new BasicMageAttack(basicAttack, this, enemy);
        enemy.setHitPoints(enemy.getHitPoints() - basicAttack.computeDamage());
        manaPoints -= manaPoints * 0.1;
        System.out.println(basicAttack);
    }

    @Override
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

    @Override
    public void useItem(String itemName) {
        if (inventory.getItems().get(itemName) instanceof ConsumableItem) {
            ((ConsumableItem) inventory.getItems().get(itemName)).useItem(this);
        } else {
            throw new IllegalArgumentException("Item cannot be used");
        }
    }

    @Override
    public float getHitPoints() {
        return hitPoints;
    }

    @Override
    public void setHitPoints(float hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(float manaPoints) {
        this.manaPoints = manaPoints;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<String> getSpells() {
        return spells;
    }

    public void setSpells(List<String> spells) {
        this.spells = spells;
    }
}
