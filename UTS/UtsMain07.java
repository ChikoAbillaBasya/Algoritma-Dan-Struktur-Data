package UTS;

public class UtsMain07 {
    public static void main(String[] args) {
        UtsNomor07 Nm = new UtsNomor07();
        Nm.listNmr = new int[] { 42, 4, 13, 35, 42, 7, 40, 39, 38, 15, 32, 23, 29, 20, 15, 18, 11 };

        System.out.println("Data Nomor Yang Tersedia : ");
        Nm.tampilData();
        System.out.println();
        
        int cari = 111;
        System.out.println("Data Sebelum Diurutkan : ");
        Nm.tampilData();
        int posisi = Nm.unordered(cari);
        if (posisi != -1) {
            System.out.println("Nomor " + cari + " Ditemukan Pada Indeks : " + posisi);
        } else {
            System.out.println("Nomor " + cari + " Tidak Ditemukan Dalam Data Nomor.");
        }

        System.out.println();
        Nm.selectionSortAscending();
        System.out.println("Data Setelah Diurutkan Secara Ascending : ");
        Nm.tampilData();
        Nm.selectionSortAscending();
        int posisiSetelahPengurutanAscending = Nm.FindBinarySearchAscending(cari, 0, Nm.listNmr.length - 1);
        if (posisiSetelahPengurutanAscending != -1) {
            System.out.println("Nomor " + cari + " Ditemukan Pada Indeks Ke-" + (posisiSetelahPengurutanAscending)
                    + " Setelah Pengurutan Ascending");
        } else {
            System.out.println("Nomor " + cari + " Tidak Ditemukan Pada Data Nomor");
            System.out.println();
        }

        System.out.println();
        Nm.selectionSortDescending();
        System.out.println("Data Setelah Diurutkan Secara Descending : ");
        Nm.tampilData();
        Nm.selectionSortDescending();
        int posisiSetelahPengurutanDescending = Nm.FindBinarySearchDescending(cari, 0, Nm.listNmr.length - 1);
        if (posisiSetelahPengurutanDescending != -1) {
            System.out.println("Nomor " + cari + " Ditemukan Pada Indeks Ke-" + (posisiSetelahPengurutanDescending)
                    + " Setelah Pengurutan Descending");
        } else {
            System.out.println("Nomor " + cari + " Tidak Ditemukan Pada Data Nomor");
        }
    }
}