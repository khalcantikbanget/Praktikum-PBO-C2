/* Nama : Khalisa Nadya Hakim
 * NIM  : 24060123140149
 * File : Main.java
 */

public class Main {
    public static void main(String[] args) {
        Fakultas fakultas1 = new Fakultas("Sains dan Matematika", 5000000, 7000000);
        Mahasiswa mhs1 = new Mahasiswa("Mingyu", "Mingyu@ganteng.com", "12345", 3, fakultas1);
        Mahasiswa mhs2 = new Mahasiswa("Niall", "Niall@cakep.com", "67890", 7, fakultas1);
        Dosen dosen1 = new Dosen("Max", "Max@Verstappen.com", "MV33", 10, fakultas1);
        Tendik tendik1 = new Tendik("Carlos", "Carlos@Sainz.com", "CS55", 8);

        System.out.println("\n--- Informasi Civitas Akademika ---\n");
        mhs1.tampilkanInfo();
        System.out.println();
        mhs2.tampilkanInfo();
        System.out.println();
        dosen1.tampilkanInfo();
        System.out.println();
        tendik1.tampilkanInfo();

        System.out.println("\n--- Jumlah ---");
        System.out.println("Jumlah Mahasiswa: " + Mahasiswa.getJumlahMahasiswa());
        System.out.println("Jumlah Dosen: " + Dosen.getJumlahDosen());
        System.out.println("Jumlah Tendik: " + Tendik.getJumlahTendik());
    }

 }


