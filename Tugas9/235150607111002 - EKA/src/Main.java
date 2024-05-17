public class Main {
    public static void main(String[] args) {
        Invoice[] invoices = {
            new Invoice("Buku", 2, 150),
            new Invoice("Pulpen", 10, 20)
        };

        PermanentEmployee permEmp = new PermanentEmployee(101, "Eka", 5000, invoices, 300);
        InternEmployee internEmp = new InternEmployee(102, "Dasya Taran", 2000, invoices, 6);

        // Memanggil metode untuk PermanentEmployee
        System.out.println(permEmp.getEmployeeDetails());
        System.out.println(permEmp.getPensionDetails());
        System.out.println("Bonus: " + permEmp.calculateBonus());

        // Memanggil metode untuk InternEmployee
        System.out.println(internEmp.getEmployeeDetails());
        System.out.println(internEmp.getInternDetails());
        System.out.println("Bonus: " + internEmp.calculateBonus());
        internEmp.attendTrainingSession();
        internEmp.trackContractDuration();

        // Metode statis
        Employee.companyPolicy();
    }
}
