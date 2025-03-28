/* Nama : Khalisa Nadya Hakim
 * NIM  : 24060123140149
 * File : Fakultas.java
 */

public class Fakultas {
    
    private String Nama;
    private double tarifUKT;
    private double GajiPokok;

    public Fakultas (String Nama, double tarifUKT, double GajiPokok){
        this.Nama = Nama;
        this.tarifUKT = tarifUKT;
        this.GajiPokok = GajiPokok;
    }

    public String getNama(){
        return Nama;
    }

    public double getTarifUKT(){
        return tarifUKT;
    }

    public double getGajiPokok(){
        return GajiPokok;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setTarifUKT(double tarifUKT){
        this.tarifUKT = tarifUKT;
    }

    public void setGajiPokok(double GajiPokok){
        this.GajiPokok = GajiPokok;
    }
}
