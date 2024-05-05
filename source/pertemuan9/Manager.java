package source.pertemuan9;

public class Manager extends Employee {
    public Manager(String nama, String nk, double ip) {
        super(nama, nk, ip);
    }

    public void bekerja() {
        System.out.println(getNama() + " sedang menyuruh2");
    }

    public void memulaiProjek() {
        System.out.println(getNama() + " sedang memulai proyek");
    }

    public String toString() {
        return "Manager : " + getNama();
    }
}
