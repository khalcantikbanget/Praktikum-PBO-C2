
public class MainBangunDatar {
    public static void main(String[] args) {
        // Membuat objek Persegi
        BangunDatar P1 = new Persegi(10, "Hitam", "Putih");
        Persegi P2 = new Persegi(5, "Hitam", "Putih");
        BangunDatar L1 = new Lingkaran(28, "Merah", "Putih");
        Lingkaran L2 = new Lingkaran(28, "Biru", "Putih");
        System.out.println("=== Info Persegi 1 ===");
        P1.printInfo();
        System.out.println("\n=== Info Persegi 2 ===");
        P2.printInfo();

        // Membuat objek Lingkaran
        System.out.println("\n=== Info Lingkaran 1 ===");
        L1.printInfo();
        System.out.println("\n=== Info Lingkaran 2 ===");
        L2.printInfo();

        System.out.println("Sisi P1 sebelum zoomIn : " + ((Persegi)P1).getSisi());
        ((Persegi)P1).zoomIn();
        System.out.println("Sisi P1 setelah zoomIn : " + ((Persegi)P1).getSisi());

        System.out.println("Sisi P1 sebelum zoomOut : " + ((Persegi)P1).getSisi());
        ((Persegi)P1).zoomOut();
        System.out.println("Sisi P1 setelah zoomOut : " + ((Persegi)P1).getSisi());
    

    /* Menggunakan interface IResize memberikan fleksibilitas lebih besar, mendukung multiple inheritance, 
    dan membuat kode lebih modular serta dapat digunakan kembali oleh berbagai kelas yang tidak memiliki
    hubungan pewarisan langsung.  */
    }
}
