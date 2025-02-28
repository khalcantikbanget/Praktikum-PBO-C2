/* Nama File    : MainMahasiswa.java
 * Nama Pembuat : Khalisa Nadya Hakim
 * NIM          : 24060123140149 */


public class MainMahasiswa {
    
    public static void main(String[] args){
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("149", "Khal", "Informatika");
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("B1234ZUN", "Motor");
        M1.setdosenwali(D1);
        M1.setkendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah: " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah: " + M1.getJumlahSKS());
    }
}
