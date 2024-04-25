package source.pertemuan6;

/**
 * PenghitunganHarga
 */
public class PenghitunganHarga {

    public static void main(String[] args) {
        Barang tomat = new Barang("Tomat", 5000, 10);
        Barang cabai = new Barang("Cabai", 10000, 15);
        Barang daunBawang = new Barang("Daun Bawang", 1000, 25);

        Barang.belanja(daunBawang, 2); // Beli Daun Bawang dengan jumlah 2 total harga 2000
        Barang.belanja(cabai, 4); // Beli Cabai dengan jumlah 4 total harga 40000
        Barang.belanja(daunBawang, 5); // Beli Daun Bawang dengan jumlah 5 total harga 5000
        Barang.belanja(tomat, 3); // Beli Tomat dengan jumlah 3 total harga 15000

        Barang.belanja(cabai, 100);
    }
}

class Barang {
    private final String nama;
    private final double harga;
    private int stok;

    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public static void belanja(Barang barang, int jumlah) {
        System.out.println("-".repeat(50));

        // cek apakah stok barang ada dan lebih atau sama dengan jumlah yang dipesan
        if (barang.getStok() < jumlah) {
            // jumlah barang yang dipesan melebihi stok barang yang ada
            System.out.printf("Stok %s kurang\nStok tersedia: %d\n", barang.getNama(), barang.getStok());
            return;
        }

        // output sesuai format
        System.out.printf("Beli %s dengan jumlah %d total harga %d\n", barang.getNama(), jumlah, ((int)barang.getHarga() * jumlah));

        // kurangi stok dengan jumlah barang yang dipesan

        int stokSekarang = barang.getStok() - jumlah;

        barang.setStok(stokSekarang);

        // perlihatkan stok barang yang ada setelah dibeli
        System.out.printf("Stok %s sekarang: %d\n", barang.getNama(), barang.getStok());
    }
}