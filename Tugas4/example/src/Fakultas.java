import java.util.ArrayList;

public class Fakultas {
    public ArrayList<Dosen> dataDosen;
    public ArrayList<Mahasiswa> dataMahasiswa;
    public static final String FILE_PATH = "data.txt";

    public Fakultas() {
        dataDosen = new ArrayList<>();
        dataMahasiswa = new ArrayList<>();
    }

    public void readFile() {}

    public void writeFile() {}
    
}
