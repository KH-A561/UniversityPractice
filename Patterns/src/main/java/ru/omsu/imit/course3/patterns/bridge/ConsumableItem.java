package ru.omsu.imit.course3.patterns.bridge;

public abstract class ConsumableItem extends Item {
    public ConsumableItem(String name, int quantity) {
        super(name, quantity);
    }
    public abstract void useItem(GameCharacter character);
}
