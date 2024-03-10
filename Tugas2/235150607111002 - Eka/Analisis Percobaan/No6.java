// 6. Tambahkan method pada class mobil dan hanya dapat dipanggil pada class mobil bernama
// rubahKecepatan yang mempunyai fungsi untuk merubah format kecepatan yang awalnya km/h
// menjadi m/s. Dipanggil di method setKecepatan!
import java.util.Scanner;

public class No6 {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double kecepatanMS;

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
        rubahKecepatan();
    }

    //km/jam = m/s
    private void rubahKecepatan() {
        kecepatanMS = kecepatan * 1000 / 3600;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatanMS + " m/s");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        No6 mobil = new No6();

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

        mobil.displayMessage();

        scanner.close();
    }
}
