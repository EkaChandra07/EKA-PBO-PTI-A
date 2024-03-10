public class MobilGabungan {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    
    public void setNoPlat(String s){
    noPlat = s;
    }
    public void setWarna(String s){
    warna = s;
    }
    public void setManufaktur(String s){
    manufaktur = s;
    }
    public void setKecepatan(int i){
    kecepatan = i;
    }
    public void displayMessage(){
    System.out.println("Mobil anda adalah bermerek"+manufaktur);
    System.out.println("mempunyai nomor plat "+noPlat);
    System.out.println("serta memililki warna "+warna);
    System.out.println("dan mampu menempuh kecepatan"+kecepatan);
    }
    public static void main(String[] args) {
    
    MobilGabungan m1 = new MobilGabungan();
    m1.setKecepatan(50);
    m1.setManufaktur("Toyota");
    m1.setNoPlat("AB 1231 UA");
    m1.setWarna("Merah");
    m1.displayMessage();
    System.out.println("================");
    
    MobilGabungan m2 = new MobilGabungan();
    m2.setKecepatan(100);
    m2.setManufaktur("Mitsubishi");
    m2.setNoPlat("N 1134 AG");
    m2.setWarna("Pink");
    m2.displayMessage();
    System.out.println("================");
    
    
    System.out.println("mobil pada objek m1 di rubah menjadi warnahijau");
    m1.setWarna("Hijau");
    
    m1.displayMessage();
    }
    public void setMerek(String merek1) {
        throw new UnsupportedOperationException("Unimplemented method 'setMerek'");
    }
    }
    