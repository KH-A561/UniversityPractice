package ru.omsu.imit.course3.patterns.bridge.decorator;

public class AttackModifier implements Attack{
    Attack wrappee;

    public AttackModifier(Attack wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public float computeDamage() {
        return wrappee.computeDamage();
    }

    @Override
    public String getMessage() {
        return wrappee.getMessage();
    }
}
