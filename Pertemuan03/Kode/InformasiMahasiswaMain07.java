package Pertemuan3.Kode;
import java.util.Scanner;

public class InformasiMahasiswaMain07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        InformasiMahasiswa07[] mahasiswa = new InformasiMahasiswa07[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan nim : ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin : ");
            String jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mahasiswa[i] = new InformasiMahasiswa07(nama, nim, jenisKelamin, ipk);
        }
        
        double rataIPK = InformasiMahasiswa07.hitungRataIPK(mahasiswa);

        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama : " + mahasiswa[i].nama);
            System.out.println("NIM : " + mahasiswa[i].nim);
            System.out.println("Jenis Kelamin : " + mahasiswa[i].jenisKelamin);
            System.out.println("IPK : " + mahasiswa[i].ipk);
        }
        
        System.out.println();
        System.out.printf("Rata-rata IPK : " + "%.2f", rataIPK);

        InformasiMahasiswa07 terbaik = InformasiMahasiswa07.mahasiswaTerbaik(mahasiswa);

        System.out.println();
        System.out.println("Mahasiswa dengan IPK terbesar :");
        System.out.println("Nama : " + terbaik.nama);
        System.out.println("NIM : " + terbaik.nim);
        System.out.println("Jenis Kelamin : " + terbaik.jenisKelamin);
        System.out.println("IPK : " + terbaik.ipk);
    }
}  