import java.util.ArrayList;
import AdditionStuffs.Colors;

public class Player {
    private ArrayList<Item> inventory;
    private int maxInventorySlots = 4; // Maximum inventory slots

    public Player() {
        inventory = new ArrayList<>();
    }

    public boolean addItemToInventory(Item item) {
        if (inventory.size() < maxInventorySlots) {
            inventory.add(item);
            return true; // Item added successfully
        } else {
            System.out.println("Your inventory is full. You can't carry more items.");
            return false; // Item not added
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
}