package ru.omsu.imit.course3.patterns.bridge.decorator;

import ru.omsu.imit.course3.patterns.bridge.Armor;
import ru.omsu.imit.course3.patterns.bridge.GameCharacter;
import ru.omsu.imit.course3.patterns.bridge.Warrior;
import ru.omsu.imit.course3.patterns.bridge.Weapon;

public class BasicWarriorAttack extends AttackModifier{
    private Warrior warrior;
    private GameCharacter enemy;
    private String message;

    public BasicWarriorAttack(Attack wrappee, Warrior warrior, GameCharacter enemy) {
        super(wrappee);
        this.warrior = warrior;
        this.enemy = enemy;
    }

    @Override
    public float computeDamage() {
        Weapon weapon = (Weapon) warrior.getInventory().getWeapon();
        Armor armor = (Armor) enemy.getInventory().getArmor();

        float sum = weapon.getDamage();
        float dmgReduction = armor.getDamageReduction();
        dmgReduction *= armor.getDurability();
        sum += wrappee.computeDamage();
        sum += wrappee.computeDamage() * weapon.getDamageMultiplication();
        sum *= warrior.getStaminaPoints() * 0.02;
        sum -= dmgReduction;
        message = "Warrior " + warrior.getName() + " wielding " + warrior.getInventory().getWeapon().getName() +
                  " dealt " + sum + " damage, " + dmgReduction + " damage absorbed by armor";
        return sum;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
