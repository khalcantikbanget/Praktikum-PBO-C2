/* Nama File    : Mahasiswa.java
 * Nama Pembuat : Khalisa Nadya Hakim
 * NIM          : 24060123140149 */


import java.util.ArrayList;

public class Mahasiswa {

    private String NIM;
    private String Nama;
    private String Prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenwali;
    private Kendaraan kendaraan;

    public Mahasiswa(){
        this.NIM = "";
        this.Nama = "";
        this.Prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenwali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public Mahasiswa(String NIM, String Nama, String Prodi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenwali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public String getNIM(){
        return this.NIM;
    }

    public String getNama(){
        return this.Nama;
    }

    public String getProdi(){
        return this.Prodi;
    }

    public Dosen getdosenwali(){
        return this.dosenwali;
    }

    public Kendaraan getkendaraan(){
        return this.kendaraan;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

    public void setdosenwali(Dosen dosenwali){
        this.dosenwali = dosenwali;
    }

    public void setkendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    public void addMatkul (MataKuliah newMatkul){
        listMatkul.add(newMatkul);
    }

    public int getJumlahSKS(){
        int totalSKS = 0;
        for (int i = 0; i < listMatkul.size();i++){
            totalSKS = totalSKS + listMatkul.get(i).getSKS();
        }
        return totalSKS;
    }

    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    public void printMhs(){
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Prodi: " + Prodi);
    }

    public void printDetailMhs(){
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Prodi: " + Prodi);
        System.out.println("Dosen wali: " + dosenwali);
        System.out.println("Kendaraan: " + kendaraan); 

        int i;
        for(i=0;i<listMatkul.size();i++){
            System.out.println(listMatkul.get(i).getNama());
        }
    }
   
}
