import java.util.ArrayList;

public class Player {
/*TODO
private Player player; - flyt take og drop metoder hertil fra UI.
*/
private final ArrayList<Item> inventory;
/*private void move(Room newRoom) {
        if (newRoom != null) {
            gameMap.setCurrent(newRoom);
            System.out.println("You are now in " + gameMap.getCurrentRoom());
        } else {
            System.out.println("You ran into the wall, how stupid are you really?");
        }
    }
*/
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
