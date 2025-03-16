public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(double sisi, String warna, String border, float jari) {
        super(1, warna, border);
        this.jari = jari;
        
    }

    public double getJari() {
        return jari;
    }

    public void setJari(float jari) {
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

}

