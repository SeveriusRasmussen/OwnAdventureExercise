package DescriptionsForKristoffer;

public class Descriptions {
  /*
    game.Room room22 = new game.Room("Pile of machines and computers", """
                                    The lights are weak and flickering, but you can see everything.
                                    There are unused computers and cables everywhere in the room.
                                    One of the computers is turned on showing a login screen, and some cables are shaking among the computers.
                                    A wild Edward Wong emerges from the pile of machines,
                                    'AWESOME! So many Computer machines!!', 'I am going to hack the SpaceShip for fun!!'
                                    Connected to rooms via doors to the North and West.
                                    """);
                                    //Use Password1 from room 32 to get access into one of the computer to get Password2 for Captain Space Nemo PC.
                                    //When you open the computer with a password, Edward goes wild and attacks you because she wants to use that. Weak enemy.

    game.Room room23 = new game.Room("The Training Center", """
                                    Dumbbells and weights are everywhere in the big hall and some people are training.
                                    The Space Jam team is training at a basket training ground at the corner of the hall,
                                    Lola Bunny is standing nearby, taking a break and drinking from a water bottle,
                                    causing her white training shirt to become wet. You can see everything
                                    YoRHa No. 2 Type B aka. B2 is training on her legs using the leg curl machine. Woah, those thighs is tight!
                                    Neo and Morpheus are training in martial arts at one of the other corners.
                                    """);

    game.Room room24 = new game.Room("Space Refreshment Stand", """
                                    A stand that sells drinks and energy bars for exhausted trainers, Jim Hawkins is handing out drinks on the stand.
                                    Trinity is standing by the stand, she is considering what to take for herself and the boys training martial arts.
                                    Boy from the AI movie is sitting on a bench with Wall-E making gestures, they're trying to understand each other.
                                    """);
                                    //Drinks and energy bars can be acquired here to recover health.

    game.Room room25 = new game.Room("The Space Bar", """
                                    The room reeks of smoke from cigarettes and alcohols like vodka, gin and rum.
                                    The barterner, John Silver, is cleaning the glasses for the bar.
                                    He is making a show with the glass he was cleaning and look at you as if you want to order something.
                                    Spike Spiegel is sitting by the bar and smokes cigarette while talking to Faye Valentine
                                    about love, but Faye is ignoring him and drinking like there is no tomorrow.
                                    """);
                                    //If the player takes the alcohol the player would be unable to move for some time.

    game.Room room26 = new game.Room("Noisy Hallway", """
                                    The hallway is just an ordinary room but there are some people speaking in high tone nearby.
                                    Asuka are discussing and arguing with Rei about something, Shinji is
                                    trying to calm her down.
                                    They're in their plugsuits getting ready for piloting the living humanoid robots which are the Evangelions.
                                    """);
                                    //If tried to flirt or speak to asuka, you get knockout - GAMEOVER.

    game.Room room27 = new game.Room("Dexter's laboratory", """
                                    There is a very big laboratory in here with big computer screens with different experiments.
                                    There is one experiment with predator, one with alien.
                                    Some of the screens don't show any experiment, they show two old games which are Pac-Man and BomberMan instead.
                                    The doctors, Dexter, Dr. Fluke Hawkins, Rick, Dr. Curtis Conners, Dr Charles Xavier, Dr. Octavius, Dr. Doom, are here
                                    discussing with each other about an Evangelion mecha robot, on how to make the robot better and what to add.
                                    Dr. Zoidberg is screaming because he is being held hostage by a tentacle. 'HELP ME!'
                                    """);
                                    //Zoidberg will give the player some food to recover health, only if the player types 'help Zoidberg' here

    game.Room room28 = new game.Room("Guard game.Room", """
                                    Just a corner hallway.
                                    The stormtroppers are sitting by a table, they're playing Yu-Gi-Oh! trading cards.
                                    They are supposed to be guarding the door to Captain Space Nemo's Office.
                                    """);
                                    //Items to acquired: Yugioh card 'Kuriboh' just for fun.

    game.Room room29 = new game.Room("A Big Hallway", """
                                    The soldiers are standing up in a line and are ordered by Buzz Lightyear to say "YES SIR!"
                                    Buzz shouted out "DO I HEAR YOU CLEAR ENOUGH!?", the soldiers roars "YES SIR!!" once again.
                                    The Jetsons family are having a picnic at a bench to the south.
                                    """);
                                    //Can get food from the Jetsons to heal if the player asks the Jetsons about they're having fun.

    game.Room room30 = new game.Room("A Weapon Museum", """
                                    There are many weapons on the walls, all of them are from some games and movies you know.
                                    Ratchet and Clank are discussing what weapon to use.
                                    The girls, Eleven and Ellie, are watching around as if they're looking for trouble. What are they up to?
                                    The mens in black are talking with Snake from Metal Gear Solid about how to use weapon in the correct ways.
                                    """,true);
                                    // Bazooka (10000, deadly for the player and the Spaceship destroyed - GAMEOVER),
                                    // GhostBuster Laser (dmg 100), Noisy Cricket (dmg 500), Indiana Jones Knife (dmg 10).

    game.Room room31 = new game.Room("Captain Space Nemo's Office", """
                                    The room reeks of refined flowers on an office table with a picture of the Captain's grandmother.
                                    The grandmother looks like someone on 150 years, she could use some wrinkle cream.
                                    There are portraits of family by the Captain. Those are some ugly kids!
                                    A cupboard full of gine glasses and alcohol. The PC on the table is turned on and shows a login screen.""");
                                    room31.addItemToRoom(new item.Item("BridgePassword", "Password", "A password for opening the bridge."));
                                    // Password2 for the PC is from the computer at Edward in room22.

    game.Room room32 = new game.Room("The Bridge Gate", """
                                    Terminators are guarding the gate. As you came across, the terminators are sniping you with their red dot scanners.
                                    You have to be careful, don't do anything suspicious here.
                                    Philip and Turanga are french kissing at the bench to the east, Bender are touching and flirting with R2D2 at the other bench to the west.
                                    Bender is looking at you as if he can see you want something from him.
                                    """);
                                    // Password1 can be acquired from Bender for the computer in room 22.

    game.Room room33 = new game.Room("Stinky Locked Toilets", """
                                    The room reeks awful with effluvia on the floor.
                                    An alien maid is scrubbing the floor and complaining about how some mad doctor did that.
                                    The toilets are locked with a sign that says
                                    'The toilets were destroyed by a mad doctor, Dr. Fluke Hawkins.'""");
                                    // Items: ....
                                    room33.addItemToRoom(new item.Item("Toilet Brush","Junk","A toilet brush that was used for some kinky play"));

    game.Room room34 = new game.Room("The Command Deck", """
                                    There is a gigantic window to the outer space,
                                    You can see some killer klowns are raging in war with the martians on some asteroids, the martians has googly eyes
                                    and featuring their brains in glass helmets.
                                    The bridge is filled with weapons-control officers and their subordinates, and a
                                    communication technician.
                                    Captain Space Nemo is focused on observing on everything in the bridge.
                                    He is paying no mind to you, you're just a nobody who has no meaning in the whole space.""",true);
    */
}