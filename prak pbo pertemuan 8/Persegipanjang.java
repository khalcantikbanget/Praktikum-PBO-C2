/* File : Persegipanjang.java
 * Deskripsi : Implementasi persegi panjang sebagai bangundatar
 */

public class Persegipanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public Persegipanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungKeliling(){
        return 2 * (panjang + lebar);
    }

    public double hitungLuas(){
        return panjang * lebar;
    }
}



