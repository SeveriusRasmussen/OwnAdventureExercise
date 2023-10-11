package game;

import AdditionStuffs.Colors;
import item.Item;

public class Map {

    private Room room1, room2, room3, room4, room5, room6, room7, room8, room9,
            room10, room11, room12, room13, room14, room15, room16, room17, room18;
    private Room current;

    public Map() {
       current = room1;
    }
    public void addItemToRoom(Item item, Room room) {
        room.addItemToRoomInventory(item);
    }
    public void buildMap() {

        /*--The first floor of the house.--*/
        room1 = new Room("The Entrance", Colors.BLUE + """
                The room is spooky and creepy to be in.
                The portraits on the wall are unfriendly to look at, that is as if they're staring daggers at you
                making you feel yourself uncomfortable and uneasy.
                There is a round table in the center of the room, a note and a map are on the table with a bat leaning onto it.
                """ + Colors.RESET);
                // item.Item: Note with game.Map and explanation to how to win (game.Map). A bat (Weapon)
        room2 = new Room("The Living Room", """
                The room is dark and old with many spider webs.
                There is a fresh tea cup on the coffee table in the center of the room.
                There are evil looking statues by the south wall.
                They're grinning as if they're making fun of you and are daring you to go near them.
                """);
                // item.Item: Healthy tea. (Food)
                // Enemy: Statue x 2.
        room3 = new Room("The Kitchen", """
                The kitchen reeked of old rotting food and old unfinished dishes.
                A table in the center with moving playing cards on it.
                One of the chair by the table inexplicably begins to balance on its two legs,
                seemingly on its own.
                """);
                // item.Item: A Big Cleaver (Weapon). Rotting apple (Poison food).
        room4 = new Room("The Art Room", """
                The room is full with unfinished artworks but many of them are inspiring to look at.
                There are portraits in here as well unfriendly nad all.
                There is a floating paint pen painting the painting which featuring a Mona Lisa kinda of portrait,
                but Mona's face looks very creepy with melting skin and evil eyes.
                """);
                // Enemy: Statue x 2
        room5 = new Room("The Dinner Room", """
                A lavish feast covers the table, enticing anyone who enters.
                Portraits on the walls seem to watch your each move, their silent gaze unnerving.
                The room is beautifully adorned with candles and fragrant roses,
                creating a captivation yet eerie atmosphere.
                """);
                // The player dies if touched the food.
                // Enemy: the many portraits (Impossible to survive.)
        room6 = new Room("The Music Room", """
                An eerie atmosphere lingers as the grand piano and cello, both untouched by human hands,
                emit hauntingly beautiful yet unsetting melodies, filling the room with a inexplicable
                and unsetting symphony, one that defies explanation and sends a chill down your spine.
                A violin is not playing and lays on the small table beside the piano.
                """);
                // item.Item: A violin for calming the crooked boy then the player could take the severed head from him.
        room7 = new Room("The Library", """
                The room is a absolute marvel, with towering bookshelves that reach all the way to the ceiling,
                filled with a extensive collection of books.
                Most of these tomes are ancient and obscure, encompassing subjects from the
                occult, demonology, witchcraft, kabbalah, and dark magic to astronomy and alchemy.
                The air is heavy with the scent of aged paper and leather bindings, and the soft,
                flickering candlelight casts eerie shadows across the room.
                As you explore further, you notice that some books seems to have a life of their own,
                hovering in mid-air or gliding along the shelves, as if eager to share their forbidden knowledge.
                The atmosphere is both enchanting and unsetting, as if the very walls of the library hold secrets yet to be uncovered.
                It's a place where the boundary between the mundane and the mystical blurs,
                and one can't help but feel the books themselves are watching.
                That is as if they're waiting for someone brave or foolish enough to delve into their dark and enigmatic pages.
                """);
        // item.Item: Demonology book, item 1 of 3 use for escape the house of void.

        room8 = new Room("The Botanical Laboratory", """
                A lush sanctuary with plants from around the world.
                In the center, a research table holds vials and specimens, surrounded by some carnivorous plants.
                The air hums with earthly scents and vitality, where science meets natur's beauty, yet concealed dangers lurk.
                """);
        // item.Item: Vials, one healing potion, one resurrection potion (For the dad ghost) and one poison potion.

        /*--The second floor of the house--*/
        room9 = new Room("The Parent's Bedroom", """
                A lifeless body lies on the bed, its appearance withered and gaunt.
                Meanwhile, its ethereal soul stands by the window, weeping silently.
                The room is shrouded in an eerie stillness, where the boundary between life and death blurs,
                and a sorrowful presence lingers.
                """);
        // item.Item: key for Office if gave the resurrection potion to the dad.

        room10 = new Room("The Possessed Girl's Bedroom", """
                A chilling aura permeates the space, as if it's sinister scene from a nightmare.
                The young girl sits in the center of the room.
                She is surrounded by shattered dolls and teddy bears, which she malevolently tears apart.
                Her eyes are vacant, and a inexplicable coldness fills the air.
                It's a haunting tableau where innocence has transformed into something much darker and disconcerting.
                """);
        // Enemy: The possessed girl.

        room11 = new Room("The Crooked Boy's Bedroom", """
                The atmosphere is unsetting as the boy is playing with a eerie object on his bed.
                In his hands, he cradles a severed head of his decreased mother, its lifeless eyes staring into the void.
                He cries cause he wants to hear the music of his decreased mother playing a violin.
                Shadows dance ominously, and the room is filled with a disconcerting chill.
                It's a scene where innocence takes a dark and macabre turn.
                """);
        // Enemy: The crooked boy.
        // item.Item: The severed head is used as a key to open the painting of the mother without head in the guest room.

        room12 = new Room("The Office", """
                An oppressive silence fills the room as ancient, decaying books line the shelves.
                The flicering candlelight casts eerie shadows on the walls, revealing grotesque portraits of long-forgotten ancestors.
                A Heavy leather chair sits ominously behind a grand, dust-covered desk.
                It's as if the past holds a malevolent presence here, watching and waiting in the stillness.
                """);
        // item.Item: The grinning Demon statue, Ritual paper. 2/3 and 3/3 of the items for complete the game while standing in the void room.

        room13 = new Room("The Stairwell", """
                Dimly lit, the narrow staircase ascends steadily, its steps worn from years of use.
                Shadows dance on the walls, and each creaking step echoes like a haunting melody.
                Faint whispers and ghostly sighs fill the air, as if the very walls hold secrets best left undisturbed.
                It's a place where the ascent feels like a descent into the unknown.
                A chainsaw is hanging on the wall.
                """);
        // item.Item: Chainsaw (Use for killing the possessed children.)

        room14 = new Room("The Observatory", """
                The night sky stretches out before you, but an unnatural darkness shrouds the stars.
                An ancient telescope points to an unseen celestial body, and the room resonates with an otherworldly hum.
                Phantasmal apparitions glide silently through the darkness, their presence chilling to the bone.
                It's a place where the mysteries of the cosmos intertwine with the supernatural, and the boundaries of perception blur.
                """);

        room15 = new Room("The Guest Bedroom", """
                A sinister chill hangs in the air, and the walls seem to close in.
                Unseen footsteps echo through the room, yet no one is there.
                The bed is uninviting, with tattered sheets and a sense of dread.
                A twisted figure materializes in the darkness, its hollow eyes locked onto you.
                It's a place where the line between the living and dead blurs, and malevolence lingers.
                There is a big painting of the mother with her two children.
                But her head is missing, like something is supposed to be in its place.
                """);
        // Use the severed head from the crooked boy to open the secret chamber through the painting.

        room16 = new Room("The Ritual Chamber", """
                An eerie altar bathed in crimson light, adorned with grotesque tapestries that seem to writhe with unseen horrors.
                Mutilated remains and a malevolent Quija board lies upon it, their presence exuding a palpable malevolence.
                Dark figures in blood-soaked robes, their face hidden by shadow, chant incantations as they perform unspeakable rites,
                pushing the boundaries of cruelty and the supernatural to the brink.
                """);
        // The door for the void opens if the player has the three items in his/her inventory, The Demonology Book, The Ritual Paper, The Ouija Board.

        room17 = new Room("The Bathroom", """
                The vintage fixtures exude a sense of eerie nostalgia, while the blood-red stains in the old, claw-foot bathtub tell a cruesome tale.
                The cracked mirror reflects distorted figures and the walls seems to pulse with a unsetting energy.
                It's a room where echoes of past horrors refused to fade, and the boundaries of reality waver.
                """);
        // soap (poison food)

        room18 = new Room("The void room", """
                The room seems unbelievably unreal to your eyes.
                Many illusions of your alter versions in the multivers worlds.
                You found your world and now you can escape when you want to.
                """);
        // if the player took the statue and went in here the player dies since the demon inside woke up and ate the player. Otherwise, the player won the game.

        current = room1;

        // Connection the Rooms to their neighbour rooms.
        room1.setNeighbours(null, room4,null,room2);
        room2.setNeighbours(null,null,room1,room3);
        room3.setNeighbours(null, room5,room2,null);
        room4.setNeighbours(room1, room6,null,null);
        room5.setNeighbours(room3, room8,null,null);
        room6.setNeighbours(room4, null,null,room7);
        room7.setNeighbours(room13, null,room6,null);
        room8.setNeighbours(room5, null,null,null);
        room9.setNeighbours(null, null,null,room10);
        room10.setNeighbours(null, room13,room9,room11);
        room11.setNeighbours(null, null,room10,null);
        room12.setNeighbours(null, room15,null,room13);
        room13.setNeighbours(room10, room7,room12,room14);
        room14.setNeighbours(null, room17,room13,null);
        room15.setNeighbours(room12, null,null,room16);
        room16.setNeighbours(null, room18,room15,null);
        room17.setNeighbours(room14, null,null,null);
        room18.setNeighbours(room16, null, null, null);



        // Add the items above to rooms
        // Create items
        Item theNote = new Item("Note", "A note wrote with bad handwriting: You have to escape the house by using three.... the rest is burned and hard to read.");
        Item theBat = new Item("Bat", "A bat used for playing baseball, made of tough metal");
        Item theCup = new Item("Cup", "Tea made from the finest herbs. The aroma is just like in a Buddhist temple, peaceful and delightful aroma.");
        Item theCleaver = new Item("Cleaver", "The biggest mad butcher cleaver, a colossal testament to the art of butchery.");
        Item theFeast = new Item("Feast", "No need to describe since the player dies"); //Game Over if taken
        Item theViolin = new Item("Violin", "A spooky violin which was used for many years.");
        Item theBook = new Item("Book", "A ancient book about demonology which was used for calling in the demons and wicked beasts from the dark world.");
        Item theHealVial = new Item("Health Vial", "A healthy potion");
        Item thePoisonVial = new Item("Poison Vial", "A poisonious potion");
        Item theLifeVial = new Item("Life Vial", "A life potion with a note on it: 'can bring someone back from the death");
        Item theKey = new Item("Key", "A rusty key with a scary head");
        Item chainSaw = new Item("Chainsaw", "A old working chainsaw");
        Item severedHead = new Item("Head", "A severed head of the decreased mother");
        Item ouijaBoard = new Item("Board", "A old Ouija board used for communicating with the decreased");
        Item theSoap = new Item("Soap", "A fresh fragrant soap");
        Item theDevilStatue = new Item("Statue", "A grinning devil statue pointing upward with its one hand and the other hand is grabbing its throat.");
        Item ritualPaper = new Item("A Ritual Paper", "The paper describes a metode to do a ritual to open the portal for the void.");
        // The game.Map item (big code for a item: DO NOT change!)
        Item theMap = new Item("Map", """
                The map shows some plans over the house.
                
                The first floor:                    Plan for the second floor:
                \033[1;32m\u250F\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2533\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2533\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2513        \u250F\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2533\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2533\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2513
                \u2503        \u2503        \u2503        \u2503        \u2503        \u2503        \u2503        \u2503                    
                \u2503        \033[0;35m\u2551        \u2551        \033[1;32m\u2503        \u2503        \033[0;35m\u2551        \u2551        \033[1;32m\u2503
                \u2523\u2501\u2501\u2501\033[0;35m\u2550\u2550\033[1;32m\u2501\u2501\u2501\u254B\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u254B\u2501\u2501\u2501\033[0;35m\u2550\u2550\033[1;32m\u2501\u2501\u2501\u252B        \u2523\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u254B\u2501\u2501\u2501\033[0;35m\u2550\u2550\033[1;32m\u2501\u2501\u2501\u254B\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u252B
                \u2503        \u2503        \u2503        \u2503        \u2503        \u2503        \u2503        \u2503
                \u2503        \u2503        \u2503        \u2503        \u2503        \033[0;35m\u2551        \u2551        \033[1;32m\u2503
                \u2523\u2501\u2501\u2501\033[0;35m\u2550\u2550\033[1;32m\u2501\u2501\u2501\u254B\u2501\u2501\u2501\033[0;35m\u2550\u2550\033[1;32m\u2501\u2501\u2501\u254B\u2501\u2501\u2501\033[0;35m\u2550\u2550\033[1;32m\u2501\u2501\u2501\u252B        \u2523\u2501\u2501\u2501\033[0;35m\u2550\u2550\033[1;32m\u2501\u2501\u2501\u254B\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u254B\u2501\u2501\u2501\033[0;35m\u2550\u2550\033[1;32m\u2501\u2501\u2501\u252B
                \u2503        \u2503        \u2503        \u2503        \u2503        \u2503        \u2503        \u2503
                \u2503        \033[0;35m\u2551        \033[1;32m\u2503        \u2503        \u2503        \u2503        \u2503        \u2503
                \u2517\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u253B\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u253B\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u251B        \u2517\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u251B        \u2517\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u251B\033[0m
                """);

        //Adding items to their room.
        addItemToRoom(theNote, room1);
        addItemToRoom(theMap, room1);
        addItemToRoom(theBat, room1);
        addItemToRoom(theCup, room2);
        addItemToRoom(theCleaver, room3);
        addItemToRoom(theFeast, room5);
        addItemToRoom(theViolin, room6);
        addItemToRoom(theBook, room7);
        addItemToRoom(theHealVial, room8);
        addItemToRoom(thePoisonVial, room8);
        addItemToRoom(theLifeVial, room8);
        addItemToRoom(theKey, room9);
        addItemToRoom(severedHead, room11);
        addItemToRoom(theDevilStatue, room12);
        addItemToRoom(ritualPaper, room12);
        addItemToRoom(chainSaw, room13);
        addItemToRoom(ouijaBoard, room16);
        addItemToRoom(theSoap, room17);

    }

    /*    //game.Room connections:
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
        room5.setNeighbourSouth(room8);*/


    /*
    Bare en anden f.eks måde at forbinde de rooms...
    Lav i game.Room-klassen:
    public void setNeighbours(game.Room roomNorth, game.Room roomSouth, game.Room roomWest, game.Room roomEast){
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

    /*public String getCurrentName() {
        return current.getName();
    }

    public String getCurrentDescription() {
        return current.getDescription();
    }*/

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

