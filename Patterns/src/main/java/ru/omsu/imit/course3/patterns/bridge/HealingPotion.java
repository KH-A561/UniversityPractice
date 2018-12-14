package ru.omsu.imit.course3.patterns.bridge;

public class HealingPotion extends ConsumableItem {
    private float hpRegeneration;

    public HealingPotion(int quantity, float hpRegeneration) {
        super("Healing potion", quantity);
        this.hpRegeneration = hpRegeneration;
    }

    @Override
    public void useItem(GameCharacter character) {
        character.setHitPoints(character.getHitPoints() + hpRegeneration);
    }
}
