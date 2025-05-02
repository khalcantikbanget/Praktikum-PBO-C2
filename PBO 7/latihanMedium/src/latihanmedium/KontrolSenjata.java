package latihanmedium;

/**
 *
 * @author Khalisa Nadya
 */
public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumlahPeluru) {
        int total = senjata.getPeluru() + jumlahPeluru;
        senjata.setPeluru(total);
        System.out.println(">> Peluru berhasil ditambah: " + jumlahPeluru);
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");

        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Peluru Habis");
            }
        }

        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}
