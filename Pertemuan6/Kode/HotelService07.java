package Pertemuan6.Kode;

public class HotelService07 {
    Hotel07 rooms[] = new Hotel07[5];
    int idx = 0;

    void tambah(Hotel07 H) {
        if (idx < rooms.length) {
            rooms[idx] = H;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll() {
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Nama    = " + rooms[i].nama);
            System.out.println("Kota    = " + rooms[i].kota);
            System.out.println("Harga   = " + rooms[i].harga);
            System.out.println("Bintang = " + rooms[i].bintang);
            System.out.println("----------------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga < rooms[j - 1].harga) {
                    Hotel07 tmp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < rooms.length; i++) {
            int idMax = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idMax].bintang) {
                    idMax = j;
                }
            }
            Hotel07 tmp = rooms[idMax];
            rooms[idMax] = rooms[i];
            rooms[i] = tmp;
        }
    }
}