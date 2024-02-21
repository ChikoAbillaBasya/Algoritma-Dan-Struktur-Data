
public class Buku07 {
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;

    Buku07(){
        
    }

    void tampilInformasi(){
        System.out.println("Judul : "+ judul);
        System.out.println("Pengarang : "+ pengarang);
        System.out.println("Jumlah Halaman : "+ halaman);
        System.out.println("Sisa Stok : "+ stok);
        System.out.println("Harga : Rp "+ harga);
    }
    void terjual(int jml){
        if (stok > 0 && stok>=jml) {
        stok -= jml;
        } else {
        System.out.println("Stok habis");
        }
    }
    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
    public Buku07(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}