public class InternEmployee extends Employee implements Contract {
    private int internshipDuration;

    public InternEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, int internshipDuration) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.internshipDuration = internshipDuration;
    }

    public String getInternDetails() {
        return "Durasi Magang: " + internshipDuration;
    }

    @Override
    protected int calculateBonus() {
        return 500;
    }

    @Override
    public void attendTrainingSession() {
        System.out.println("Menghadiri sesi pelatihan.");
    }

    @Override
    public void trackContractDuration() {
        System.out.println("Durasi magang: " + internshipDuration + " bulan.");
    }
}
