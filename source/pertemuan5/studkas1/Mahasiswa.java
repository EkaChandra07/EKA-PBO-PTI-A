package source.pertemuan5.studkas1;

public class Mahasiswa {
    private String nama;
    private String nim;

    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public Mahasiswa(String n, String nim){
        nama = n;
        this.nim = nim;
    }
}
