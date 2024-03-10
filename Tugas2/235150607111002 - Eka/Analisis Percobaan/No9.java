// 9. Mahasiswa A ingin menulis pada sebuah buku tulis yang ingin dia miliki, isi lembar buku
// tersebut adalah 50 lembar. Setiap harinya ia menulis sebanyak 100 kata perhari yang cukup
// untuk 1/2 halaman buku. Buatlah rumus untuk menghitung berapa lama ia menghabiskan 1
// buku tersebut serta identifikasilah objek, dan karakteristiknya kemudian implementasikan
// dalam bentuk class.


public class No9 {
    private int jumlahLembar;
    private int kataPerHari;

    public No9(int jumlahLembar, int kataPerHari) {
        this.jumlahLembar = jumlahLembar;
        this.kataPerHari = kataPerHari;
    }

    public int JumlahLembar() {
        return jumlahLembar;
    }

    public int KataPerHari() {
        return kataPerHari;
    }

    public double hitungWaktuMenulis() {
        // 100 kata itu 1 setengah halaman berarti supaya full sehalaman harus 200 kata
        double halamanPerHari = (double) kataPerHari / 200;

        double jumlahHari = (double) jumlahLembar / (halamanPerHari * 2);

        return jumlahHari;
    }

    public static void main(String[] args) {
        No9 buku = new No9(50, 100);

        System.out.println("Karakteristik Buku:");
        System.out.println("Jumlah Lembar: " + buku.JumlahLembar());
        System.out.println("Kata Per Hari: " + buku.KataPerHari());

        //rumus berapa lama nulis 1 buku
        double waktuMenulis = buku.hitungWaktuMenulis();
        System.out.println("Waktu yang dibutuhkan untuk menulis 1 buku: " + waktuMenulis + " hari");
    }
}
