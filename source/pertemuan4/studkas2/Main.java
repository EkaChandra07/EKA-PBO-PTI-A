package source.pertemuan4.studkas2;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Pak Afi", "0183");

        MataKuliah matkul = new MataKuliah("CIE7004", "ASD", 3);

        Mahasiswa mhs = new Mahasiswa("Bocchi", "22");

        System.out.println(dosen.a());
        System.out.println(dosen.method1());
        System.out.println(dosen.method1().nama);
        System.out.println(dosen.method1().NIDN);

        dosen.mengajar(mhs, matkul);

        // Pak Afi mengajar Bocchi pada mata kuliah dengan kode CIE7004 dengan nama mata kuliah ASD yang memiliki bobot 3 sks
    }
}
