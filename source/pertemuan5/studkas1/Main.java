package source.pertemuan5.studkas1;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Aldo");

        System.out.println(hero1.getHp());
        
        hero1.setNama("Devan");
        hero1.setAtk(3050);
        hero1.setHp(100000000);

        Negara negara1 = new Negara("Konohagakure", "Jepang");
        negara1.setNamaNegara("Indonesia");
        System.out.println(negara1.getNamaNegara());

        Mahasiswa mahasiswa = new Mahasiswa("Firza", "23");
        mahasiswa.setNama("aurel");
        System.out.println(mahasiswa.getNama());
    }    
}
