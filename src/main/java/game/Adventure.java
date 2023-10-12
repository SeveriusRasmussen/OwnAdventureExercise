package game;

import item.Item;
import UI.UserInterface;

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
}