public class Main {
    public static void main(String[] args) {
        Adventure game = new Adventure();
        UserInterface ui = new UserInterface(game, adventure);
        ui.start();
    }
}
