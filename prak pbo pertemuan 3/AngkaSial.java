/*  Nama File    : AngkaSial.java
 *  Deskripsi    : Program penggunaan exception pengenalan klausa 'throw' dan 'throws'
 *  Nama Pembuat : Khalisa Nadya Hakim
 *  NIM          : 2406012314O149
 */


public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+"bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka");
        }
    }
}



// Jawaban dari pertanyaan
/* Baris 12 tidak dieksekusi jika angka = 13, karena eksepsi terjadi sebelum mencapainya.
Baris 21 tidak dieksekusi, karena setelah eksepsi terjadi, program langsung melompat ke blok catch. */
