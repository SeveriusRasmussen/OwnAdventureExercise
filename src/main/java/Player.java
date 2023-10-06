import java.util.ArrayList;

/*
1. lav attributter for: current room, inventory (Array), health point, weapon slots.
2.

*/
public class Player {
    private Room currentRoom;
    private ArrayList<Item> bag;
    private int maxHP = 500;
    private int HP;

    // Inventory and Starting HP for the Peon
    public Player() {
        bag = new ArrayList<Item>();
        maxHP = 500;
        HP = 300;
    }


}
