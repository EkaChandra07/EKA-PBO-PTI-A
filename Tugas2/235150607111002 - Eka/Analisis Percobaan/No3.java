// 3. Rubah kode pada mainMobil diatas menjadi proses meminta masukan dari user dan buat
// menjadi interaktif!

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //mobil1
        MobilGabungan m1 = new MobilGabungan();
        System.out.print("Masukkan kecepatan mobil pertama: ");
        int kecepatan1 = scanner.nextInt();
        scanner.nextLine();
        m1.setKecepatan(kecepatan1);
        System.out.print("Masukkan merek mobil pertama: ");
        String merek1 = scanner.nextLine();
        m1.setManufaktur(merek1);
        System.out.print("Masukkan nomor plat mobil pertama: ");
        String noPlat1 = scanner.nextLine();
        m1.setNoPlat(noPlat1);
        System.out.print("Masukkan warna mobil pertama: ");
        String warna1 = scanner.nextLine();
        m1.setWarna(warna1);
        m1.displayMessage();
        System.out.println("================");

        //mobil2
        MobilGabungan m2 = new MobilGabungan();
        System.out.print("Masukkan kecepatan mobil kedua: ");
        int kecepatan2 = scanner.nextInt();
        scanner.nextLine();
        m2.setKecepatan(kecepatan2);
        System.out.print("Masukkan merek mobil kedua: ");
        String merek2 = scanner.nextLine();
        m2.setManufaktur(merek2);
        System.out.print("Masukkan nomor plat mobil kedua: ");
        String noPlat2 = scanner.nextLine();
        m2.setNoPlat(noPlat2);
        System.out.print("Masukkan warna mobil kedua: ");
        String warna2 = scanner.nextLine();
        m2.setWarna(warna2);
        m2.displayMessage();
        System.out.println("================");

        // Merubah warna mobil1
        System.out.println("Masukkan warna baru untuk mobil pertama: ");
        String newWarna1 = scanner.nextLine();
        m1.setWarna(newWarna1);

        m1.displayMessage();

        scanner.close();
    }
}
