package source.pertemuan10.studcase1;

public class Main {
    /*
     * Typecasting object hanya bisa dilakukan apabila sebuah 
     * instans/objek merupakan instanceof / is a dari class yang ingin kita casting
     */
    public static void main(String[] args) {
        Dosen buRetno = new Dosen("Bu Retno", 30, false);
        Mahasiswa aldo = new Mahasiswa("Aldo", 20, true);
        buRetno.getNIDN();

        // upcasting explisit
        Civitas buRetnoCivitas = (Civitas)buRetno;
        Civitas aldoCivitas = (Civitas)aldo;
        buRetnoCivitas.masukKelas();
        aldoCivitas.masukKelas();
        // buRetnoCivitas.getNIDN(); error

        // upcasting implisit
        Civitas dono = new Mahasiswa("Dono", 20, true);
        // dono.getNIM() // gabisa mengakses attribut/method yang ada pada class Mahasiswa
        // tapi dia akan menggunakan implementasi dari method yang dioverride pada class Mahasiswa
        dono.mainGameCorner(4);

        Mahasiswa devon = new Asprak("Devon", 20, true);
        Mahasiswa lutfi = new Mahasiswa("Lutfi", 21, true);

        // downcasting 
        // hanya bisa dilakukan apabila objek tersebut merupakan instanseof subclass tersebut
        Mahasiswa donoMahasiswa = (Mahasiswa)dono;
        donoMahasiswa.mainGameCorner(3);

        Asprak adit = new Asprak("Adit", 20, true);
        // Asprak ryo = new Mahasiswa("Ryo", 20, true); // error

        System.out.println("Aldo  Instanseof Civitas : " + (aldo instanceof Civitas));
        System.out.println("Devon Instanseof Asprak  : " + (devon instanceof Asprak));
        System.out.println("Lutfi Instanseof Asprak  : " + (lutfi instanceof Asprak));
        System.out.println("Adit  Instanseof Asprak  : " + (adit instanceof Asprak));
        System.out.println("Dono  Instanseof Mahasiswa  : " + (dono instanceof Mahasiswa));

        Asprak devonAsprak = (Asprak)devon;
        devonAsprak.setMataKuliah("PBO");
    }    
}
