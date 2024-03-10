// 7. Tambahkan method pada class mobil bernama hitungJarak yang mempunyai aksi untuk
// menghitung jarak yang dapat di tempuh oleh mobil dengan rumus jarak = kecepatan * waktu!


public class No7 {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = i;
    }

    public void setWaktu(double w) {
        waktu = w;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan);
    }

    //rumus jarakkk
    public double hitungJarak() {
        return kecepatan * waktu;
    }

    public static void main(String[] args) {
        No7 mobil = new No7();

        mobil.setManufaktur("Toyota");
        mobil.setNoPlat("AB 1234 CD");
        mobil.setWarna("Hitam");
        mobil.setKecepatan(80);
        mobil.setWaktu(2.5);

        mobil.displayMessage();
        System.out.println("Jarak yang dapat ditempuh mobil: " + mobil.hitungJarak() + " km");
    }
}

