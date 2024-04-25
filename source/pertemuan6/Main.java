package source.pertemuan6;

public class Main {
    public static void main(String[] args) {
        //    demo static 

        Mahasiswa hero1 = new Mahasiswa("Mantan");
        Mahasiswa hero2 = new Mahasiswa("Pacar");

        System.out.println(hero1.getAsalUniv());
        System.out.println(hero2.getAsalUniv());

        Mahasiswa.setAsalUniv("UGM");

        System.out.println(hero1.getAsalUniv());

        // demo final

        Mahasiswa hero3 = new Mahasiswa("Bocchi", "27 Jan 2004");
        Mahasiswa hero4 = new Mahasiswa();


        System.out.println(hero4.getTanggalLahir());
        System.out.println(hero3.getTanggalLahir());
    }
}
