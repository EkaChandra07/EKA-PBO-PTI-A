package source.pertemuan4.studkas1;
public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();

        Hero hero2 = new Hero("Ado");

        Hero hero3 = new Hero("Aldoo", 10000, 100);

        Dragon dragon1 = new Dragon("pink");

        hero1.menyerang();

        hero1.menyerang("dragon");

        hero1.menyerang(dragon1);

        hero1.menyerang(hero2);

        hero1.menyerang(hero3, 50);
    }

}

