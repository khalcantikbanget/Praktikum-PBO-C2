public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>(10);
        
        System.out.println("Menambahkan karakter ke koleksi:");
        koleksiKarakter.add('K');
        koleksiKarakter.add('H');
        koleksiKarakter.add('A');
        koleksiKarakter.add('L');
        koleksiKarakter.add('C');
        koleksiKarakter.add('A');
        koleksiKarakter.add('N');
        koleksiKarakter.add('T');
        koleksiKarakter.add('I');
        koleksiKarakter.add('K');
        
        koleksiKarakter.showAll();
        
        System.out.println("\nMengubah karakter pada indeks 7 dari 'T' menjadi 'C':");
        koleksiKarakter.setIsi(7, 'C');
        koleksiKarakter.showAll();
        
        System.out.println("\nMenghapus karakter pada indeks 9 ('K'):");
        koleksiKarakter.delete(9);
        koleksiKarakter.showAll();
        
        int indeks = 3;
        System.out.println("\nKarakter pada indeks " + indeks + ": " + koleksiKarakter.getIsi(indeks));
        
        System.out.println("\nMencoba menambahkan karakter ke koleksi yang sudah penuh:");
        boolean berhasil = koleksiKarakter.add('S');
        if (berhasil) {
            System.out.println("Karakter 'S' berhasil ditambahkan");
        } else {
            System.out.println("Koleksi sudah penuh, tidak bisa menambahkan karakter 'S'");
        }
        
        System.out.println("\nMengubah ukuran koleksi menjadi 4:");
        koleksiKarakter.setSize(4);
        koleksiKarakter.showAll();
        
        System.out.println("\nMenambahkan karakter setelah mengubah ukuran:");
        koleksiKarakter.add('S');
        koleksiKarakter.showAll();
    }
}
