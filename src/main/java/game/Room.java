package game;

import java.util.ArrayList;

import item.Item;
/* Se FamilyTreeExercise i GitHub
    game.Room klassen har det samme princip som Person klassen på GitHub.
    'game.Room' er Person, 'neighbour----' er enten mother eller father.
    'name' er den samme.
    */


public class Room {

    // Attributter til rummets navn, beskrivelse, dets naboværelser (med dør)
    private String name;
    private String description;
    private Room neighbourNorth;
    private Room neighbourSouth;
    private Room neighbourEast;
    private Room neighbourWest;
    private ArrayList<Item> roomInventory;

    // constructor for game.Room
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        roomInventory = new ArrayList<>();
    }

    // Getters og Setters.
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setNeighbours(Room northRoom, Room southRoom, Room westRoom, Room eastRoom) {
        neighbourNorth = northRoom;
        neighbourSouth = southRoom;
        neighbourWest = westRoom;
        neighbourEast = eastRoom;
    }

    // Above shows other way to write setNeightbours than the /*...*/ of the setters below.
    /*public void setNeighbourSouth(game.Room neighbourSouth) {
            this.neighbourSouth = neighbourSouth;
        }
    public void setNeighbourNorth(game.Room neighbourNorth) {
        this.neighbourNorth = neighbourNorth;
    }
    public void setNeighbourEast(game.Room neighbourEast) {
        this.neighbourEast = neighbourEast;
    }
    public void setNeighbourWest(game.Room neighbourWest) {
        this.neighbourWest = neighbourWest;
    }*/

    public Room getNeighbourNorth() {
        return neighbourNorth;
    }
    public Room getNeighbourSouth() {
        return neighbourSouth;
    }
    public Room getNeighbourEast() {
        return neighbourEast;
    }
    public Room getNeighbourWest() {
        return neighbourWest;
    }

    // Det her løst min NullPointerException problemet med game.Room.getNeighbour
   /* @Override
    public String toString() {
        return name;
    }*/

    // Adds item to game.Room
    public void addItemToRoomInventory(Item item) {
        roomInventory.add(item);
    }

    public void removeItemFromRoomInventory(Item item) {
        roomInventory.remove(item);
    }

    public ArrayList<Item> getRoomInventory() {
        return roomInventory;
    }
}
