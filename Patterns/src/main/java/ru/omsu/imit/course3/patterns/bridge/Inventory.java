package ru.omsu.imit.course3.patterns.bridge;

import java.util.Map;

public class Inventory {
    private Map<String, Item> items;

    public Inventory(Map<String, Item> items) {
        this.items = items;
    }

    public Item getArmor() {
        return items.get("Armor");
    }

    public void setArmor(Armor armor) {
        putItem(armor);
    }

    public Item getWeapon() {
        return items.get("Weapon");
    }

    public void setWeapon(Weapon weapon) {
        putItem(weapon);
    }

    public void putItem(Item item) {
        if (items.containsKey(item.getName())) {
            items.get(item.getName()).setQuantity(items.get(item.getName()).getQuantity() + item.getQuantity());
        } else {
            items.put(item.getName(), item);
        }
    }

    public Map<String, Item> getItems() {
        return items;
    }

    public void setItems(Map<String, Item> items) {
        this.items = items;
    }
}
