package Pertemuan8.Kode;

import java.util.Scanner;

public class Utama07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Gudang : ");
        int kapasitas = scanner.nextInt();
        Gudang07 gudang = new Gudang07(kapasitas);

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan");
            System.out.println("4. Lihat Barang Teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi : ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Barang     : ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Nama Barang     : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Kategori Barang : ");
                    String kategori = scanner.nextLine();
                    Barang07 barangBaru = new Barang07(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;

                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                    
                case 5:
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}