import java.util.HashMap;
import java.util.Map;

/**
 * File: LambdaMap.java
 * Deskripsi: Menampilkan key dan value dari Map menggunakan ekspresi lambda
 */
public class LambdaMap {
    public static void main(String[] args) {
        // Membuat map dengan key = NIM dan value = Nama
        Map<String, String> mahasiswaMap = new HashMap<>();

        // Menambahkan data
        mahasiswaMap.put("12345", "Adi");
        mahasiswaMap.put("12346", "Bambang");
        mahasiswaMap.put("12347", "Cici");
        mahasiswaMap.put("12348", "Didi");

        // Menampilkan isi Map menggunakan lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
