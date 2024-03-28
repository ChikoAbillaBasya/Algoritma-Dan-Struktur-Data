package Pertemuan7.Kode;

import java.util.Scanner;

public class BukuMain07 {
    static Scanner s = new Scanner(System.in);
    static Scanner s1 = new Scanner(System.in);
    static PencarianBuku07 data = new PencarianBuku07();
    static int jumBuku = 5;

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");

        for (int i = 0; i < jumBuku; i++) {
            System.out.println("--------------------------------------------------------");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock     \t: ");
            int stock = s.nextInt();

            Buku07 m = new Buku07(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("========================");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("________________________________________");
        System.out.println("________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari : ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan Sequential Search  : ");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.tampilData(cari, posisi);

        Buku07 dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();

        System.out.println("========================================");
        System.out.println("Menggunakan Binary Search : ");
        posisi = data.FindBinarySearch(String.valueOf(cari), 0, jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}