// import Item.Item;

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
   // private ArrayList<Item> roomItems;

    // constructor for Room
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        //roomItems = new ArrayList<>();
    }

    /* // Adds item to Room
    public void addItemToRoom(Item item){
        roomItems.add(item);
    }

    public ArrayList<Item> getRoomItems() {
        return roomItems;
    }

    public void removeItemFromRoom (Item item){
        roomItems.remove(item);
    } */

    // Getters og Setters.
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    /* public void setNeighbours(Room northRoom, Room southRoom, Room westRoom, Room eastRoom {
        neighbourNorth = northRoom;
        neighbourSouth = southRoom;
        neighbourWest = westRoom;
        neighbourEast = eastRoom;
    } */

    public Room getNeighbourNorth() {
        return neighbourNorth;
    }

    public void setNeighbourNorth(Room neighbourNorth) {
        this.neighbourNorth = neighbourNorth;
    }

    public Room getNeighbourSouth() {
        return neighbourSouth;
    }

    public void setNeighbourSouth(Room neighbourSouth) {
        this.neighbourSouth = neighbourSouth;
    }

    public Room getNeighbourEast() {
        return neighbourEast;
    }

    public void setNeighbourEast(Room neighbourEast) {
        this.neighbourEast = neighbourEast;
    }

    public Room getNeighbourWest() {
        return neighbourWest;
    }

    public void setNeighbourWest(Room neighbourWest) {
        this.neighbourWest = neighbourWest;
    }
}
