// Kelas untuk informasi akun pelanggan
class CustomerAccount {
    private final String accountNumber;
    private final String name;
    private double balance;
    private final int pin;
    private boolean isBlocked; // Menyimpan status akun apakah terblokir atau tidak
    private int authenticationAttempts;

    public CustomerAccount(String accountNumber, String name, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        this.isBlocked = false;
        this.authenticationAttempts = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }

    // Method untuk melakukan pembelian
    public boolean makePurchase(double amount) {
        
        if (isBlocked) {
            System.out.println("Akun Anda terblokir. Silakan hubungi layanan pelanggan.");
            return false;
        }
        
        if (amount > balance) {
            System.out.println("Saldo tidak mencukupi untuk melakukan transaksi.");
            return false;
        }
        
        if (balance - amount < 10000) {
            System.out.println("Transaksi gagal. Saldo minimal harus Rp10.000.");
            return false;
        }

        
        int accountType = Integer.parseInt(accountNumber.substring(0, 2));

        // Menghitung cashback sesuai dengan jenis rekening
        double cashback = 0.0;
        if (amount > 1000000) {
            switch (accountType) {
                case 38:
                    cashback = 0.05 * amount;
                    break;
                case 56:
                    cashback = 0.07 * amount;
                    break;
                case 74:
                    cashback = 0.10 * amount;
                    break;
                default:
                    cashback = 0.02 * amount; // Default cashback untuk jenis rekening lainnya
                    break;
            }
        }

        // Mengurangi jumlah pembelian dari saldo dan menambahkan cashback
        balance -= amount;
        balance += cashback;

        System.out.println("Transaksi berhasil. Saldo tersisa: Rp" + balance);
        return true;
    }

    // Method untuk melakukan top up saldo
    public void topUp(double amount) {
        
        if (isBlocked) {
            System.out.println("Akun Anda terblokir. Silakan hubungi layanan pelanggan.");
            return;
        }
        balance += amount;
        System.out.println("Top up berhasil. Saldo tersisa: Rp" + balance);
    }

    // Method untuk melakukan autentikasi menggunakan PIN
    public boolean authenticate(int enteredPin) {
        
        if (isBlocked) {
            System.out.println("Akun Anda terblokir. Silakan hubungi layanan pelanggan.");
            return false;
        }
        // Periksa PIN
        if (enteredPin == pin) {
            authenticationAttempts = 0;
            return true;
        } else {
            authenticationAttempts++;
            if (authenticationAttempts >= 3) {
                isBlocked = true; // akun akan diblokir jika salah tiga kali
                System.out.println("Akun Anda telah diblokir karena telah melakukan 3x kesalahan autentikasi.");
            } else {
                System.out.println("PIN salah. Percobaan ke-" + authenticationAttempts + " dari 3.");
            }
            return false;
        }
    }
}
