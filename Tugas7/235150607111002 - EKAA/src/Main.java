import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kue[] kueArray = new Kue[25];

        // array Kue
        kueArray[0] = new KuePesanan("Brownies", 20000.0, 0.5);
        kueArray[1] = new KuePesanan("Cheesecake", 30000.0, 0.7);
        kueArray[2] = new KuePesanan("Kue Lapis", 25000.0, 0.6);
        kueArray[3] = new KuePesanan("Pancake", 15000.0, 0.4);
        kueArray[4] = new KueJadi("Donat", 10000.0, 12);
        kueArray[5] = new KueJadi("Kue Ketan", 15000.0, 10);
        kueArray[6] = new KueJadi("Yes King", 500000.0, 5);
        kueArray[7] = new KueJadi("Bolu", 20000.0, 8);
        kueArray[8] = new KuePesanan("Cubit Aduh", 5000.0, 0.3);
        kueArray[9] = new KuePesanan("Roll Cake", 18000.0, 0.5);
        kueArray[10] = new KuePesanan("Puding Soklat", 12000.0, 0.4);
        kueArray[11] = new KuePesanan("Tart", 25000.0, 0.6);
        kueArray[12] = new KueJadi("Croissant", 20000.0, 6);
        kueArray[13] = new KueJadi("Churros", 25000.0, 9);
        kueArray[14] = new KueJadi("Muffin", 15000.0, 15);
        kueArray[15] = new KueJadi("Lumpia", 40000.0, 4);
        kueArray[16] = new KuePesanan("Pie", 30000.0, 0.7);
        kueArray[17] = new KuePesanan("Macaron", 3000.0, 0.1);
        kueArray[18] = new KuePesanan("Scone", 8000.0, 0.2);
        kueArray[19] = new KuePesanan("Biscotti", 10000.0, 0.3);

        kueArray[20] = new KueBasi("Kue Basah", 15000.0, 2);
        kueArray[21] = new KueBasi("Kue Keju", 20000.0, 3);
        kueArray[22] = new KueBasi("Kue Soklat", 18000.0, 4);
        kueArray[23] = new KueBasi("Kue Strawberry", 22000.0, 5);
        kueArray[24] = new KueBasi("Kue Pandan", 17000.0, 6);


        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan semua kue");
            System.out.println("2. Hitung total harga semua kue");
            System.out.println("3. Hitung total harga dan total berat KuePesanan");
            System.out.println("4. Hitung total harga dan total jumlah KueJadi");
            System.out.println("5. Tampilkan informasi kue dengan harga terbesar");
            System.out.println("6. Hitung total harga dan total lama hari KueBasi");
            System.out.println("0. Keluar");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Daftar semua kue:");
                    for (Kue kue : kueArray) {
                        if (kue != null) {
                            System.out.println(kue.toString() + " - Jenis: " + kue.getClass().getSimpleName());
                        }
                    }
                    break;
                case 2:
                    double totalHargaSemua = 0;
                    for (Kue kue : kueArray) {
                        if (kue != null) {
                            totalHargaSemua += kue.hitungHarga();
                        }
                    }
                    System.out.println("Total harga semua kue: " + totalHargaSemua);
                    break;
                case 3:
                    double totalHargaPesanan = 0;
                    double totalBeratPesanan = 0;
                    for (Kue kue : kueArray) {
                        if (kue instanceof KuePesanan) {
                            totalHargaPesanan += kue.hitungHarga();
                            totalBeratPesanan += ((KuePesanan) kue).getBerat();
                        }
                    }
                    System.out.println("Total harga KuePesanan: " + totalHargaPesanan);
                    System.out.println("Total berat KuePesanan: " + totalBeratPesanan);
                    break;
                case 4:
                    double totalHargaJadi = 0;
                    double totalJumlahJadi = 0;
                    for (Kue kue : kueArray) {
                        if (kue instanceof KueJadi) {
                            totalHargaJadi += kue.hitungHarga();
                            totalJumlahJadi += ((KueJadi) kue).getJumlah();
                        }
                    }
                    System.out.println("Total harga KueJadi: " + totalHargaJadi);
                    System.out.println("Total jumlah KueJadi: " + totalJumlahJadi);
                    break;
                case 5:
                    double maxHarga = 0;
                    Kue kueMaxHarga = null;
                    for (Kue kue : kueArray) {
                        if (kue != null && kue.hitungHarga() > maxHarga) {
                            maxHarga = kue.hitungHarga();
                            kueMaxHarga = kue;
                        }
                    }
                    if (kueMaxHarga != null) {
                        System.out.println("Informasi kue dengan harga terbesar: " + kueMaxHarga.toString());
                    } else {
                        System.out.println("Tidak ada kue.");
                    }
                    break;
                case 6:
                    double totalHargaBasi = 0;
                    int totalLamaHariBasi = 0;
                    for (Kue kue : kueArray) {
                        if (kue instanceof KueBasi) {
                            totalHargaBasi += kue.hitungHarga();
                            totalLamaHariBasi += ((KueBasi) kue).getLamaHari();
                        }
                    }
                    System.out.println("Total harga KueBasi: " + totalHargaBasi);
                    System.out.println("Total lama hari KueBasi: " + totalLamaHariBasi);
                    break;
                case 7:
                    double totalHargaBasiCase = 0;
                    int totalLamaHariBasiCase = 0;
                    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
                    for (Kue kue : kueArray) {
                        if (kue instanceof KueBasi) {
                            totalHargaBasiCase += kue.hitungHarga();
                            totalLamaHariBasiCase += ((KueBasi) kue).getLamaHari();
                        }
                    }
                    System.out.println("Total harga KueBasi: " + currencyFormat.format(totalHargaBasiCase));
                    System.out.println("Total lama hari KueBasi: " + totalLamaHariBasiCase + " hari");
                    break;
                case 0:
                    System.out.println("Terima kasih Ganteng/Cantik!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
        
    }
}