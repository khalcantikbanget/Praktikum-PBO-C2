public class Maingaris {
    public static void main(String[] args) {
        titik T1 = new titik(-2, 0);
        titik T2 = new titik(0, 4);
        
        garis G1 = new garis(T1, T2);
        G1.tampilkanTitik();
        System.out.println("Panjang garis: " + G1.getPanjang());
        System.out.println("Gradien garis: " + G1.getGradien());
        System.out.println("Titik tengah: (" + G1.titikTengah().getAbsis() + ", " + G1.titikTengah().getOrdinat() + ")");
        System.out.println("Persamaan garis: " + G1.getPersamaan());
        System.out.println("Total garis dibuat: " + garis.getCounterGaris());
    }
}    


