package Pertemuan10.Kode;

import java.util.Scanner;

public class PembeliMain07 {
     public static void main(String[] args) {
        Scanner sc07 = new Scanner(System.in);
        Scanner sc107 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc07.nextInt();

        QueuePembeli07 Q = new QueuePembeli07(jumlah);

        int pilih = 0;

        do {
            Q.menu();
            pilih = sc07.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc107.nextLine();
                    System.out.print("No HP : ");
                    int noHP = sc07.nextInt();
                    Pembeli07 nb = new Pembeli07(nama, noHP);
                    Q.Enqueue(nb);
                    break;
                case 2:
                    Pembeli07 data = Q.Dequeue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.nama + " " + data.noHP);
                    }
                    break;
                case 3:
                    Q.Peek();
                    break;
                case 4:
                    Q.DaftarPembeli();
                    break;
                case 5:
                    Q.PeekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama pembeli yang ingin dicari : ");
                    String cariNama = sc107.nextLine();
                    Q.PeekPosition(cariNama);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}