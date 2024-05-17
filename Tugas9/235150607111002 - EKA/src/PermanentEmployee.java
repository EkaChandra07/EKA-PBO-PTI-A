public class PermanentEmployee extends Employee {
    private int pensionContribution;

    public PermanentEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, int pensionContribution) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.pensionContribution = pensionContribution;
    }

    public String getPensionDetails() {
        return "Kontribusi Pensiun: " + pensionContribution;
    }

    @Override
    protected int calculateBonus() {
        return (int) (getSalaryAfterDeductions() * 0.1);
    }
}
