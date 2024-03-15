package source.pertemuan4.studkas2;

public class Dosen {
    public String nama;
    public String NIDN;

    public Dosen(String nama, String nIDN) {
        this.nama = nama;
        NIDN = nIDN;
    }

    void mengajar(String universitas) {
        System.out.println(this.nama + " mengajar di universitas " + universitas);
    }

    void mengajar(MataKuliah mk) {
        System.out.println(this.nama + " mengajar mata kuliah " + mk.namaMataKuliah);
    }

    void mengajar(Mahasiswa mhs) {
        System.out.println(this.nama + " mengajar mahasiswa dengan nama " + mhs.nama);
    }

    void mengajar(Mahasiswa mhs, MataKuliah matakuliah){
        System.out.println(this.nama + " mengajar " + mhs.nama + " pada mata kuliah dengan kode " + matakuliah.kodeMataKuliah + " dengan nama mata kuliah " + matakuliah.namaMataKuliah + " yang memiliki bobot " + matakuliah.sks + " sks");
    }

    Dosen method1() {
        Dosen n = new Dosen("Devon", "12345");
        return n;
    }

    String a() {
        return "ini string";
    }
}