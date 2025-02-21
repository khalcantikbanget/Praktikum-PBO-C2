
public class Main {
    public static void main(String[] args) {
         titik T1 = new titik();
         T1.setAbsis(3);
         T1.setOrdinat(4);
         T1.printtitik();
         T1.geser(2,4);
         T1.printtitik();
        
         titik T2 = T1;
         T2.printtitik();
         T1.setAbsis(10);
         T1.setOrdinat(10);
         T2.printtitik();

         titik T3 = new titik();
         titik T4 = new titik(3,5);

         System.out.println("Jumlah Objek Titik = " + titik.getCounterTitik());
         System.out.println("Jumlah Objek Titik = " + T4.getCounterTitik());

         System.out.println("Kuadran T1: " + T1.getKuadran());
         System.out.println("Jarak T1 ke pusat: " + T1.getJarakPusat());
         System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));

         System.out.println("Refleksi T1 terhadap sumbu x:");
         titik refleksiX = T1.getRefleksiX();
         refleksiX.tampilkan();

         System.out.println("Refleksi T1 terhadap sumbu Y:");
         titik refleksiY = T1.getRefleksiY();
         refleksiY.tampilkan();

         

    }
    
}

      