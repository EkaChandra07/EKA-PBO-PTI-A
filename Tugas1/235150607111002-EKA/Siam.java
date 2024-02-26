import java.util.*;

public class Siam {
    public static void main(String[] args) {
        String nim = "235150607111002";
        String password = "ekonihboss";
        boolean sudahLogin = false;

        String nama = "Eka Chandra Winata";
        int umur = 20;
        String alamat = "Jalan Dr. Sutomo No.159";

        Scanner input = new Scanner(System.in);

        while (true) {
            if (!sudahLogin) {
                System.out.println("Selamat datang di SIAM, Silakan login!");
                System.out.print("Masukkan nim anda     : ");
                String masukanNim = input.nextLine();
                System.out.print("Masukkan password anda: ");
                String masukanPassword = input.nextLine();

                if (nim.equals(masukanNim) && password.equals(masukanPassword)) {
                    sudahLogin = true;
                    System.out.println("Anda berhasil login!");
                } else {
                    System.out.println("Nim atau password anda salah. Silakan coba lagi.");
                }
            } else {
                System.out.println("Anda telah login.");
                System.out.println("Apakah Anda ingin melihat biodata Eka? (iya/tidak/logout)");
                String pilih = input.nextLine().toLowerCase();

                if (pilih.equals("iya")) {
                    System.out.println("Biodata Eka:");
                    System.out.println("Nama: " + nama);
                    System.out.println("Umur: " + umur);
                    System.out.println("Alamat: " + alamat);
                } else if (pilih.equals("logout")) {
                    sudahLogin = false;
                    System.out.println("Anda berhasil logout.");
                    break;
                } else {
                    System.out.println("Kalau gamau ngapain logout?");
                }
            }
        }
    }
}
