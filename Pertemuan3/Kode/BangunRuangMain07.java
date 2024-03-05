package Pertemuan3.Kode;
import java.util.Scanner;

public class BangunRuangMain07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Kerucut : ");
        int jumlahKerucut = sc.nextInt();
        Kerucut07[] kerucutArray = new Kerucut07[jumlahKerucut];

        System.out.print("Masukkan Jumlah Limas Segi Empat : ");
        int jumlahLimasSegiEmpat = sc.nextInt();
        LimasSegiEmpat07[] limasSegiEmpatArray = new LimasSegiEmpat07[jumlahLimasSegiEmpat];

        System.out.print("Masukkan Jumlah Bola : ");
        int jumlahBola = sc.nextInt();
        Bola07[] bolaArray = new Bola07[jumlahBola];

        for (int i = 0; i < jumlahKerucut; i++) {
            System.out.println();
            System.out.println("Atribut Kerucut Ke-" + (i + 1));
            System.out.print("Masukkan Jari-Jari : ");
            int jariJari = sc.nextInt();
            System.out.print("Masukkan Sisi Miring : ");
            int sisiMiring = sc.nextInt();
            kerucutArray[i] = new Kerucut07(jariJari, sisiMiring);
        }

        for (int i = 0; i < jumlahLimasSegiEmpat; i++) {
            System.out.println();
            System.out.println("Atribut Limas Segi Empat Ke-" + (i + 1));
            System.out.print("Masukkan Panjang Alas : ");
            int panjangSisiAlas = sc.nextInt();
            System.out.print("Masukkan Tinggi : ");
            int tinggi = sc.nextInt();
            limasSegiEmpatArray[i] = new LimasSegiEmpat07(panjangSisiAlas, tinggi);
        }

        for (int i = 0; i < jumlahBola; i++) {
            System.out.println();
            System.out.println("Atribut Bola Ke-" + (i + 1));
            System.out.print("Masukkan Jari-Jari : ");
            int jariJariBola = sc.nextInt();
            bolaArray[i] = new Bola07(jariJariBola);
        }

        System.out.println("\nHasil Perhitungan Kerucut :");
        for (int i = 0; i < jumlahKerucut; i++) {
            System.out.println("Kerucut Ke-" + (i + 1));
            System.out.printf("Luas Kerucut : %.2f\n", kerucutArray[i].hitungLuas());
            System.out.printf("Volume Kerucut : %.2f\n", kerucutArray[i].hitungVolume());
            System.out.println();
        }

        System.out.println("\nHasil Perhitungan Limas Segi Empat :");
        for (int i = 0; i < jumlahLimasSegiEmpat; i++) {
            System.out.println("Limas Segi Empat Ke-" + (i + 1));
            System.out.printf("Luas Limas Segi Empat : %.2f\n", limasSegiEmpatArray[i].hitungLuasPermukaan());
            System.out.printf("Volume Limas Segi Empat : %.2f\n", limasSegiEmpatArray[i].hitungVolume());
            System.out.println();
        }

        System.out.println("\nHasil Perhitungan Bola:");
        for (int i = 0; i < jumlahBola; i++) {
            System.out.println("Bola Ke-" + (i + 1));
            System.out.printf("Luas Bola : %.2f\n", bolaArray[i].hitungLuasPermukaan());
            System.out.printf("Volume Bola : %.2f\n", bolaArray[i].hitungVolume());
            System.out.println();
        }
    }
}