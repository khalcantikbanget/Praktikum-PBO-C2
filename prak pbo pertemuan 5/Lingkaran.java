public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    public Lingkaran(){
        setJmlSisi(0);
    }

    public Lingkaran(double jari, String warna, String border){
        this.jari = jari;
        setWarna(warna);
        setBorder(border); 
        setJmlSisi(0);
    }


    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return 3.14 * jari * jari;
    }

    public double getKeliling() {
        return 2 * 3.14 * jari;
    }


    @Override
    public void printInfo(){
    System.out.println("Jumlah sisi: " + getJmlSisi());
    System.out.println("Warna: " + getWarna());
    System.out.println("Border: " + getBorder());
    System.out.println("Jari: " + jari);
}

    @Override
    public void zoomIn() {
    jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
    jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
    jari = jari* percent / 100;
    }
}

