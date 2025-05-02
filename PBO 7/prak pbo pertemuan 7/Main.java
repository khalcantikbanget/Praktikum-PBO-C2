public class Main
{
    public static void main(String[] args) {
        Anjing a = new Anjing("Bruno");
        Datum<Anabul> x = new Datum<>();
        x.setIsi(a);
        x.getIsi().gerak();
        x.getIsi().bersuara();
        x.setIsi(new Burung("Ocong"));
        x.getIsi().gerak();
        x.getIsi().bersuara();
    }
}
