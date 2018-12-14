package ru.omsu.imit.course3.patterns.bridge.decorator;

import ru.omsu.imit.course3.patterns.bridge.Armor;
import ru.omsu.imit.course3.patterns.bridge.GameCharacter;
import ru.omsu.imit.course3.patterns.bridge.Mage;
import ru.omsu.imit.course3.patterns.bridge.Weapon;

public class BasicMageAttack extends AttackModifier {
    private Mage mage;
    private GameCharacter enemy;
    private String message;

    public BasicMageAttack(Attack wrappee, Mage mage, GameCharacter enemy) {
        super(wrappee);
        this.mage = mage;
        this.enemy = enemy;
    }

    @Override
    public float computeDamage() {
        Weapon weapon = (Weapon) mage.getInventory().getWeapon();

        float sum = weapon.getDamage();
        float dmgReduction = ((Armor) enemy.getInventory().getArmor()).getDamageReduction();
        dmgReduction *= ((Armor) enemy.getInventory().getArmor()).getDurability();
        sum += wrappee.computeDamage();
        sum += wrappee.computeDamage() * weapon.getDamageMultiplication();
        sum -= dmgReduction;
        message = "Mage " + mage.getName() + " wielding " + mage.getInventory().getWeapon().getName() +
                " dealt " + sum + " damage, " + dmgReduction + " damage absorbed by armor";
        return sum;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
