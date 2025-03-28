/* Nama : Khalisa Nadya Hakim
 * NIM  : 24060123140149
 * File : CivitasAkademika.java
 */

public abstract class CivitasAkademika {
    protected String Nama;
    protected String Email;

    public CivitasAkademika(String Nama, String Email) {
        this.Nama = Nama;
        this.Email = Email;
    }

    public String getNama(){
        return Nama;
    }

    public String getEmail(){
        return Email;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setEmail(String Email){
        this.Email = Email;
    }
}


