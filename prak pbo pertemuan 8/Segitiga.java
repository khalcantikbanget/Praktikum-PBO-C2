/* File : Segitiga.java
 * Deskripsi : Implementasi segitiga sebagai bangun datar
 */

public class Segitiga extends BangunDatar {
        private double alas;
        private double tinggi;
        private double sisi1;
        private double sisi2;
        private double sisi3;
        
        
        public Segitiga(double sisi1, double sisi2, double sisi3) {
            this.sisi1 = sisi1;
            this.sisi2 = sisi2;
            this.sisi3 = sisi3;
            
            
            this.alas = Math.max(Math.max(sisi1, sisi2), sisi3);
            
          
        }
        
        
        public Segitiga(double alas, double tinggi) {
            this.alas = alas;
            this.tinggi = tinggi;
            
            
            double sisiMiring = Math.sqrt(alas*alas + tinggi*tinggi);
            this.sisi1 = alas;
            this.sisi2 = tinggi;
            this.sisi3 = sisiMiring;
        }
        
        public double hitungKeliling() {
            return sisi1 + sisi2 + sisi3;
        }
        
        public double hitungLuas() {
            if (tinggi > 0) {
                return 0.5 * alas * tinggi;
            }
            
            double s = (sisi1 + sisi2 + sisi3) / 2;
            return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }
}
    
