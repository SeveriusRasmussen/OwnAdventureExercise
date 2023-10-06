import java.util.Scanner;

public class Adventure {

    /*    Map gameMap = new Map();
        gameMap.buildMap();

        Scanner scanner = new Scanner(System.in);

        // Intro.
        System.out.println("""
                Welcome to the World of Warcraft!
                You're a orc peon who is out on an adventure, you are here:
                """ + gameMap.getCurrentRoom());

        // Player input
        while (true) {
            String input = scanner.next().toUpperCase();

            // Quit metode
            if (input.equalsIgnoreCase("Q")) {
                System.out.println("You cried and want to get back to work, the adventure is no more.");
                break;
            }

            // Help metode
            if (input.equalsIgnoreCase("H")) {
                System.out.println("""
                W to walk forward north, S for south, A for west, D for east.
                L for look around you
                Q for kill the program""");
                continue;
            }

            // Look metode
            if (input.equalsIgnoreCase("L") || input.equalsIgnoreCase("LOOK")) {
                System.out.println(gameMap.getCurrentDescription());
                continue;
            }

            // Metode for moving the player
            Room currentRoom = gameMap.getCurrent();
            Room newRoom = null;

            switch (input.toLowerCase()) {
                case "W", "w", "north":
                    newRoom = currentRoom.getNeighbourNorth();
                    break;
                case "S", "s", "south":
                    newRoom = currentRoom.getNeighbourSouth();
                    break;
                case "A", "a", "west":
                    newRoom = currentRoom.getNeighbourWest();
                    break;
                case "D", "d", "east":
                    newRoom = currentRoom.getNeighbourEast();
                    break;
                /*default:
                    System.out.println("You... you... ASSHOLE. Input something useful now!");
                    break; */
           }

           // metode for the player moving into a room or against the wall.
        /*   if (newRoom != null) {
                gameMap.setCurrent(newRoom);
                System.out.println("You are now in " + gameMap.getCurrentRoom());
           } else {
               System.out.println("You ran into the wall, how stupid are you really?");
           }
        }

        //scanner.close();

    }*/

