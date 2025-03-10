/*  Nama File    : Asersi2.java
 *  Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 *  Nama Pembuat : Khalisa Nadya Hakim
 *  NIM          : 2406012314O149
 */


class  Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0): "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = "
            + kelilingLingkaran);
    }
}



// Jawaban dari pertanyaan
/*
Asersi tidak akan aktif jika dijalankan tanpa opsi -enableassertions.
Konstruktor Lingkaran tidak memiliki asersi, sehingga objek dengan jari-jari nol masih bisa dibuat.
Format asersi kurang tepat, karena tidak menggunakan tanda titik dua (:) untuk pesan kesalahan. */