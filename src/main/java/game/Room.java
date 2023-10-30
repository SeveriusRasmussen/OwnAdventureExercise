package game;

import java.util.ArrayList;

import item.Item;
/* Se FamilyTreeExercise i GitHub
    game.Room klassen har det samme princip som Person klassen på GitHub.
    'game.Room' er Person, 'neighbour----' er enten mother eller father.
    'name' er den samme.
    */


public class Room {
    // Attributter til rummets navn, beskrivelse, dets naboværelser
    private String RoomName;
    private String description;
    private Room neighbourNorth;
    private Room neighbourSouth;
    private Room neighbourEast;
    private Room neighbourWest;
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Enemy> enemies = new ArrayList<>();



    // constructor for game.Room
    public Room(String name, String description) {
        this.RoomName = name;
        this.description = description;
    }

    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }

    // Getters og Setters.
    public String getRoomName() {
        return RoomName;
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

    // Adds item to game.Room
    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItemFromRoomInventory(Item item) {
        items.remove(item);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Enemy> getEnemies(){
        return enemies;
    }
}
