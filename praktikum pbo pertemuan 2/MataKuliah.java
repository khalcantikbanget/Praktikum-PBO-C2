/* Nama File    : MataKuliah.java
 * Nama Pembuat : Khalisa Nadya Hakim
 * NIM          : 24060123140149 */


public class MataKuliah {
    
    private String idMatkul;
    private String Nama;
    private int SKS;


    public MataKuliah(){
        idMatkul = " ";
        Nama = " ";
        SKS = 0;
    }

    public MataKuliah( String idMatkul, String Nama, int SKS){
        this.idMatkul = idMatkul;
        this.Nama = Nama;
        this.SKS = SKS;
    }

    public String getidMatkul(){
        return idMatkul;
    }

    public String getNama(){
        return Nama;
    }

    public int getSKS(){
        return SKS;
    }

    public void setidMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setSKs(int SKS){
        this.SKS = SKS;
    }
}

