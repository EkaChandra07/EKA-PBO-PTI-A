import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerAccountManager accountManager = new CustomerAccountManager();
        Scanner scanner = new Scanner(System.in);

        //akun pelangganya
        accountManager.addAccount("3812345678", "Anisa", 2000000, 1234);
        accountManager.addAccount("5612345678", "Janggar", 1500000, 5678);
        accountManager.addAccount("7412345678", "Praroro", 3000000, 9012);

        boolean exit = false;

        while (!exit) {
            System.out.println("Masukkan nomor akun Anda:");
            String accountNumber = scanner.nextLine();

            int authenticationAttempts = 0;
            CustomerAccount currentAccount = null;

            //cek pin
            while (authenticationAttempts < 3) {
                System.out.println("Masukkan PIN Anda:");
                int pin = scanner.nextInt();
                scanner.nextLine();

                currentAccount = accountManager.getAccounts().get(accountNumber);

                
                if (currentAccount != null) {
                    if (currentAccount.authenticate(pin)) {
                        break;
                    }
                }

                authenticationAttempts++;

                // kalau sudah 3 kali coba dan gagal akan keluar dari perulangan
                if (authenticationAttempts >= 3) {
                    break;
                }

                System.out.println("Nomor akun atau PIN salah. Silakan coba lagi.");
                System.out.println("Masukkan nomor akun Anda:");
                accountNumber = scanner.nextLine();
            }

            if (authenticationAttempts < 3) {
                System.out.println("Apakah Anda ingin melakukan pembelian (1) atau top up saldo (2)?");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.println("Masukkan jumlah pembelian:");
                    double amount = scanner.nextDouble();
                    accountManager.makePurchase(accountNumber, amount, currentAccount.getPin());
                } else if (choice == 2) {
                    System.out.println("Masukkan jumlah top up saldo:");
                    double amount = scanner.nextDouble();
                    accountManager.topUp(accountNumber, amount, currentAccount.getPin());
                } else {
                    System.out.println("Pilihan tidak valid.");
                }

                System.out.println("Apakah Anda ingin melanjutkan transaksi? (y/n)");
                String continueTransaction = scanner.next();
                if (!continueTransaction.equalsIgnoreCase("y")) {
                    exit = true;
                }
            } else {
                System.out.println("Akun Anda telah diblokir karena telah melakukan 3x kesalahan autentikasi.");
                exit = true;
            }
        }

        scanner.close();
    }
}
