package source.pertemuan9;

public class Security extends Employee {
    public Security(String nama, String nk, double ip) {
        super(nama, nk, ip);
    }

    public void bekerja() {
        System.out.println(getNama() + " sedang mengawasi kantor");
    }
}
