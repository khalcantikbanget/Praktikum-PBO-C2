public class MainBangunDatar {
    public static void main (String[] args){
        Persegi persegi = new Persegi(40, "Ungu", "Biru");
        System.out.println("Persegi:");
        persegi.printInfo();
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());
        System.out.println("Diagonal: " + persegi.getDiagonal());
        System.out.println();

        Lingkaran lingkaran = new Lingkaran(1, "Biru", "Pink", 10);
        System.out.println("Lingkaran:");
        lingkaran.printInfo();
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());

    }
}
