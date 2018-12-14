package ru.omsu.imit.course3.patterns.bridge;

public class Armor extends Item{
    private float durability;
    private float damageReduction;
    private float hpBonus;

    public Armor(String name, float durability, float damageReduction, float hpBonus) {
        super(name, 1);
        this.durability = durability;
        this.damageReduction = damageReduction;
        this.hpBonus = hpBonus;
    }

    public float getDurability() {
        return durability;
    }

    public void setDurability(float durability) {
        this.durability = durability;
    }

    public float getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(float damageReduction) {
        this.damageReduction = damageReduction;
    }

    public float getHpBonus() {
        return hpBonus;
    }

    public void setHpBonus(float hpBonus) {
        this.hpBonus = hpBonus;
    }
}
