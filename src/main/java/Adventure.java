import item.Item;

import java.util.ArrayList;

public class Adventure {

    private final UserInterface userInterface;

    public Adventure() {

        userInterface = new UserInterface();
    }

    public static void lookAroundRoom(Room room) {
        System.out.println("\033[0;35mRoom Description:\033[0m");
        System.out.println(room.getDescription());

        ArrayList<Item> roomInventory = room.getRoomInventory();
        System.out.println("\033[0;35mItems in the room:\033[0m");
        for (Item item : roomInventory) {
            System.out.println("\033[0;36m" + item.getName() + "\033[0m");
        }
    }

   /* public void viewInventory(Player player) {
        ArrayList<item.Item> inventory = player.getInventory();
        System.out.println("Inventory:");
        int itemCount = 1;
        for (item.Item item : inventory) {
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
                    item.Item itemToDrop = inventory.get(selectedItem - 1);
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