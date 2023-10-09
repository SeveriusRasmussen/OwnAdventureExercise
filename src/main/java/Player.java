import java.util.ArrayList;

public class Player {
private Room currentRoom;
private ArrayList<Item> inventory;
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

    public void setCurrentRoom(Room room) {
        this.currentRoom = room;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    private void moveToRoom(Room newRoom) {
        if (newRoom != null) {
            currentRoom = newRoom;
            System.out.println("You are now in " + currentRoom);
        } else {
            System.out.println("You ran into the wall, how stupid are you really?");
        }
    }

    public void move(String direction) {
        Room requestedRoom = null;
    if (direction.equalsIgnoreCase("north")) {
        requestedRoom = currentRoom.getNeighbourNorth();
        if (requestedRoom != null) {
            currentRoom = requestedRoom;
        }
        else if (direction.equalsIgnoreCase("south")) {
            requestedRoom = currentRoom.getNeighbourSouth();
            if (requestedRoom !=null) {
                currentRoom = requestedRoom;
            }
        }
        else if (direction.equalsIgnoreCase("west")) {
            requestedRoom = currentRoom.getNeighbourWest();
            if (requestedRoom !=null) {
                currentRoom = requestedRoom;
            }
        }
        else if (direction.equalsIgnoreCase("east")) {
            requestedRoom = currentRoom.getNeighbourEast();
            if (requestedRoom !=null) {
                currentRoom = requestedRoom;
            }
        }
    }
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
