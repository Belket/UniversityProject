
public class Unit {
    private Weapon weapon;
    private int health;
    private int armor;
    private int weight;
    private int height;
    private int damage;
    private double strength_coeffitient;

    public Unit(int health, int armor, int weight, int height, int damage, double strength_coeffitient){
        this.health = health;
        this.armor = armor;
        this.weight = weight;
        this.health = height;
        this.damage = damage;
        this.strength_coeffitient = strength_coeffitient;
    }

    public double physical_attack(){
        double weapon_damage = 0;
        if (this.weapon != null) {
            weapon_damage = this.weapon.physical_attack() * this.strength_coeffitient;
        }
        return this.damage + weapon_damage;
    }

    public void set_weapon(Weapon weapon){
        this.weapon = weapon;
    }
}
