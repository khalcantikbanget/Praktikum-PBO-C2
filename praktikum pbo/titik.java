/* Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat   : Khalisa Nadya Hakim
 * Tanggal   : 19 Februari 2024
 */





public class titik {
    /*************ATRIBUT************/
    double absis;
    double ordinat;
    static int countertitik = 0;


    /*************METHOD*************/
    //konstruktor untuk membuat titik (0,0)
    titik() {
        absis = 0;
        ordinat = 0;
        countertitik++;
    }

    titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        countertitik++;
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return countertitik;
    }
    
    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai  ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengen nilai baru x
    void  setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing - masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat= ordinat + y;
    }

    //mencetak koordinat titik
    void printtitik(){
        System.out.println("Titik(" + absis + "," + ordinat + ")");
    }

    //getKuadran
    int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        if (absis < 0 && ordinat > 0) return 2;
        if (absis < 0 && ordinat < 0) return 3;
        if (absis > 0 && ordinat < 0) return 4;
        return 0;
    
    }
    
    double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat *ordinat);
    }

    double getJarak(titik t){
        double dx = this.absis - t.absis;
        double dy = this.ordinat - t.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    void refleksiY() {
        this.absis = -this.absis;
    }

    titik getRefleksiX(){
        return new titik(this.absis, -this.ordinat);
    }

    titik getRefleksiY(){
        return new titik(-this.absis, this.ordinat);
    }

    void tampilkan(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}

