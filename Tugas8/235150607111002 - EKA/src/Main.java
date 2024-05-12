public class Main {
    public static void main(String[] args) {
        // Membuat objek PegawaiTetap
        PegawaiTetap pegawaiTetap1 = new PegawaiTetap("Eka Chandra Winata", "1234567890", 50000000);
        PegawaiTetap pegawaiTetap2 = new PegawaiTetap("Aliando Muarif", "0987654321", 6000000);
        PegawaiTetap pegawaiTetap3 = new PegawaiTetap("Slamet Dunia Akhirat", "1357924680", 5500000);

        // Membuat objek PegawaiHarian
        PegawaiHarian pegawaiHarian1 = new PegawaiHarian("Bob Marley", "9876543210", 10000, 35);
        PegawaiHarian pegawaiHarian2 = new PegawaiHarian("Eva Elvi Masamba", "2468013579", 12000, 45);
        PegawaiHarian pegawaiHarian3 = new PegawaiHarian("Icibos", "5432167890", 11000, 50);

        // Membuat objek Sales
        Sales sales1 = new Sales("Bocchi bin Arifin", "3210987654", 1000000, 0.05);
        Sales sales2 = new Sales("Tono Setark", "6789054321", 800000, 0.07);
        Sales sales3 = new Sales("Boku no Pico", "9876543210", 1200000, 0.06);

        // Menampilkan informasi pegawai
        System.out.println(pegawaiTetap1);
        System.out.println(pegawaiTetap2);
        System.out.println(pegawaiTetap3);

        System.out.println(pegawaiHarian1);
        System.out.println(pegawaiHarian2);
        System.out.println(pegawaiHarian3);

        System.out.println(sales1);
        System.out.println(sales2);
        System.out.println(sales3);
    }
}
