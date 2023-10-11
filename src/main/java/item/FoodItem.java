package item;
// Arv klassen til Item klassen. Can also use for poison I think?
public class FoodItem extends Item {
    private int healthPoints; // Add a field for the nutrition value of the food.

        public FoodItem(String name, String description, int healthPoints) {
            super(name, description);
            this.healthPoints = healthPoints;
        }

        // implementering af den abstrakte metode 'hpRestored' og 'poisonDmg'
        public int getHealthPoints() {
            return healthPoints;
        }


}


