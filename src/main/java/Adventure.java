import java.util.ArrayList;
import java.util.Scanner;

public class Adventure {

    private final UserInterface userInterface;

    public Adventure() {

        userInterface = new UserInterface();
    }

    public static void lookAroundRoom(Room room) {
        System.out.println("Room Description:");
        System.out.println(room.getDescription());

        ArrayList<Item> roomInventory = room.getRoomInventory();
        System.out.println("Items in the room:");
        for (Item item : roomInventory) {
            System.out.println("- " + item.getName());
        }
    }

    // Take and drop items.
    /*public void takeItem(Room room, Player player, String itemName) {
        ArrayList<Item> roomInventory = room.getRoomInventory();
        for (Item item : roomInventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                player.addItemToInventory(item);
                room.removeItemFromRoomInventory(item);
                System.out.println("You took the " + item.getName() + ".");
                return;
            }
        }
        System.out.println("Item not found in the room.");
    }*/

    /*public void dropItem(Room room, Player player, String itemName) {
        ArrayList<Item> inventory = player.getInventory();
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                player.removeItemFromInventory(item);
                room.addItemToRoomInventory(item);
                System.out.println("You dropped the " + item.getName() + " in the room.");
                return;
            }
        }
        System.out.println("Item not found in your inventory.");
    }*/

    // Allow the player to look into his inventory.
    //TODO make the player able to look into inventory.
   /* public void viewInventory(Player player) {
        ArrayList<Item> inventory = player.getInventory();
        System.out.println("Inventory:");
        int itemCount = 1;
        for (Item item : inventory) {
            System.out.println(itemCount + ". " + item.getName() + " - " + item.getDescription());
            itemCount++;
        }

        // Allow the player to choose an item to drop
        System.out.println("Enter the number of the item you want to drop, or type 'cancel' to cancel:");
        String input = scanner.next();
        if (!input.equalsIgnoreCase("cancel")) {
            try {
                int selectedItem = Integer.parseInt(input);
                if (selectedItem >= 1 && selectedItem <= inventory.size()) {
                    Item itemToDrop = inventory.get(selectedItem - 1);
                    player.removeItemFromInventory(itemToDrop);
                    Room currentRoom = null;
                    currentRoom.addItemToRoomInventory(itemToDrop);
                    System.out.println("You dropped " + itemToDrop.getName() + " in the room.");
                } else {
                    System.out.println("Invalid item number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'cancel'.");
            }
        }
    }*/
}