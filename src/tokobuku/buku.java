package tokobuku;


public class buku {
    String judul;
    String penulis;
    double harga;
    int stok;

    public buku(String judul, String penulis, double harga, int stok) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", Harga: " + harga + ", Stok: " + stok;
    }
    
}
