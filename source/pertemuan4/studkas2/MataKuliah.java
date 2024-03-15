package source.pertemuan4.studkas2;

public class MataKuliah {
    public String kodeMataKuliah;
    public String namaMataKuliah;
    public int sks;

    public MataKuliah() {}

    public MataKuliah(String kodeMatkul, String namaMatkul, int sks) {
        kodeMataKuliah = kodeMatkul;
        namaMataKuliah = namaMatkul;
        this.sks = sks;
    }

}
