public class KoleksiAnabul {
    private Koleksi<Anabul> koleksi;
    
    public KoleksiAnabul(int ukuran) {
        koleksi = new Koleksi<>(ukuran);
    }
    
    public boolean tambahAnabul(Anabul anabul) {
        return koleksi.add(anabul);
    }
    
    public void showAll() {
        System.out.println("Koleksi Anabul:");
        for (int i = 0; i < koleksi.getSize(); i++) {
            Anabul anabul = koleksi.getIsi(i);
            System.out.println("[" + i + "] Nama: " + anabul.nama);
            anabul.bersuara();
            anabul.gerak();
            System.out.println();
        }
        System.out.println("Jumlah Anabul: " + koleksi.getSize());
    }
}