// Subclass PegawaiHarian
class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    @Override
    public double gaji() {
        if (totalJam <= 40) {
            return upahPerJam * totalJam;
        } else {
            int normalJam = 40;
            int lemburJam = totalJam - normalJam;
            return (upahPerJam * normalJam) + (lemburJam * upahPerJam * 1.5);
        }
    }

    @Override
    public String toString() {
        return "Pegawai Harian:\n" + super.toString() + "Upah / Jam: " + upahPerJam + "\nTotal Jam Kerja: " + totalJam + "\nPendapatan: " + gaji() + "\n";
    }
}
