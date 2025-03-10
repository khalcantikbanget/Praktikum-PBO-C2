/*  Nama File    : ExceptionOnArray.java
 *  Deskripsi    : Program penggunaan eksepsi menggunakan class library Java
 *  Nama Pembuat : Khalisa Nadya Hakim
 *  NIM          : 2406012314O149
 */


public class ExceptionOnArray {
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally{
            System.out.println("clean up code...");
        }
    }
}
