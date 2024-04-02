package Pertemuan7.Kode;

import java.util.Scanner;

public class BukuMain07 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);
    PencarianBuku07 data = new PencarianBuku07();
    int jumBuku = 5;

        System.out.println("--------------------------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");

        for (int i = 0; i < jumBuku; i++) {
            System.out.println("--------------------------------------------------------");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = s1.nextLine();
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
        System.out.println("1. Pencarian berdasarkan Kode Buku");
        System.out.println("2. Pencarian berdasarkan Judul Buku");
        System.out.print("Pilihan: ");
        int pilihan = s.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Masukan Kode Buku yang dicari : ");
                System.out.print("Kode Buku : ");
                String cariKode = s1.next();
                System.out.println("Menggunakan Sequential Search");
                int posisiKode = data.FindSeqSearch(cariKode);
                data.tampilPosisi(cariKode, posisiKode);
                data.tampilData(cariKode, posisiKode);
                System.out.println("==========================================");
                System.out.println("Menggunakan Binary Search");
                posisiKode = data.FindBinarySearch(cariKode, 0, jumBuku - 1);
                data.tampilPosisi(cariKode, posisiKode);
                data.tampilData(cariKode, posisiKode);
                
                break;
            case 2:
                System.out.println("Masukan Judul Buku yang dicari : ");
                System.out.print("Judul Buku : ");
                String cariJudul = s1.next();
                System.out.println("Menggunakan Sequential Search");
                int posisiJudulBukuSequential = data.findJudulBukuSequential(cariJudul);
                data.tampilPosisi(cariJudul, posisiJudulBukuSequential);
                data.tampilData(cariJudul, posisiJudulBukuSequential);
                int jumlahJudulSequential = 0;
                for (Buku07 buku : data.listBk) {
                    if (buku != null && buku.judulBuku.equals(cariJudul)) {
                        jumlahJudulSequential++;
                    }
                }
                if (jumlahJudulSequential > 1) {
                    System.out.println("Peringatan: Terdapat lebih dari satu hasil dengan judul buku '" + cariJudul + "'!");
                }
                System.out.println("---------------------------------------");
                System.out.println("Menggunakan Binary Search");
                int posisiJudulBinary = data.findJudulBinary(cariJudul);
                data.tampilPosisi(cariJudul, posisiJudulBinary);
                data.tampilData(cariJudul, posisiJudulBinary);
                int jumlahJudulBinary = 0;
                for (Buku07 buku : data.listBk) {
                    if (buku != null && buku.judulBuku.equals(cariJudul)) {
                        jumlahJudulBinary++;
                    }
                }
                if (jumlahJudulBinary > 1) {
                    System.out.println("Peringatan: Terdapat lebih dari satu hasil dengan judul buku '" + cariJudul + "'!");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}