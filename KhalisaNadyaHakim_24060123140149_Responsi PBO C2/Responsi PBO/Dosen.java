/* Nama : Khalisa Nadya Hakim
 * NIM  : 24060123140149
 * File : Dosen.java
 */


public class Dosen extends Karyawan {
    private static int jumlahDosen = 0;
    private Fakultas fakultas;

    public Dosen(String Nama, String Email, String NIP, int MasaKerja, Fakultas fakultas) {
        super(Nama, Email, NIP, MasaKerja);
        this.fakultas = fakultas;
        jumlahDosen++;
    }

    public static int getJumlahDosen() {
        return jumlahDosen;
    }

    public double hitungGaji() {
        double GajiPokok = fakultas.getGajiPokok();
        return GajiPokok + (MasaKerja * 0.01 * GajiPokok);
    }

    
    public void tampilkanInfo() {
        System.out.println("Dosen:");
        System.out.println("Nama: " + Nama);
        System.out.println("Email: " + Email);
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja: " + MasaKerja + " tahun");
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Gaji: Rp" + hitungGaji());
    }
}
