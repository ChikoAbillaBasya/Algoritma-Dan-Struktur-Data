public class Bukumain07 {
    public static void main(String[] args) {
        
        Buku07 bk1 = new Buku07();
        
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

            
        Buku07 bk2 = new Buku07("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku07 bkchiko = new Buku07("Artikel chiko", "chiko", 198, 60, 70000);
        bkchiko.terjual(11);
        bkchiko.tampilInformasi();

        int hargaTotal = bkchiko.hitungHargaTotal(11);
        System.out.println("Harga Total : " + hargaTotal);
      
        int diskon = (int) bkchiko.hitungDiskon(hargaTotal);
        System.out.println("Diskon : " + diskon);

        int hargaBayar = (int) bkchiko.hitungHargaBayar(hargaTotal);
        System.out.println("Harga Bayar : " + hargaBayar);
    }
}