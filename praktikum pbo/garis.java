public class garis {
    private titik awal;
    private titik akhir;
    private static int counterGaris = 0;

    garis() {
        this.awal = new titik(0, 0);
        this.akhir = new titik(1, 1);
        counterGaris++;
    }

    garis(titik awal, titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    titik getAwal(){
        return awal;
    }

    void setAwal(titik awal){
        this.awal = awal;
    }

    titik getAkhir(){
        return akhir;
    }
    
    void setAkhir(titik akhir){
        this.akhir = akhir;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    double getPanjang(){
        return Math.sqrt(Math.pow(akhir.getAbsis() - awal.getAbsis(), 2) + Math.pow(akhir.getOrdinat() - awal.getOrdinat(), 2));
    }

    double getGradien(){
        return (double) (akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis() - awal.getAbsis());
    }


    titik titikTengah() {
        return new titik((awal.getAbsis() + akhir.getAbsis()) / 2, (awal.getOrdinat() + akhir.getOrdinat()) / 2);
    }

    boolean isSejajar(garis g){
        return this.getGradien() == g.getGradien();
    }
    
    boolean istegakLurus(garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    void tampilkanTitik() {
        System.out.println("Titik awal: (" + awal.getAbsis() + ", " + awal.getOrdinat() + ")");
        System.out.println("Titik akhir: (" + akhir.getAbsis() + ", " + akhir.getOrdinat() + ")");
    }

    public String getPersamaan(){
        double m = getGradien();
        double c = awal.getOrdinat() - m * awal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}
