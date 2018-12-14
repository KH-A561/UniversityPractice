package ru.omsu.imit.course3.patterns.bridge.decorator;

public class BasicAttack implements Attack{
    private float damage;

    public BasicAttack(float damage) {
        this.damage = damage;
    }

    @Override
    public float computeDamage() {
        return damage;
    }

    @Override
    public String getMessage() {
        return damage + "damage dealt";
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }
}
