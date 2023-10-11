package game;

import java.util.ArrayList;

import item.FoodItem;
import item.Item;

public class Player {
    private ArrayList<Item> inventory;
    private int maxInventorySlots = 5; // Maximum inventory slots, can change to any max slots the player can have.

    public Player() {
        inventory = new ArrayList<>();
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

    public void removeItemFromInventory(Item item) {
        inventory.remove(item);
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public int getMaxInventorySlots() {
        return maxInventorySlots;
    }

    public void consumeFood(FoodItem foodItem) {
    }
}