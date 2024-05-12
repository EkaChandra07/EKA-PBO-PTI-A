// Abstract class Pegawai
abstract class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    // Abstract method gaji
    public abstract double gaji();

    @Override
    public String toString() {
        return "Nama: " + nama + "\nNo. KTP: " + noKTP + "\nPendapatan: " + gaji() + "\n";
    }
}
