
package latihanveryeasy;


public class Senjata {
    private String bunyi;
    private int peluru;

    // Konstruktor
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0; // default jumlah peluru
    }

    // Method untuk menembak
    public void menembak() {
        if (peluru > 0) {
            System.out.println(bunyi);
            peluru--;
            System.out.println("Sisa Peluru: " + peluru);
        } else {
            System.out.println("Peluru habis!");
        }
    }

    // Getter dan Setter
    public String getBunyi() {
        return bunyi;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}
