import java.util.Scanner;
import java.util.ArrayList;

class Buku {
    private String judul;
    private String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }
}

public class SmartBooksApp {
    private static final String[][] BUKU = {
        {"Pengantar Algoritma", "Thomas H. Cormen dkk.", "Teknologi"},
        {"Kode Bersih", "Robert C. Martin", "Teknologi"},
        {"Republik", "Plato", "Teknologi"},
        {"Sejarah Singkat Tentang Waktu", "Stephen Hawking", "Teknologi"},
        {"The God Delusion", "Richard Dawkins", "Teknologi"},
        {"Mindset: Psikologi Kesuksesan", "Carol S. Dweck", "Filsafat"},
        {"Man's Search for Meaning", "Viktor E. Frankl", "Filsafat"},
        {"The Prince", "Niccolò Machiavelli", "Filsafat"},
        {"1984", "George Orwell", "Filsafat"},
        {"To Kill a Mockingbird", "Harper Lee", "Filsafat"},
        {"Thinking, Fast and Slow", "Daniel Kahneman", "Sejarah"},
        {"Man's Search for Meaning", "Viktor E. Frankl", "Sejarah"},
        {"The Power of Habit", "Charles Duhigg", "Sejarah"},
        {"Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "Sejarah"},
        {"Influence: The Psychology of Persuasion", "Robert B. Cialdini", "Sejarah"},
        {"The Holy Bible", "Various Authors", "Agama"},
        {"The Quran", "Various Authors", "Agama"},
        {"Bhagavad Gita", "Various Authors", "Agama"},
        {"Tao Te Ching", "Lao Tzu", "Agama"},
        {"The Tibetan Book of Living and Dying", "Sogyal Rinpoche", "Agama"},
        {"To Kill a Mockingbird", "Harper Lee", "Psikologi"},
        {"1984", "George Orwell", "Psikologi"},
        {"The Great Gatsby", "F. Scott Fitzgerald", "Psikologi"},
        {"Pride and Prejudice", "Jane Austen", "Psikologi"},
        {"The Catcher in the Rye", "J.D. Salinger", "Psikologi"},
        {"The Prince", "Niccolò Machiavelli", "Politik"},
        {"Democracy in America", "Alexis de Tocqueville", "Politik"},
        {"The Communist Manifesto", "Karl Marx", "Politik"},
        {"The Federalist Papers", "Alexander Hamilton, James Madison, John Jay", "Politik"},
        {"The Road to Serfdom", "Friedrich Hayek", "Politik"},
        {"Ah Males Ah", "Komeng", "Fiksi"},
        {"Sepatu Eka", "Agus Kotak", "Fiksi"},
        {"Garniner men Foam", "Sagiri-Chann", "Fiksi"},
        {"Petak Umpet Sama Kadal", "Mas Pur", "Fiksi"},
        {"Aku Capek Ngoding", "Yang Tersakiti", "Fiksi"}
    };

    private static final String[] KATEGORI = {
        "Teknologi", "Filsafat", "Sejarah", "Agama", "Psikologi", "Politik", "Fiksi"
    };

    private static final String USERNAME_BENAR = "Eka Ganteng";
    private static final String PASSWORD_BENAR = "eko123";

    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Buku> unduhan = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Selamat datang di SmartBooks!");
        boolean loggedIn = false;
        while (!loggedIn) {
            System.out.print("Masukkan username Anda: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password Anda: ");
            String password = scanner.nextLine();
            loggedIn = login(username, password);
            if (!loggedIn) {
                System.out.println("Username atau password tidak valid. Silakan coba lagi.");
            }
        }
        System.out.println("Selamat datang, " + USERNAME_BENAR + "!");

        boolean lanjutBaca = true;
        while (lanjutBaca) {
            System.out.println("Pilih tindakan:");
            System.out.println("1. Telusuri Buku");
            System.out.println("2. Lihat Buku yang Sudah Diunduh");
            System.out.println("3. Baca Buku yang Sudah Diunduh");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihanMenu = Integer.parseInt(scanner.nextLine());
            switch (pilihanMenu) {
                case 1:
                    telusuriBuku();
                    break;
                case 2:
                    tampilkanUnduhan();
                    break;
                case 3:
                    bacaBuku();
                    break;
                case 4:
                    lanjutBaca = false;
                    System.out.println("Anda telah keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static boolean login(String username, String password) {
        return username.equals(USERNAME_BENAR) && password.equals(PASSWORD_BENAR);
    }

    private static void telusuriBuku() {
        System.out.println("Pilih kategori untuk menelusuri buku:");
        for (int i = 0; i < KATEGORI.length; i++) {
            System.out.println((i + 1) + ". " + KATEGORI[i]);
        }
        int pilihanKategori = Integer.parseInt(scanner.nextLine()) - 1;
        tampilkanBuku(pilihanKategori);
    }

    private static void tampilkanBuku(int pilihanKategori) {
        System.out.println("Buku yang tersedia di kategori " + KATEGORI[pilihanKategori] + ":");
        int count = 0;
        for (String[] buku : BUKU) {
            if (buku[2].equals(KATEGORI[pilihanKategori])) {
                count++;
                if (count <= 5) {
                    System.out.println(count + ". " + buku[0] + " oleh " + buku[1]);
                }
            }
        }

        if (count == 0) {
            System.out.println("Tidak ada buku yang tersedia di kategori ini.");
        } else {
            System.out.print("Pilih buku: ");
            int pilihanBuku = Integer.parseInt(scanner.nextLine()) - 1;
            int indexBukuTerpilih = -1;
            count = 0;
            for (int i = 0; i < BUKU.length; i++) {
                if (BUKU[i][2].equals(KATEGORI[pilihanKategori])) {
                    count++;
                    if (count == pilihanBuku + 1) {
                        indexBukuTerpilih = i;
                        break;
                    }
                }
            }

            if (indexBukuTerpilih != -1) {
                System.out.println("Anda sedang membaca: " + BUKU[indexBukuTerpilih][0]);
                System.out.println("Penulis: " + BUKU[indexBukuTerpilih][1]);
                System.out.print("Apakah Anda ingin mendownload buku ini? (ya/tidak): ");
                String pilihanDownload = scanner.nextLine().toLowerCase();
                if (pilihanDownload.equals("ya")) {
                    downloadBuku(new Buku(BUKU[indexBukuTerpilih][0], BUKU[indexBukuTerpilih][1]));
                }
            } else {
                System.out.println("Pilihan buku tidak valid.");
            }
        }
    }

    private static void tampilkanUnduhan() {
        if (unduhan.isEmpty()) {
            System.out.println("Tidak ada buku yang diunduh.");
        } else {
            System.out.println("Buku yang telah diunduh:");
            for (int i = 0; i < unduhan.size(); i++) {
                Buku buku = unduhan.get(i);
                System.out.println((i + 1) + ". " + buku.getJudul() + " oleh " + buku.getPenulis());
            }
        }
    }

    private static void downloadBuku(Buku buku) {
        unduhan.add(buku);
        System.out.println("Buku '" + buku.getJudul() + "' oleh " + buku.getPenulis() + " telah diunduh.");
    }

    private static void bacaBuku() {
        if (unduhan.isEmpty()) {
            System.out.println("Tidak ada buku yang diunduh.");
        } else {
            System.out.println("Pilih buku yang ingin Anda baca:");
            for (int i = 0; i < unduhan.size(); i++) {
                Buku buku = unduhan.get(i);
                System.out.println((i + 1) + ". " + buku.getJudul() + " oleh " + buku.getPenulis());
            }
            System.out.print("Pilihan Anda: ");
            int pilihanBuku = Integer.parseInt(scanner.nextLine()) - 1;
            if (pilihanBuku >= 0 && pilihanBuku < unduhan.size()) {
                Buku bukuYangDibaca = unduhan.get(pilihanBuku);
                System.out.println("Anda sedang membaca: " + bukuYangDibaca.getJudul());
                System.out.println("Penulis: " + bukuYangDibaca.getPenulis());
            } else {
                System.out.println("Pilihan buku tidak valid.");
            }
        }
    }
}
