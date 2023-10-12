package UI;

import AdditionStuffs.Colors;
import game.Map;
import game.Player;
import game.Room;
import item.Item;
import item.FoodItem;
import item.Weapon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {
    private final Map gameMap;
    private final Player player;
    private Room currentRoom;
    private final Scanner scanner;

    public UserInterface() {
        gameMap = new Map();
        gameMap.buildMap();
        player = new Player();
        currentRoom = gameMap.getCurrent();
        scanner = new Scanner(System.in);
    }

    public String getCurrentRoomName() {
        return currentRoom.getRoomName(); // Use the current room's name
    }

    /*public String getCurrentRoomDescription() {
        return currentRoom.getDescription(); // Use the current room's description
    }*/

    public void startGame() {
        System.out.println("""
                \033[0;33mWelcome to House of the Void
                You are here to find the dimension cube to get away from the void.
                You are standing in front of the frontdoor of the house.
                A voice from the void is telling you \033[0;34m''...ype... help.... to... figu... thin... ut...''\033[0;33m
                You can't quite figure out what he want but the word ''help'' sounds helpful.
                Then you enter the house and are now standing in:\033[0m
                """ + getCurrentRoomName());

        while (true) {
            String input = scanner.nextLine().toUpperCase();
            processInput(input);
        }
    }

    public void processInput(String input) {
        input = input.toLowerCase();
        // Split the input into individual words
        String[] words = input.split("\\s+");
        // Check the first word to determine the action
        String action = words[0];

        // Handle user input and game logic here
        switch (action) {

            // Direction metode
            case "n", "north":
                Room newRoomNorth = currentRoom.getNeighbourNorth();
                movePlayer(newRoomNorth);
                break;

            case "s", "south":
                Room newRoomSouth = currentRoom.getNeighbourSouth();
                movePlayer(newRoomSouth);
                break;

            case "e", "east":
                Room newRoomEast = currentRoom.getNeighbourEast();
                movePlayer(newRoomEast);
                break;

            case "w", "west":
                Room newRoomWest = currentRoom.getNeighbourWest();
                movePlayer(newRoomWest);
                break;

            // Take item metode
            case "t", "take":
                if (words.length > 1) {
                    String itemName = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                    takeItem(itemName);

                    if (itemName.equalsIgnoreCase("feast")) {
                        System.out.println("""
                        You took the feast, but it was cursed!
                        All of the portraits in the dinner room attacked you and killed you
                        """);
                        gameOver();
                    }

                } else {
                    System.out.println("Please specify the item you want to take.");
                }
                break;

            // Drop item metode
            case "d", "drop":
                if (words.length > 1) {
                    String itemName = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                    dropItem(itemName);
                } else {
                    System.out.println("Please specify the item you want to drop.");
                }
                break;

            // Look into the player's inventory metode
            case "inv", "bag", "inventory":
                viewInventory();
                break;

            // Investigate item metode
            case "examine":
                if (words.length > 1) {
                    String itemName = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                    examineItem(itemName);
                } else {
                    System.out.println("Please specify the item you want to examine.");
                }
                break;
            // Eat item metode
            case "eat", "drink", "consume":
                if (words.length > 1) {
                    String itemName = String.join(" ", Arrays.copyOfRange(words, 1, words.length));
                    eatItem(itemName);

                    // Check if the player's HP has reached 0
                    if (player.getHealthPoints() <=0) {
                        gameOver();
                    }
                } else {
                    System.out.println("Please specify the food you want to eat.");
                }
                break;

            // See health metode
            case "hp", "life", "lifepoint", "healthpoint":
                displayHealthPoints();
                break;

            // Quit metode
            case "q", "quit":
                quitGame();
                break;

            // help metode
            case "h", "help":
                displayHelp();
                break;

            // Look metode
            case "l", "look":
                lookAroundRoom(currentRoom); //Call the lookAroundRoom method
                break;

                //TODO
            // Equip the weapon
            case "equip", "arm up":


            // Handle invalid input
            default:
                System.out.println("Invalid input. Please enter a valid command.");
                break;
        }
    }



    private void movePlayer(Room newRoom) {
        if (newRoom != null) {
            currentRoom = newRoom;
            System.out.println("You are now in " + currentRoom.getRoomName());
        } else {
            System.out.println("You ran into the wall, how stupid are you really?");
        }
    }

    private void quitGame() {
        System.out.println("\033[0;31mYou voided your life into the infinite dimension.\033[0m");
        System.exit(0); // Exit the game
    }

    private void gameOver() {
        System.out.println("\033[0;31mYour soul drained into the void.\033[0m");
    }

    private void displayHelp() {
        System.out.println("""
                The void is echoing in your head telling you to type these to use in the house:
                For the movements:
                N or north: move north, S or south: move south, W or west: move west, E or east: move east.
                For the other commands:
                T or take: type take and enter then type the item to take.
                D or drop: type drop and enter then type the item to drop.
                Inv or bag: look into the inventory of your bag.
                Examine: take a look into your inventory and then choose the item to examine.
                Eat or Drink: eat/drink the food of your choice from your inventory.
                L or Look: to observe the room you're in.
                Q or Quit to exit the game.""");
    }

    public void takeItem(String itemName) {
        // Check if the player's inventory is already full before taking the item.
        if (player.getInventory().size() >= player.getMaxInventorySlots()) {
            System.out.println("Your inventory is already full. You can't have the item in your bag.");
            return;
        }

        // Check if the current room has the specified item
        ArrayList<Item> roomInventory = currentRoom.getItems();
        for (Item item : roomInventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                // Add the item to the player's inventory and remove it from the room
                player.addItemToInventory(item);
                currentRoom.removeItemFromRoomInventory(item);
                System.out.println(Colors.CYAN + "You took the " + item.getName() + "." + Colors.RESET);
                return;
            }
        }
        System.out.println("Can't find the item in the room. Type the item without 'the'");
    }

    public void dropItem(String itemName) {
        // Check if the player has the specified item
        ArrayList<Item> inventory = player.getInventory();
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                // Remove the item from the player's inventory and add it to the room
                player.removeItemFromInventory(item);
                currentRoom.addItem(item);
                System.out.println("You dropped the " + item.getName() + " in the room.");
                return;
            }
        }
        System.out.println("You can't find the item in your inventory.");
    }

    public void eatItem(String itemName) {
        // Check if the player's inventory contains the specified food item
        ArrayList<Item> inventory = player.getInventory();
        for (Item item : inventory) {
            if (item instanceof FoodItem && item.getName().equalsIgnoreCase(itemName)) {
                FoodItem foodItem = (FoodItem) item; // Cast the item to FoodItem
                player.consumeFood(foodItem);

                if (foodItem.getPoisonDmg() > 0) {
                    System.out.println("You consumed poison food and took " + foodItem.getPoisonDmg() + " damage!");
                }

                // Display the player's health points after the poison food.
                displayHealthPoints();
                return;
            }
        }
        System.out.println("Food item not found in your inventory.");
    }

    private void displayHealthPoints() {
        System.out.println("Player Health Points: " + player.getHealthPoints());
    }

    public void viewInventory() {
        System.out.println("You have the following items in your inventory:");
        ArrayList<Item> inventory = player.getInventory();

        if (inventory.isEmpty()) {
            System.out.println("Your inventory is empty.");
        } else {
            for (Item item : inventory) {
                System.out.println("- " + item.getName());
            }
        }
    }
//TODO
    public void equipPlayerWithWeapon(Weapon weapon) {
        boolean equipped = player.equipWeapon(weapon);
        if (equipped) {
            System.out.println("You have equipped the weapon.");
        }

    }

    public void usePlayerEquippedWeapon() {
        player.useEquippedWeapon();
    }

    public void examineItem(String itemName) {
        // Check if the player has the specified item
        ArrayList<Item> inventory = player.getInventory();
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                System.out.println("You examine the " + item.getName() + ":");
                System.out.println(item.getDescription());
                return;
            }
        }
        System.out.println("item.Item not found in your inventory.");
    }

    public static void lookAroundRoom(Room room) {
        System.out.println("\033[0;35mRoom Description:\033[0m");
        System.out.println(room.getDescription());

        ArrayList<Item> roomInventory = room.getItems();
        System.out.println("\033[0;35mItems in the room:\033[0m");
        for (Item item : roomInventory) {
            System.out.println("\033[0;36m" + item.getName() + "\033[0m");
        }
    }
}

