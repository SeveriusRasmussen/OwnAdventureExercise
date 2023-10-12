package game;

import java.util.ArrayList;
import item.FoodItem;
import item.Item;
import item.Weapon;

public class Player {
    private ArrayList<Item> inventory;
    private int maxInventorySlots = 5; // Maximum inventory slots, can change to any max slots the player can have.
    private int healthPoints;
    private int maxHealthPoints;
    private Weapon equippedWeapon;


    public Player() {
        inventory = new ArrayList<>();
        healthPoints = 100; // initialize the player's health points.
        maxHealthPoints = 200;
        equippedWeapon = null; // No weapon equipped initially
    }

    public boolean equipWeapon(Weapon weapon) {
        if (equippedWeapon == null) {
            equippedWeapon = weapon;
            return true;
        } else {
            System.out.println("You already have a weapon equipped.");
            return false;
        }
    }

    public void useEquippedWeapon() {
        if (equippedWeapon != null) {
            equippedWeapon.use();
            if (equippedWeapon.getUsesLeft() == 0) ;
            {
                equippedWeapon = null;
            }
        } else {
            System.out.println("You have no weapon equipped.");
        }
    }

    public boolean addItemToInventory(Item item) {
        if (inventory.size() < maxInventorySlots) {
            inventory.add(item);
            return true; // Item added successfully
        } else {
            System.out.println("Your inventory is full. You can't carry more items.");
            return false; // item not added
        }
    }

   /* public void attackEnemy(Enemy enemy) {
        int damageDealt = // Calculate the damage dealt by the player.
        enemy.takeDamage(damageDealt);
    }

    public void defendAgainstEnemy(Enemy enemy) {
        int damageReceived = // Calculate the damage recieved by the player.
        healthPoints -= damageReceived;
    }*/

    public void removeItemFromInventory(Item item) {
        inventory.remove(item);
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public int getMaxInventorySlots() {
        return maxInventorySlots;
    }

    public void consumeFood(FoodItem foodItem) {
        int healthRestore = foodItem.getHealthRestore();
        int damage = foodItem.getPoisonDmg();

        healthPoints += healthRestore; // restore health.
        if (damage > 0) {
            healthPoints -= damage; //Apply damage if it's greater than 0
        }
    }
}