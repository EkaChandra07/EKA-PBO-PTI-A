import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Objek Manusia
        System.out.println("Masukkan data untuk objek Manusia:");
        System.out.print("Nama: ");
        String namaManusia = scanner.nextLine();
        System.out.print("NIK: ");
        String nikManusia = scanner.nextLine();
        System.out.println("(true untuk laki-laki, false untuk perempuan)");
        System.out.print("Jenis Kelamin : ");
        boolean jenisKelaminManusia = scanner.nextBoolean();
        System.out.println("(true untuk sudah menikah, false untuk belum menikah)");
        System.out.print("Status Menikah : ");
        boolean menikahManusia = scanner.nextBoolean();
        Manusia manusia = new Manusia(namaManusia, nikManusia, jenisKelaminManusia, menikahManusia);
        System.out.println("Data Manusia:");
        System.out.println(manusia);

        //Objek MahasiswaFILKOM
        scanner.nextLine();
        System.out.println("\nMasukkan data untuk objek MahasiswaFILKOM:");
        System.out.print("NIM: ");
        String nimMahasiswa = scanner.nextLine();
        System.out.print("IPK: ");
        double ipkMahasiswa = scanner.nextDouble();
        MahasiswaFILKOM mahasiswa = new MahasiswaFILKOM(nimMahasiswa, ipkMahasiswa, namaManusia, nikManusia, jenisKelaminManusia, menikahManusia);
        System.out.println("Data Mahasiswa:");
        System.out.println(mahasiswa);

        //Objek Pekerja
        scanner.nextLine();
        System.out.println("\nMasukkan data untuk objek Pekerja:");
        System.out.print("Gaji: ");
        double gajiPekerja = scanner.nextDouble();
        System.out.print("Tahun Masuk: ");
        int tahunMasukPekerja = scanner.nextInt();
        System.out.print("Jumlah Anak: ");
        int jumlahAnakPekerja = scanner.nextInt();
        Pekerja pekerja = new Pekerja(gajiPekerja, tahunMasukPekerja, jumlahAnakPekerja, namaManusia, nikManusia, jenisKelaminManusia, menikahManusia);
        System.out.println("Data Pekerja:");
        System.out.println(pekerja);

        //Objek Manager
        scanner.nextLine();
        System.out.println("\nMasukkan data untuk objek Manager:");
        System.out.print("Departemen: ");
        String departemenManager = scanner.nextLine();
        Manager manager = new Manager(departemenManager, gajiPekerja, tahunMasukPekerja, jumlahAnakPekerja, namaManusia, nikManusia, jenisKelaminManusia, menikahManusia);
        System.out.println("Data Manager:");
        System.out.println(manager);

        scanner.close();
    }
}
