public abstract class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public int getPayableAmount() {
        int totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public int getSalaryAfterDeductions() {
        return getPayableAmount();
    }

    public String getEmployeeDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Karyawan: ").append(name)
                .append(", Nomor Registrasi: ").append(registrationNumber)
                .append(", Gaji per Bulan: ").append(salaryPerMonth)
                .append(", Gaji setelah Potongan: ").append(getSalaryAfterDeductions())
                .append("\nDaftar Belanja:\n");

        for (Invoice invoice : invoices) {
            details.append(invoice.getDetails()).append("\n");
        }

        return details.toString();
    }

    public static void companyPolicy() {
        System.out.println("Detail kebijakan perusahaan...");
    }

    protected abstract int calculateBonus();
}
