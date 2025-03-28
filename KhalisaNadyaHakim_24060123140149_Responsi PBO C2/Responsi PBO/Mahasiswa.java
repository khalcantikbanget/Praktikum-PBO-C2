/* Nama : Khalisa Nadya Hakim
 * NIM  : 24060123140149
 * File : Mahasiswa.java
 */


public class Mahasiswa extends CivitasAkademika{
    private static int jumlahMahasiswa = 0;
    private String NIM;
    private int Semester;
    private Fakultas fakultas;

    public Mahasiswa(String Nama, String Email, String NIM, int Semester, Fakultas fakultas) {
        super(Nama, Email);
        this.NIM = NIM;
        this.Semester = Semester;
        this.fakultas = fakultas;
        jumlahMahasiswa++;
    }

    public String getNIM(){
        return NIM;
    }
    
    public int getSemester(){
        return Semester;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    
    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public double hitungUKT() {
        return fakultas.getTarifUKT() * 0.05 * (Semester - 1);
    }

    
    public void tampilkanInfo() {
        System.out.println("Mahasiswa:");
        System.out.println("Nama: " + Nama);
        System.out.println("Email: " + Email);
        System.out.println("NIM: " + NIM);
        System.out.println("Semester: " + Semester);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Biaya UKT: Rp" + hitungUKT());
    }
}
