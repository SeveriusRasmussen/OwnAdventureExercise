import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;
    private final Adventure adventure;

    public UserInterface() {
        scanner = new Scanner(System.in);
        adventure = new Adventure();
    }

    public void startGame() {
        System.out.println("""
                \033[0;33mWelcome to the house of the void
                You are here to find the dimension cube to get away from the void.
                You are standing in front of the front door of the house.
                Then you enter the house and are now standing in:\033[0m
                """ + adventure.getCurrentRoomName());

        while (true) {
            String input = scanner.next().toUpperCase();
            adventure.processInput(input);
        }
    }
}