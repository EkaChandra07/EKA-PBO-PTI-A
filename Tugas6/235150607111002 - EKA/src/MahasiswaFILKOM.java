public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getStatus() {
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int prodiDigit = Integer.parseInt(nim.substring(6, 7));
        String prodi = "";
        switch (prodiDigit) {
            case 2:
                prodi = "Teknik Informatika";
                break;
            case 3:
                prodi = "Teknik Komputer";
                break;
            case 4:
                prodi = "Sistem Informasi";
                break;
            case 6:
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case 7:
                prodi = "Teknologi Informasi";
                break;
            default:
                prodi = "Unknown";
        }
        return String.format("%s, 20%02d", prodi, angkatan);
    }

    public double getBeasiswa() {
        if (ipk >= 3.5) {
            return 75.0;
        } else if (ipk >= 3.0) {
            return 50.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() + "\nnim\t        : " + nim + "\nipk\t        : " + ipk + "\nstatus\t        : " + getStatus();
    }
}
