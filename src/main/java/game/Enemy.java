package game;

import item.Weapon;

public class Enemy {
    private String enemyName;
    private Weapon enemyWeapon;
    private int enemyHealth;

    public Enemy(String enemyName, int healthPoints, int damage) {
        this.enemyName = enemyName;
        this.enemyWeapon = enemyWeapon;
        this.enemyHealth = enemyHealth;
    }

   public String getEnemyName() {
        return enemyName;
   }

   public Weapon getEnemyWeapon() {
        return enemyWeapon;
   }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }
}