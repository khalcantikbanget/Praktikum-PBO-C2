/**
 * File : BangunDatarGenericTest.java
 * Deskripsi : main class untuk generic bangun datar
 */
public class BangunDatarGenericTest {
    public static void main(String[] args) {

        Lingkaran lingkaran = new Lingkaran(7);
        BangunDatarGeneric<Lingkaran> bdgLingkaran = new BangunDatarGeneric<Lingkaran>();
        bdgLingkaran.set(lingkaran);
        System.out.println("Keliling lingkaran: " + bdgLingkaran.hitungKeliling());
        System.out.println("Luas lingkaran: " + bdgLingkaran.hitungLuas());
        System.out.println("Tipe generic: " + bdgLingkaran.get().getClass().getName());
   
        Persegi persegi = new Persegi(5);
        BangunDatarGeneric<Persegi> bdgPersegi = new BangunDatarGeneric<Persegi>();
        bdgPersegi.set(persegi);
        System.out.println("\nKeliling persegi: " + bdgPersegi.hitungKeliling());
        System.out.println("Luas persegi: " + bdgPersegi.hitungLuas());
        System.out.println("Tipe generic: " + bdgPersegi.get().getClass().getName());
        
     
        Persegipanjang persegiPanjang = new Persegipanjang(6, 4);
        BangunDatarGeneric<Persegipanjang> bdgPersegiPanjang = new BangunDatarGeneric<Persegipanjang>();
        bdgPersegiPanjang.set(persegiPanjang);
        System.out.println("\nKeliling persegi panjang: " + bdgPersegiPanjang.hitungKeliling());
        System.out.println("Luas persegi panjang: " + bdgPersegiPanjang.hitungLuas());
        System.out.println("Tipe generic: " + bdgPersegiPanjang.get().getClass().getName());

        Segitiga segitiga = new Segitiga(3, 4, 5);
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<Segitiga>();
        bdgSegitiga.set(segitiga);
        System.out.println("\nKeliling segitiga: " + bdgSegitiga.hitungKeliling());
        System.out.println("Luas segitiga " + bdgSegitiga.hitungLuas());
        System.out.println("Tipe generic: " + bdgSegitiga.get().getClass().getName());
    }
}