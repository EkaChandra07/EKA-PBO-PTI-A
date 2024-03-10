// 5. Tambahkan method bernama rubahSekon mempunyai parameter bertipe double dan hanya
// dapat dipanggil pada class mobil. Method ini memiliki fungsi untuk merubah masukan user
// yaitu jam menjadi sekon. Method tersebut di panggil pada method setWaktu dengan nilai
// parameter adalah nilai dari variabel parameter method setWaktu!
import java.util.Scanner;

public class No5 {
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

    //jam ke sekon
    private double rubahSekon(double jam) {
        return jam * 3600;
    }

    //satuan jam
    public void setWaktu(double w) {
        waktu = rubahSekon(w);
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " km/jam");

        System.out.println("dalam waktu " + waktu + " detik");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        No5 mobil = new No5();

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
        double waktu = scanner.nextDouble();
        mobil.setWaktu(waktu);

        mobil.displayMessage();

        scanner.close();
    }
}
