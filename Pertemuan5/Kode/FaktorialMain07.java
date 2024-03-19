package Pertemuan5.Kode;

import java.util.Scanner;

public class FaktorialMain07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("Masukkan jumlah elemen :");
        int ijml = sc.nextInt();

        Faktorial07[] fk = new Faktorial07[10];
        for(int i=0; i < ijml; i++) {
            fk[i] = new Faktorial07();
            System.out.println("Masukkan nilai data ke-" + (i+1) + " :");
            fk[i].nilai = sc.nextInt(); 
        }
        System.out.println("HASIL - BRUTE FORCE");
        for(int i=0; i < ijml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for(int i=0; i < ijml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}