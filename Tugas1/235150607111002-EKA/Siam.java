import java.util.*;

public class Siam {
    public static void main(String[] args) {
        String nim = "235150607111002";
        String password = "ekonihboss";
        boolean isLoggedIn = false;

        Scanner input = new Scanner(System.in);

        while (true) {
            if (!isLoggedIn) {
                System.out.println("Selamat datang di SIAM, Silakan login!");
                System.out.print("Masukkan nim anda     : ");
                String inputNim = input.nextLine();
                System.out.print("Masukkan password anda: ");
                String inputPassword = input.nextLine();

                if (nim.equals(inputNim) && password.equals(inputPassword)) {
                    isLoggedIn = true;
                    System.out.println("Anda berhasil login!");
                } else {
                    System.out.println("Nim atau password anda salah. Silakan coba lagi.");
                }
            } else {
                System.out.println("Anda telah login.");
                System.out.println("Apakah Anda ingin melakukan logout? (iya/tidak)");
                String choice = input.nextLine().toLowerCase();

                if (choice.equals("iya")) {
                    isLoggedIn = false;
                    System.out.println("Anda berhasil logout.");
                    break;
                } else {
                    System.out.println("Kalau gamau ngapain logout?");
                }
            }
        }
    }
}
