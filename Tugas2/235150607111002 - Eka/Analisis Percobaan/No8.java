// 8. Tambahkan informasi jarak yang dapat ditempuh pada method displayMessage kemudian
// rubah satuannya yang awalnya m (meter) menjadi km (kilometer)!


public class No8 {
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
        System.out.println("Jarak yang dapat ditempuh mobil: " + hitungJarak() / 1000 + " km");
    }

    //rumus jarakkk
    public double hitungJarak() {
        return kecepatan * waktu;
    }

    public static void main(String[] args) {
        No8 mobil = new No8();

        mobil.setManufaktur("Toyota");
        mobil.setNoPlat("AB 1234 CD");
        mobil.setWarna("Hitam");
        mobil.setKecepatan(80);
        mobil.setWaktu(2.5);

        mobil.displayMessage();
    }
}

