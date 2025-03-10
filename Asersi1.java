/*  Nama File    : Asersi1.java
 *  Deskripsi    : Program untuk menunjukkan asersi
 *  Nama Pembuat : Khalisa Nadya Hakim
 *  NIM          : 2406012314O149
 */


public class Asersi1{
    public static void main(String[] args){
        int x=0;
        if(x>0){
            System.out.println("x bialngan positif");
        }
        else{
            assert(x<0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
         }
    }
}