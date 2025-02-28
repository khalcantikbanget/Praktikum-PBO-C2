/* Nama File    : Kendaraan.java
 * Nama Pembuat : Khalisa Nadya Hakim
 * NIM          : 24060123140149 */


public class Kendaraan {
    
    private String noPlat;
    private String Jenis;


    public Kendaraan(){
        this.noPlat = "";
        this.Jenis = "";
    }
     
    public Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    public String getnoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.Jenis;
    }

    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String Jenis){
        this.Jenis = Jenis;

    }
   
    public String toString() {
        return "(No Plat:" + noPlat + ", Jenis:" + Jenis + ")";
    }
}
