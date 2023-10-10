import java.util.ArrayList;
import AdditionStuffs.Colors;

public class Player {

private final ArrayList<Item> inventory;

    public Player() {
        inventory = new ArrayList<>();
    }

    public void addItemToInventory(Item item) {
        inventory.add(item);
    }

    public void removeItemFromInventory(Item item) {
        inventory.remove(item);
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }
}
