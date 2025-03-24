// Nama : Khalisa Nadya Hakim
// NIM  : 24060123140149
// File : Pengusaha.java

import java.util.Date;
 public class Pengusaha extends Manusia implements Pajak {
     private String npwp;
     private static int counterPengusaha;
     private static final int B = 4;
 
     public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
         super(nama, tgl_mulai_kerja, alamat, pendapatan);
         this.npwp = npwp;
         Pengusaha.counterPengusaha++;
     }
     
     public String getNpwp() {
         return npwp;
     }
 
     public void setNpwp(String npwp) {
         this.npwp = npwp; 
     }
 
     public static int getCounterPengusaha() {
         return counterPengusaha;
     }
     
     @Override
     public int hitungMasaKerja() {
         return new Date().getYear() - tgl_mulai_kerja.getYear() + B;
     }
     
     @Override
     public String hitungPajak() {
         return formatRupiah(0.15 * pendapatan);
     }
 }