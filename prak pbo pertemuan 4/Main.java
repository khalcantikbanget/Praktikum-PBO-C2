import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        System.out.println("\n========================= Daftar Pegawai Universitas =========================\n");
        DosenTetap dosenTetap = new DosenTetap("954547548", "Mingyu", LocalDate.of(1997, 4, 6), LocalDate.of(2015, 1, 1), 50000000, "Fakultas Kedokteran", "78647324");
        DosenTamu dosenTamu = new DosenTamu("126473929", "Heri", LocalDate.of(1994, 2, 1), LocalDate.of(2020, 7, 23), 4000000, "Fakultas Hukum", "782754", LocalDate.of(2024, 12, 31));
        Tendik tendik = new Tendik("987654321", "Leklek", LocalDate.of(1997, 6, 30), LocalDate.of(2019, 7, 20), 3500000, "IT");

        System.out.println("Informasi Dosen Tetap:");
        dosenTetap.printInfo();
        System.out.println("\nInformasi Dosen Tamu:");
        dosenTamu.printInfo();
        System.out.println("\nInformasi Tendik:");
        tendik.printInfo();
    }
}