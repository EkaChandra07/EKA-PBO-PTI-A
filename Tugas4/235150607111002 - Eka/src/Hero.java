public class Hero {
    private String nama;
    private int health;
    private int power;
    
    // 3 Constructor Overload
    public Hero() {
        this.nama = "Nana";
        this.health = 2350;
        this.power = 15;
    }
    
    public Hero(String nama) {
        this.nama = nama;
        this.health = 100;
        this.power = 10;
    }
    
    public Hero(String nama, int health, int power) {
        this.nama = nama;
        this.health = health;
        this.power = power;
    }
    
    // 3 Method Overload
    public void attack() {
        System.out.println("Hero " + nama + " is attacking!");
    }
    
    public void attack(String target) {
        System.out.println("Hero " + nama + " is attacking " + target + "!");
    }
    
    public void attack(String target, int damage) {
        System.out.println("Hero " + nama + " is attacking " + target + " and deals " + damage + " damage!");
    }
    
    // 1 Method instans
    public Hero cloneHero() {
        Hero clone = new Hero(this.nama, this.health, this.power);
        return clone;
    }
    
    public void chara(String nama, int health, int power) {
        this.nama = nama;
        this.health = health;
        this.power = power;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getHealth() {
        return health;
    }
    
    public int getPower() {
        return power;
    }
}
