package item;

// Arv klassen til Item klassen. Can also use for poison I think?
public class FoodItem extends Item {
    private int healthRestore; // Add a field for the nutrition value of the food.
    private int damage;

        public FoodItem(String name, String description, int healthRestore, int damage) {
            super(name, description);
            this.healthRestore = healthRestore;
            this.damage = damage;
        }

        // implementering af den abstrakte metode 'hpRestored' og 'poisonDmg'
        public int getHealthRestore() {
            return healthRestore;
        }

        public int getDamage() {
            return damage;
        }


}


