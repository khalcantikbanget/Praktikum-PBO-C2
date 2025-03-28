public abstract class Karyawan extends CivitasAkademika{
    protected String NIP;
    protected int MasaKerja;

    public Karyawan(String Nama, String Email, String NIP, int MasaKerja) {
        super(Nama, Email);
        this.NIP = NIP;
        this.MasaKerja = MasaKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public int getMasaKerja() {
        return MasaKerja;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setMasaKerja(int MahasiswaasaKerja) {
        this.MasaKerja = MasaKerja;
    }

    public abstract double hitungGaji();
}
