public class Hero {
    private String nama;
    private int health;
    private int power;
    
    public void attack() {
        
        System.out.println("Hero " + nama + " is attacking!");
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
    
    public static void main(String[] args) {
        
        Hero hero1 = new Hero();
        
        
        hero1.chara("Zilong", 2689, 123);
        
        
        hero1.attack();
        
        
        System.out.println("Name: " + hero1.getNama());
        System.out.println("Health: " + hero1.getHealth());
        System.out.println("Power: " + hero1.getPower());
    }
}
