package item;

public class Weapon extends Item {
    private int usesLeft;
    private int damage;

    public Weapon(String name, String description, int uses, int damage) {
        super(name, description);
        this.usesLeft = uses;
        this.damage = damage;
    }

    public int getUsesLeft() {
        return usesLeft;
    }

    public int getDamage() {
        return damage;
    }

    public void use() {
        if (usesLeft > 0) {
            System.out.println("You used the " + getName() + " and dealt " + damage + " damage.");
            usesLeft--;
            if (usesLeft == 0) {
                System.out.println("The " + getName() + " is now worn out and can't be used anymore.");
            }
        } else {
            System.out.println("The " + getName() + " is worn out and can't be used anymore.");
        }
    }
}