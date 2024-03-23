package source.pertemuan5.studkas1;

public class Negara {
    private String namaNegara;
    private String bahasaNasional;

    public String getBahasaNasional() {
        return bahasaNasional;
    }

    public void setBahasaNasional(String bahasaNasional) {
        this.bahasaNasional = bahasaNasional;
    }

    public Negara(String n, String b){
        this.namaNegara = n;
        this.bahasaNasional = b;
    }

    public void setNamaNegara(String n){
        this.namaNegara = n;
    }

    public String getNamaNegara(){
        return namaNegara;
    }
}
