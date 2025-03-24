// Nama : Khalisa Nadya Hakim
// NIM  : 24060123140149
// File : PNS.java


import java.util.Date;
public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS;
    private static final int A = 9;

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        PNS.counterPNS++;
    }
    
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip; 
    }

    public static int getCounterPNS() {
        return counterPNS; 
    }
    
    @Override
    public int hitungMasaKerja() {
        return new Date().getYear() - tgl_mulai_kerja.getYear() + A;
    }
    
    @Override
    public String hitungPajak() {
        return formatRupiah(0.1 * pendapatan);
    }
}