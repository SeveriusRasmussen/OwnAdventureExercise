public class Map {
    /*
    formål med map:
    Lave forbindelse mellem rummene.

    */
    /* Kortet over Map.
     ___________
    |_1_|_2_|_3_|
    |_4_|_5_|_6_|
    |_7_|_8_|_9_|
     */

    private Room current;

    public void buildMap() {
        //Starter room and current room for the player.
        Room room1 = new Room("Forest Town","A little innocent town in the forest.");
        current = room1;

        //The other rooms
        Room room2 = new Room("a bridge","A river is running under the bridge, the sun shines giving the river a sparking ");
        Room room3 = new Room("a treehouse","");
        Room room4 = new Room("a tower","");
        Room room5 = new Room("a secret hall","");
        Room room6 = new Room("a bar","");
        Room room7 = new Room("a castle","");
        Room room8 = new Room("a stone path","");
        Room room9 = new Room("a shrine","");

        //Room connections:
        //West neighbours
        room2.setNeighbourWest(room1);
        room3.setNeighbourWest(room2);
        room8.setNeighbourWest(room7);
        room9.setNeighbourWest(room8);

        //East neighbours
        room1.setNeighbourEast(room2);
        room2.setNeighbourEast(room3);
        room7.setNeighbourEast(room8);
        room8.setNeighbourEast(room9);

        //North neighbours
        room4.setNeighbourNorth(room1);
        room7.setNeighbourNorth(room4);
        room6.setNeighbourNorth(room3);
        room9.setNeighbourNorth(room6);
        room8.setNeighbourNorth(room5);

        //South neighbours
        room1.setNeighbourSouth(room4);
        room4.setNeighbourSouth(room7);
        room3.setNeighbourSouth(room6);
        room6.setNeighbourSouth(room9);
        room5.setNeighbourSouth(room8);


        /*
        Bare en anden f.eks måde at forbinde de rooms...
        Lav i Room-klassen:
        public void setNeighbours(Room roomNorth, Room roomSouth, Room roomWest, Room roomEast){
            neighbourNorth = northRoom;
            neighbourSouth = southRoom;
            neighbourWest = westRoom;
            neighbourEast = eastRoom;

        Så herinde i klassen:
        room1.setNeighbours(null, room4, null, room2);
        room2.setNeighbours(null, null, room1, room3);
        room3.setNeighbours(null, room6, room2, null);
        indtil den 9. rum.
         */
    }

    public String getCurrentDescription() {
        return current.getDescription();
    }

    public String getCurrentRoom() {
        return current.getName();
    }

    public void setCurrent(Room room) {
        current = room;
    }

    public Room getCurrent() {
        return current;
    }

}
