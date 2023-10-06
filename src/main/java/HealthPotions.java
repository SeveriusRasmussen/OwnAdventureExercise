// Arv klassen til Item klassen.

class HealthPotions extends Item {
    public HealthPotions(String name, String description) {
        super(name, description);
    }

    // implementering af den abstrakte metode 'hpRestored' og 'poisonDmg'
    public void hpRestored() {
        System.out.println(getItemName() + " 50+ HP");
    }
}
