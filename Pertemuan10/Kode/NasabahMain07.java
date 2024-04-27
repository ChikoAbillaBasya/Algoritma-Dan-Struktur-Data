package Pertemuan10.Kode;

import java.util.Scanner;

public class NasabahMain07 {
    public static void main(String[] args) {
        Scanner sc07 = new Scanner(System.in);
        Scanner sc107 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc07.nextInt();

        QueueNasabah07 Q = new QueueNasabah07(jumlah);

        int pilih = 0;
        do {
            Q.menu();
            pilih = sc07.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No rekening : ");
                    String norek = sc107.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc107.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sc107.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc07.nextInt();
                    System.out.print("Saldo : ");
                    double saldo = sc07.nextDouble(); 
                    Nasabah07 nb = new Nasabah07(norek, nama, alamat, umur, saldo);
                    Q.Enqueue(nb);
                    break;
                case 2:
                    Nasabah07 data = Q.Dequeue();
                    if (data != null) {
                        System.out.println("Data yang dikeluarkan : " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.print();
                    break;
                case 5:
                    Q.PeekRear();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
