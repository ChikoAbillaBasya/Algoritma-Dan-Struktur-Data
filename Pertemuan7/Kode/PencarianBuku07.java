package Pertemuan7.Kode;

public class PencarianBuku07 {
    Buku07 listBk[] = new Buku07[5];
    int idx;
    
    void tambah(Buku07 bk) {
        if (idx < listBk.length) {
            listBk[idx] = bk;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Buku07 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(String.valueOf(cari))) { // Compare with String value
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data      : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data      : " + x + " tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku   \t: " + x);
            System.out.println("Judul Buku  \t: " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang   \t: " + listBk[pos].pengarang);
            System.out.println("Stock       \t: " + listBk[pos].stock);
        } else {
            System.out.println("data      : " + x + " tidak ditemukan");
        }
    }

    public Buku07 FindBuku(int cari) {
        for (int j = 0; j < listBk.length; j++){
            if (listBk[j].kodeBuku.equals(String.valueOf(cari))){ // Compare with String value
                return listBk[j];
            }
        }    
        return null;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            int compareResult = listBk[mid].kodeBuku.compareTo(cari);
            if (compareResult == 0) {
                return mid;
            } else if (compareResult > 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        } 
        return -1;
    }
}
