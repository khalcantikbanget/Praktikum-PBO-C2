
package com.mycompany.latihantutorial;

public class Senjata {
    private String bunyi;
    private boolean menusuk;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public String getBunyi() {
        return bunyi;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public void menembak(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.print(bunyi + " ");
        }
        System.out.println();
    }

    public void pasangBayonet() {
        this.menusuk = true;
        System.out.println("Bayonet Terpasang");
    }

    public String menusuk() {
        if (menusuk) {
            return "Jleb!";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
}
