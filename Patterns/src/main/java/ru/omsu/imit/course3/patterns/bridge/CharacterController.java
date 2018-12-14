package ru.omsu.imit.course3.patterns.bridge;

public class CharacterController {
    private GameCharacter gameCharacter;

    public CharacterController(GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }

    public GameCharacter getGameCharacter() {
        return gameCharacter;
    }

    public void setGameCharacter(GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }

    public void attack(GameCharacter enemy) {
        gameCharacter.attack(enemy);
    }

    public Inventory openInventory() {
        return gameCharacter.getInventory();
    }

    public void setArmor(Armor armor) {
        gameCharacter.setArmor(armor);
    }

    public void setWeapon(Weapon weapon) {
        gameCharacter.setWeapon(weapon);
    }

    public void pickUpItem(Item item) {
        gameCharacter.getInventory().putItem(item);
    }

    public void useItem(Item item) {
        gameCharacter.useItem(item.getName());
    }
}
