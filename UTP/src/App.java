import java.util.Scanner;

public class App {
    
    Cinema cinema;
    User sessionUser;

    public App() {
        cinema = new Cinema("", 20);
        sessionUser = null;
    }

    public void menu() {
        while (true) {
            System.out.println("-".repeat(40));
            System.out.printf("%s Cinema\n", cinema.getName());
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            char choice = getChar("Pick your choice : ");

            switch(choice) {
                case '1' :
                    login();
                    break;
                case '2' : 
                    register();
                    break;
                default :
                    System.out.println("Thank you for using our app!");
                    System.exit(0);
            }
        }
    }

    public void register() {
        System.out.println("-".repeat(40));
        System.out.println("Register to our system");
        String fullname = getString("Fullname : ");
        String email = getString("Email : ");
        String password = getString("Password : ");
        double balance = getInt("Initial Balance : ");

        User user = new User(email, password, fullname, balance);

        cinema.registerUser(user);

        System.out.println("Successfully registered User!");
    }

    public void login() {
        int counter = 0;
        User user = null;
        do {
            System.out.println("-".repeat(40));
            System.out.println("Login to our system");
            String email = getString("Email : ");
            String password = getString("Password : ");
    
            user = cinema.authenticateUser(email, password);
    
            if (user == null) {
                System.out.println("Invalid Credential");
                counter++;
            }
            if (counter >= 3) {
                System.out.println("Exiting...");
                System.exit(0);
            }

        } while(user == null);

        sessionUser = user;
        System.out.println("Login Success");

        dashboard();
    }

    public void dashboard() {
        if (sessionUser == null) return;

        while (true) {
            System.out.println("-".repeat(40));
            System.out.printf("Welcome %s to %s Cinema!\n", sessionUser.getFullName(), cinema.getName());
            System.out.println("1. Pesan Tiket");
            System.out.println("2. Tampilkan Tiket milik Saya");
            System.out.println("3. Lihat Studio yang Ada");
            System.out.println("4. Lihat Detail Studio");
            System.out.println("5. Top Up Saldo"); 
            System.out.println("6. Exit Program");
            char choice = getChar("Pick your choice : ");

            switch(choice) {
                case '1' :
                    pesanTiket();
                    break;
                case '2' : 
                    tampilkanTiket();
                    break;
                case '3' :
                    lihatStudio();
                    break;
                case '4' :
                    lihatDetailStudio();
                    break;
                case '5' :
                    topUpSaldo();
                    break;
                default :
                    System.out.println("Thank you for using our app!");
                    System.exit(0);
            }
        }
    }   

    public void pesanTiket() {
        System.out.println("Memesan Tiket");

        cinema.displayAvailableStudio();
        int studioNumber = getInt("Pilih Studio : ");

        cinema.displayStudioDetail(studioNumber);

        System.out.println("-".repeat(40));

        char row = getChar("Masukkan baris : ");
        int col = getInt("Masukkan kolom : ");

        if (!cinema.bookTicket(sessionUser, studioNumber , row, col)) {
            System.out.println("Gagal memesan tiket");
            return;
        }

        System.out.println("Berhasil memesan tiket");
        System.out.printf("Saldo anda sekarang : Rp. %.02f\n", sessionUser.getBalance());
    }

    public void tampilkanTiket() {
        System.out.println("List Tiket yang sudah dipesan");
        sessionUser.displayAllTickets();
    }

    public void lihatStudio() {
        System.out.println("List Studio");
        cinema.displayListStudio();
    }

    public void lihatDetailStudio() {
        cinema.displayAvailableStudio();
        int studioNumber = getInt("Pilih Studio : ");

        cinema.displayStudioDetail(studioNumber);
    }

    public void topUpSaldo() {
        System.out.println("Top Up Saldo");

        double saldo = getInt("Masukkan saldo yang ingin ditopup : ");

        sessionUser.setBalance(saldo + sessionUser.getBalance());

        System.out.println("Top Up berhasil");
        System.out.printf("Saldo anda sekarang Rp %.02f\n", sessionUser.getBalance());
    }

    final static Scanner in = new Scanner(System.in);;
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.menu();
    }    

    public static String getString(String message) {
        System.out.print(message);
        String s = in.nextLine();

        return s;
    }

    public static int getInt(String message) {
        System.out.print(message);
        int s = in.nextInt(); in.nextLine();

        return s;
    }

    public static char getChar(String message) {
        System.out.print(message);
        char s = in.nextLine().charAt(0);

        return s;
    }
}

