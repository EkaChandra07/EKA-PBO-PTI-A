package source.pertemuan10.studcase1;

public class Dosen extends Civitas {
    public String getNIDN() {
        return NIDN;
    }
    private String NIDN;

    public Dosen(String nama, int umur, boolean jenisKelamin) {
        super(nama, umur);
    }

    public void masukKelas () {
        System.out.println(getNama() + " sedang mengajar materi");
    }

    @Override
    public void mainGameCorner(int TV) {
        System.out.println(getNama() + " sedang bermain pada TV " + TV + " bersama anaknya");
    }
}