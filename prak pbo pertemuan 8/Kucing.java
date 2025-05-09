public class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " berjalan dengan cara melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi Meong");
    }
}

