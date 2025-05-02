package latihanmedium;

/**
 *
 * @author Khalisa Nadya
 */
public class Senjata {
    private String bunyi;
    private int peluru;
    private boolean menusuk;
    private String tusuk;

    
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
        this.menusuk = false;
        this.tusuk = "Jleb";
    }

   
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

    public boolean isMenusuk() {
        return menusuk;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    public String getMenusuk() {
        return tusuk;
    }
}
