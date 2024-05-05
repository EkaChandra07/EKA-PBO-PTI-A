package source.pertemuan9;

public class Main {
    public static void main(String[] args) {
        
        Security s1 = new Security("Aldo", "22", 1);

        Manager m1 = new Manager("Aldo", "22", 1);

        System.out.println(s1.equals(m1));
    }
}