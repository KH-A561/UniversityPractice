package ru.omsu.imit.course3.patterns.bridge;

public interface GameCharacter {
    void attack(GameCharacter enemy);
    Inventory getInventory();
    void setArmor(Armor armor);
    void setWeapon(Weapon weapon);
    void useItem(String itemName);
    float getHitPoints();
    void setHitPoints(float hitPoints);
}
