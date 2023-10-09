
// Abstrakt klassen 'Item' "Super"-klassen
abstract class Item {
    private String itemName;
    private String description;

    // this metode for både name og description.
    public Item(String itemName, String description) {
        this.itemName = itemName;
        this.description = description;
    }

    /* Abstrakt metoder for klassen Food.
    Abstrakt metoder for melee og ranged weapon ligger i weapon klassen. */
    public abstract void hpRestored();



    // metode til at få 'Item'ens navn og description
    public String getItemName() {
        return itemName;
    }
    public String getDescription() {
        return description;
    }

    public String toString() {
        return itemName;
    }
}
