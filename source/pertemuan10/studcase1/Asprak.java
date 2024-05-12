package source.pertemuan10.studcase1;

public class Asprak extends Mahasiswa {
    private String mataKuliah;

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mk) {
        mataKuliah = mk;
    }

    public Asprak(String nama, int umur, boolean jenisKelamin) {
        super(nama, umur, jenisKelamin);
    }

    @Override
    public void masukKelas () {
        System.out.println(getNama() + " sedang mengajar " + mataKuliah);
    }
}