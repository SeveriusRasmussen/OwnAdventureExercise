import java.util.ArrayList;
/* Se FamilyTreeExercise i GitHub
    Room klassen har det samme princip som Person klassen på GitHub.
    'Room' er Person, 'neighbour----' er enten mother eller father.
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

    // constructor for Room
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

    // Other way to write setNeightbours than these /**/s of the setters above.
    public Room getNeighbourNorth() {
        return neighbourNorth;
    }

    /*public void setNeighbourNorth(Room neighbourNorth) {
        this.neighbourNorth = neighbourNorth;
    }*/

    public Room getNeighbourSouth() {
        return neighbourSouth;
    }

    /*public void setNeighbourSouth(Room neighbourSouth) {
        this.neighbourSouth = neighbourSouth;
    }*/

    public Room getNeighbourEast() {
        return neighbourEast;
    }

    /*public void setNeighbourEast(Room neighbourEast) {
        this.neighbourEast = neighbourEast;
    }*/

    public Room getNeighbourWest() {
        return neighbourWest;
    }

    /*public void setNeighbourWest(Room neighbourWest) {
        this.neighbourWest = neighbourWest;
    }*/

    // Det her løst min NullPointerException problemet med Room.getNeighbour
    @Override
    public String toString() {
        return name;
    }

    // Adds item to Room
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
