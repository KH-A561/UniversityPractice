package ru.omsu.imit.course3.patterns.bridge;

public class Weapon extends Item{
    private float durability;
    private float damageMultiplication;
    private float damage;

    public Weapon(String name, float durability, float damageMultiplication, float damage) {
        super(name, 1);
        this.durability = durability;
        this.damage = damage;
        this.damageMultiplication = damageMultiplication;
    }

    public float getDurability() {
        return durability;
    }

    public void setDurability(float durability) {
        this.durability = durability;
    }

    public float getDamageMultiplication() {
        return damageMultiplication;
    }

    public void setDamageMultiplication(float damageMultiplication) {
        this.damageMultiplication = damageMultiplication;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }
}
