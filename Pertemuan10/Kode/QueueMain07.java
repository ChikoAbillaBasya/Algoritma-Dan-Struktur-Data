package Pertemuan10.Kode;

import java.util.Scanner;

public class QueueMain07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan Kapasitas Queue : ");
        int n = sc.nextInt();
        Queue07 Q = new Queue07(n);
    
        int pilih = 0;
        do {
            Q.menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Data Baru : ");
                    int dataMasuk = sc.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar != 0) { 
                        System.out.println("Data Yang Dikeluarkan : " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}