public class Adventure {
    private final Map gameMap;

    public Adventure() {
        gameMap = new Map();
        gameMap.buildMap();
    }

    public String getCurrentRoomName() {
        return gameMap.getCurrentName();
    }

    public String getCurrentRoomDescription() {
        return gameMap.getCurrentDescription();
    }

    public void processInput(String input) {
        // Handle user input and game logic here
        switch (input.toLowerCase()) {
            case "N", "n", "north":
                Room newRoomNorth = gameMap.getCurrent().getNeighbourNorth();
                movePlayer(newRoomNorth);
                break;
            case "S", "s", "south":
                Room newRoomSouth = gameMap.getCurrent().getNeighbourSouth();
                movePlayer(newRoomSouth);
                break;
            case "E", "e", "east":
                Room newRoomEast = gameMap.getCurrent().getNeighbourEast();
                movePlayer(newRoomEast);
                break;
            case "W", "w", "west":
                Room newRoomWest = gameMap.getCurrent().getNeighbourWest();
                movePlayer(newRoomWest);
                break;
            // Quit metode
            case "Q", "q", "quit":
                quitGame();
                break;
            // help metode
            case "H", "h", "help":
                displayHelp();
                break;
            // Look metode
            case "L", "l", "look":
                lookAround();
                break;
            default:
                // Handle invalid input
                System.out.println("Invalid input. Please enter a valid command.");
                break;
        }

    }

    private void movePlayer(Room newRoom) {
        if (newRoom != null) {
            gameMap.setCurrent(newRoom);
            System.out.println("You are now in " + gameMap.getCurrentRoom());
        } else {
            System.out.println("You ran into the wall, how stupid are you really?");
        }
    }

    private void quitGame() {
        System.out.println("\033[0;31mYou voided your life into the infinite dimension.\033[0m");
        System.exit(0); // Exit the game
    }

    private void displayHelp() {
        System.out.println("""
                Write one of these commands to take action:
                N or North to move north, S or South to move south,
                W or West to move west, E or East to move east.
                L or Look to observe the room you're in.
                Q or Quit to exit the game.""");
    }

    private void lookAround() {
        System.out.println(gameMap.getCurrentDescription());
    }
}
/*

import java.util.Scanner;

public class Adventure {
    public void start() {
        Map gameMap = new Map();
        gameMap.buildMap();

        Scanner scanner = new Scanner(System.in);

        // Intro.
        System.out.println("""
                \033[0;33mWelcome to the house of the void
                You are here to find the dimension cube to get away from the void.
                You are standing in front of the front door of the house.
                Then you enter the house and are now standing in:\033[0m
                """ + gameMap.getCurrent());

        // Player input
        while (true) {
            String input = scanner.next().toUpperCase();

            // Metode for moving the player
            Room currentRoom = gameMap.getCurrent();
            Room newRoom = null;

            switch (input.toLowerCase()) {
                case "N", "n", "north":
                    newRoom = currentRoom.getNeighbourNorth();
                    break;
                case "S", "s", "south":
                    newRoom = currentRoom.getNeighbourSouth();
                    break;
                case "W", "w", "west":
                    newRoom = currentRoom.getNeighbourWest();
                    break;
                case "E", "e", "east":
                    newRoom = currentRoom.getNeighbourEast();
                    break;
                // Quit metode
                case "Q", "q", "quit":
                    System.out.println("\033[0;31mYou voided your life into the infinite dimension.\033[0m");
                    System.exit(0); // afslut programmet.
                    break;
                // Help metode
                case "H", "h", "help":
                    System.out.println("""
                    Write one of these typo to get the action:
                    N or n or north to walk forward north, S or s or south to go for south,
                    W or w or west to go west, E or e or east to go east.
                    L for look around in the room you're in.
                    Q for quit the game, only god knows what will happens.""");
                    continue;
                // Look metode
                case "L", "l", "look":
                    System.out.println(gameMap.getCurrentDescription());
                    continue;
                default:
                    System.out.println("You... you... ASSHOLE. Input something useful now!");
                    continue;
           }

           // metode for the player moving into a room or against the wall.
           if (newRoom != null) {
                gameMap.setCurrent(newRoom);
                System.out.println("You are now in " + gameMap.getCurrentRoom());
           } else {
               System.out.println("You ran into the wall, how stupid are you really?");
           }
        }
    }
} */
