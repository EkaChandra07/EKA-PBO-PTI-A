// 4. Tambahkan method pada class mobil bernama setWaktu yang berparameter double, yang
// kemudian disimpan pada variabel waktu! (Ketetuannya adalah user harus menginputkan
// dalam satuan jam)

import java.util.Scanner;

public class No4 {
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

    //waktu dalam satuan jam
    public void setWaktu(double w) {
        waktu = w;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " km/jam");
        
        System.out.println("dalam waktu " + waktu + " jam");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mobil mobil = new Mobil();

        System.out.println("Masukkan merek mobil: ");
        String merek = scanner.nextLine();
        mobil.setManufaktur(merek);

        System.out.println("Masukkan nomor plat mobil: ");
        String noPlat = scanner.nextLine();
        mobil.setNoPlat(noPlat);

        System.out.println("Masukkan warna mobil: ");
        String warna = scanner.nextLine();
        mobil.setWarna(warna);

        System.out.println("Masukkan kecepatan mobil (km/jam): ");
        int kecepatan = scanner.nextInt();
        mobil.setKecepatan(kecepatan);

        System.out.println("Masukkan waktu tempuh mobil (jam): ");
        String waktu = scanner.nextLine();
        mobil.setWarna(waktu);

        mobil.displayMessage();

        scanner.close();
    }
}
