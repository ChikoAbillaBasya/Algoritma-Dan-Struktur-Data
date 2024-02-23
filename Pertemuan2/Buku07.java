public class Buku07 {
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;

    Buku07(){
        
    }

    public Buku07(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi(){
        System.out.println("Judul : "+ judul);
        System.out.println("Pengarang : "+ pengarang);
        System.out.println("Jumlah Halaman : "+ halaman);
        System.out.println("Sisa Stok : "+ stok);
        System.out.println("Harga : Rp "+ harga);
    }
    
    void terjual(int jml){
        if (stok > 0 && stok >= jml) {
            stok -= jml;
        } else {
            System.out.println("Jumlah buku yang di beli melebihi stok");
        }
    }
    
    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
    
    int hitungHargaTotal(int jml) {
        return harga * jml;
    }
    
    double hitungDiskon(int hargaTotal) {
        if (hargaTotal > 150000) {
            return 0.12 * hargaTotal;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return 0.05 * hargaTotal;
        } else {
            return 0;
        }
    }
    
    double hitungHargaBayar(int hargaTotal) {
        double diskon = hitungDiskon(hargaTotal);
        return hargaTotal - diskon;
    }
}