import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahunMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahunMasuk, 1, 1);
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int tahun = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (tahun <= 5) {
            return gaji * 0.05;
        } else if (tahun <= 10) {
            return gaji * 0.1;
        } else {
            return gaji * 0.15;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBonus() + (jumlahAnak * 20);
    }

    @Override
    public String toString() {
        return String.format("%s\ntahun masuk\t: %-2d %-2s %-4d\njumlah anak\t: %-10d\ngaji\t        : %.1f", 
super.toString(), tahunMasuk.getDayOfMonth(),
tahunMasuk.getMonth().toString().substring(0,3),
tahunMasuk.getYear(), jumlahAnak, gaji);
    }
}
