package source.pertemuan4.studkas1;
public class Hero {
    public String nama;
    public int hp;
    public int atk;

    public Hero() {
        nama = "Yanto kun";
        hp = 100;
        atk = 50;
    }

    public Hero(String nama) {
        this.nama = nama;
        hp = 200;
        atk = 100;
    }

    public Hero(String nama, int hp, int atk) {
        this.nama = nama;
        this.hp = 200;
        this.atk = 100;
    }

    void printIsi() {
        System.out.println("Nama : " + this.nama);
        System.out.println("HP : " + this.hp);
        System.out.println("Atk : " + this.atk);
    }

    void menyerang(){
        System.out.println(nama + " Menyerang");
    }

    void menyerang(String musuh) {
        System.out.println(nama + " Menyerang " + musuh);
    }

    void menyerang(Hero musuh) {
        System.out.println(nama + " Menyerang " + this.nama + " dengan hp " + this.hp);
    }

    void menyerang(Dragon nagaGalak) {
        System.out.println(nama +  " menyerang naga berwarna " + nagaGalak.warna);
    }

    void menyerang(Hero musuh, int atkBonus) {
        System.out.println(nama + " menyerang " + musuh.nama + " sebesar " + (this.atk + atkBonus));
    }
}