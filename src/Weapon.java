public class Weapon {
    private float physical_damage;
    private float speed;
    private float magic_damage;

    public Weapon(float physical_damage, float speed, float magic_damage){
        this.physical_damage = physical_damage;
        this.speed = speed;
        this.magic_damage = magic_damage;
    }

    public float physical_attack(){
        return this.physical_damage;
    }
}
