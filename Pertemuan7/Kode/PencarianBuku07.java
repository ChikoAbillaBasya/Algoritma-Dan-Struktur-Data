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

    public int FindSeqSearch(String cari) {
        int posisi = 2;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari))  {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data      : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data      : " + x + " tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos) {
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

    public Buku07 FindBuku(String cari) {
        Buku07 buku = null;
        for (int j = 0; j < listBk.length; j++) {
            if  (listBk[j].kodeBuku.equals(cari)) {
                buku = listBk[j];
                break;
            }
        }
        return buku;
    }
    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if  (listBk[mid].kodeBuku.equals(cari)) {
                return mid;
            } else if ( (listBk[mid].kodeBuku).equals(cari) ) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    public int findJudulBukuSequential(String judulBuku) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equals(judulBuku)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    private void bubbleSortByJudulBuku() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 0; j < listBk.length - i - 1; j++) {
                if (listBk[j].judulBuku.compareTo(listBk[j + 1].judulBuku) > 0) {
                    Buku07 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }

    public int findJudulBinary(String judulBuku) {
        bubbleSortByJudulBuku(); 
        int left = 0;
        int right = listBk.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compareResult = listBk[mid].judulBuku.compareTo(judulBuku);
            if (compareResult == 0) {
                return mid;
            } else if (compareResult < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;    
    }
}