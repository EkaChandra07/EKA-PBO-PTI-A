import java.util.HashMap;
import java.util.Map;

// Kelas untuk mengelola semua akun pelanggan
class CustomerAccountManager {
    private final Map<String, CustomerAccount> accounts;

    public CustomerAccountManager() {
        accounts = new HashMap<>();
    }

    public Map<String, CustomerAccount> getAccounts() {
        return accounts;

    }

    // Method untuk menambahkan akun pelanggan
    public void addAccount(String accountNumber, String name, double balance, int pin) {
        getAccounts().put(accountNumber, new CustomerAccount(accountNumber, name, balance, pin));
    }

    // Method untuk melakukan pembelian
    public boolean makePurchase(String accountNumber, double amount, int pin) {
        CustomerAccount account = getAccounts().get(accountNumber);
        if (account != null && account.authenticate(pin)) {
            boolean success = account.makePurchase(amount);
            if (success) {
                System.out.println("Sisa saldo: Rp" + account.getBalance());
            }
            return success;
        } else {
            return false;
        }
    }

    // Method untuk melakukan top up saldo
    public void topUp(String accountNumber, double amount, int pin) {
        CustomerAccount account = getAccounts().get(accountNumber);
        if (account != null && account.authenticate(pin)) {
            account.topUp(amount);
            System.out.println("Sisa saldo: Rp" + account.getBalance());
        }
    }
}
