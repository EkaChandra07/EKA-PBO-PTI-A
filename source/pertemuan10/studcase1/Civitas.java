package source.pertemuan10.studcase1;

abstract class Civitas {
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    private String nama;
    private int umur;
    private boolean jenisKelamin;

    public Civitas(String nama, int umur, boolean jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public Civitas(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = true;
    }

    abstract public void masukKelas();

    public void mainGameCorner(int TV) {
        System.out.println(nama + " sedang bermain pada TV " + TV);
    }
}