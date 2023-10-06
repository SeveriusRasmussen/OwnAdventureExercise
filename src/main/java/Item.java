// Abstrakt klassen 'Item.Item' "Super"-klassen
abstract class Item {
    //'Protected means that it cant be used outside the class, but can be used by subclasses and package methods.
    // to make this work, such as these variables are not accessible where they shouldn't be.
    protected final String NAME;
    protected final String FUNCTION;
    protected final String DESCRIPTION;
   // protected final String ROOM_DESCRIPTION;

    // this metode for både name og description.
    public Item(String NAME, String FUNCTION, String DESCRIPTION) {
        this.NAME = NAME;
        this.FUNCTION = FUNCTION;
        this.DESCRIPTION = DESCRIPTION;

    }

    /* Abstrakt metoder for klassen Food.
    Abstrakt metoder for melee og ranged weapon ligger i weapon klassen. */
    public abstract void hpRestored();



    // metode til at få 'Item.Item'ens navn og description
    public String getNAME() {
        return NAME;
    }
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public String toString() {
        return NAME;
    }


}
