package source.pertemuan6;

public class Mahasiswa {
    private String nama;
    private static String asalUniv;
    private final String tanggalLahir;
    public static final int jumlahB = 0;

    public Mahasiswa() {
        tanggalLahir = "gak ada";
    }

    public Mahasiswa(String nama) {
        this.nama = nama;
        tanggalLahir = "gak ada";
    }

     
    public Mahasiswa(String nama, String tglLahir) {
        this.nama = nama;
        asalUniv = "UB";
        tanggalLahir = tglLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    // gak bisa krn final
    // public void setTanggalLahir(String tgl) {
    //     this.tanggalLahir = tgl;
    // }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static String getAsalUniv() {
        return asalUniv;
    }

    public static void setAsalUniv(String asalUniv) {
        Mahasiswa.asalUniv = asalUniv;
    }

}