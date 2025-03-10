/*  Nama File    : AngkaSialException.java
 *  Deskripsi    : Eksepsi untuk menolak angka 13
 *  Nama Pembuat : Khalisa Nadya Hakim
 *  NIM          : 2406012314O149
 */


public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial");
    }
}
