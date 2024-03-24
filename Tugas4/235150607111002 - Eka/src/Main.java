public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        Hero hero2 = new Hero("Zilong");
        Hero hero3 = new Hero("Hayabusa", 3000, 150);
        
        hero1.attack();
        hero1.attack("Enemy1");
        hero1.attack("Enemy2", 120);
        
        hero3.attack();
        hero3.attack("Enemy3");
        hero3.attack("Enemy4", 256);
        
        // Memanggil method overloading yang telahku buat
        Hero heroClone = hero2.cloneHero();
        
        System.out.println("Name: " + heroClone.getNama());
        System.out.println("Health: " + heroClone.getHealth());
        System.out.println("Power: " + heroClone.getPower());
    }
}
