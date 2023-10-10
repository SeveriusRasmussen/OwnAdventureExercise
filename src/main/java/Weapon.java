import AdditionStuffs.Colors;
//Abstrakt klasse for både RangedWeapon og MeleeWeapon
public abstract class Weapon extends Item{
    private int weaponDamage;

    public Weapon (String weaponName, String description, int weaponDamage){
        super(weaponName, description);
        this.weaponDamage = weaponDamage;
    }

    public abstract void dmg();
    public abstract void poisonDmg();
}
