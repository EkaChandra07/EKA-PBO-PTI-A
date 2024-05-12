package source.pertemuan10.studcase1;

public class Mahasiswa extends Civitas {
    public String getNIM() {
        return NIM;
    }
    public double getIPK() {
        return IPK;
    }
    private String NIM;
    private double IPK;

    public Mahasiswa(String nama, int umur, boolean jenisKelamin) {
        super(nama, umur, jenisKelamin);
    }

    public void masukKelas () {
        System.out.println(getNama() + " sedang menyimak kelas ");
    }

    void masukKelas (String mataKuliah) {
        System.out.println(getNama() + " sedang menyimak kelas " + mataKuliah);
    }

    void masukKelas (int jumlahTeman) {
        System.out.println(getNama() + " sedang berbincang dengan " + jumlahTeman + " orang");
    }

    @Override    
    public void mainGameCorner(int TV) {
        System.out.println(getNama() + " sedang bermain pada TV " + TV + " bareng temannya");
    }
}