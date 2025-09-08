package Pertemuan6.Kode;

public class HotelMain07 {
    public static void main(String[] args) {
        HotelService07 list = new HotelService07();
        Hotel07 h1 = new Hotel07("Hotel POP Denpasar", "Kota Bali", 280000, (byte) 2);
        Hotel07 h2 = new Hotel07("Hotel Mercure", "Kota Jakarta", 890000, (byte) 4);
        Hotel07 h3 = new Hotel07("Hotel D'Paragon Ijen Nirwana ", "Kota Malang", 180000, (byte) 1);
        Hotel07 h4 = new Hotel07("Hotel Grand Malioboro", "Kota Yogjakarta", 350000, (byte) 3);
        Hotel07 h5 = new Hotel07("Hotel DoubleTree by Hilton ", "Kota Surabaya", 1020000, (byte) 5);
        
        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Menampilkan hotel sebelum pengurutan :");
        list.tampilAll();

        System.out.println("Pengurutan harga termurah ke harga tertinggi :");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("Pengurutan bintang tertinggi (5) ke terendah (1) :");
        list.selectionSort();
        list.tampilAll();
    }
}