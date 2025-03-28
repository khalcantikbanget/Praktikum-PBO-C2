/* Nama : Khalisa Nadya Hakim
 * NIM  : 24060123140149
 * File : Tendik.java
 */

public class Tendik extends Karyawan{
    private static int jumlahTendik = 0;

    public Tendik(String Nama, String Email, String NIP, int MasaKerja) {
        super(Nama, Email, NIP, MasaKerja);
        jumlahTendik++;
    }

    public double hitungGaji() {
        return 4000000 + (MasaKerja * 0.01 * 4000000);
    }

    public static int getJumlahTendik() {
        return jumlahTendik;
    }

    
    public void tampilkanInfo() {
        System.out.println("Tenaga Kependidikan (Tendik):");
        System.out.println("Nama: " + Nama);
        System.out.println("Email: " + Email);
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja: " + MasaKerja + " tahun");
        System.out.println("Gaji: Rp" + hitungGaji());
    }
}

