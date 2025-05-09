public class MainAnabul {
   public static void main(String[] args) {
       System.out.println("Demonstrasi masing-masing tipe Anabul:");
       Kucing kucing = new Kucing("Junpii");
       kucing.bersuara();
       kucing.gerak();
       
       System.out.println();
       
       Anjing anjing = new Anjing("Latte");
       anjing.bersuara();
       anjing.gerak();
       
       System.out.println();
       
       Burung burung = new Burung("Ocong");
       burung.bersuara();
       burung.gerak();
       
       System.out.println("\n-------------------------------\n");
       
       System.out.println("Membuat koleksi 10 Anabul secara acak:");
       KoleksiAnabul koleksiAnabul = new KoleksiAnabul(10);
       
       String[] namaKucing = {"Miko", "Cika", "Bambi", "Nonu"};
       String[] namaAnjing = {"Ming", "Max", "Simba", "Leo"};
       String[] namaBurung = {"Pika", "Ucup", "Jimbo", "Rimba"};
       
       for (int i = 0; i < 10; i++) {
           int jenis = (int)(Math.random() * 3);
           
           switch (jenis) {
               case 0:
                   String namaK = namaKucing[(int)(Math.random() * namaKucing.length)];
                   koleksiAnabul.tambahAnabul(new Kucing(namaK + "-" + i));
                   break;
               case 1:
                   String namaA = namaAnjing[(int)(Math.random() * namaAnjing.length)];
                   koleksiAnabul.tambahAnabul(new Anjing(namaA + "-" + i));
                   break;
               case 2:
                   String namaB = namaBurung[(int)(Math.random() * namaBurung.length)];
                   koleksiAnabul.tambahAnabul(new Burung(namaB + "-" + i));
                   break;
           }
       }
       
       koleksiAnabul.showAll();
   }
}
