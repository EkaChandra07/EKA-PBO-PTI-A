package source.pertemuan9;

public abstract class Employee {
    private String nama;
    private String noKaryawan;
    private double indicatorPerformance;
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoKaryawan() {
        return noKaryawan;
    }

    public void setNoKaryawan(String noKaryawan) {
        this.noKaryawan = noKaryawan;
    }

    public double getIndicatorPerformance() {
        return indicatorPerformance;
    }

    public void setIndicatorPerformance(double indicatorPerformance) {
        this.indicatorPerformance = indicatorPerformance;
    }

    public Employee(String nama, String nk, double ip) {
        this.nama = nama;
        noKaryawan = nk;
        indicatorPerformance = 400.0;
    }

    public void meeting() {
        System.out.println( getNama() + " sedang meeting");
    }

    public void bertemuKlien() {
        System.out.println( getNama() + " sedang bertemu dengan klien");
    }

    public abstract void bekerja();

    @Override
    public String toString() {
        return "Nama : " + getNama();
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Employee)) {
            return false;
        }
        
        Employee e = (Employee) o;
        return nama.equals(e.getNama()) && 
        noKaryawan.equals(e.getNoKaryawan());
    }
}