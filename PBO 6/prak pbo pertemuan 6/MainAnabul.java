public class MainAnabul {
    public static void main(String[] args) {
        Anabul[] daftarAnabul = {
            new Kucing("Miko"),
            new Anjing("Snowy"),
            new Burung("Ocong")
        };

        for (Anabul hewan : daftarAnabul) {
            hewan.gerak();
            hewan.bersuara();
            System.out.println();
        }
    }
}

