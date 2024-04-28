public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahunMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (super.getGaji() * 0.1);
    }

    @Override
    public String toString() {
        return super.toString() + "\ndepartemen\t: " + departemen;
    }
}
