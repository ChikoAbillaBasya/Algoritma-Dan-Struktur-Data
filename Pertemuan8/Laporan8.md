#
# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA 8 </p>

<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="33%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama  : Chiko Abilla Basya </p>
<p align = "center"> NIM   : 2341720005 </p>
<p align = "center"> Kelas : 1B </p>
<p align = "center"> Prodi : D-IV Teknik Informatika</p>


<br><br><br><br><br>

#
# 2.1 Percobaan 1: Penyimpanan Tumpukan Barang dalam Gudang
Kode Program Class
```java
package Pertemuan8.Kode;

public class Barang07 {

    int kode;
    String nama;
    String kategori;
    
    public Barang07(int kode, String nama, String kategori) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
    }
}
```
Kode Program Class
```java
package Pertemuan8.Kode;

public class Gudang07 {
    
    Barang07[] tumpukan;
    int size;
    int top;

    public Gudang07(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang07[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang07 brg) {
        if(!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang07 ambilBarang() {
        if(!cekKosong()) {
            Barang07 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang07 lihatBarangTeratas() {
        if(!cekKosong()) {
            Barang07 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        if(!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang :");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d : %s (Kategori %s)\n", + tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }
}
```
Kode Program Main
```java
package Pertemuan8.Kode;

import java.util.Scanner;

public class Utama07 {

    public static void main(String[] args) {

        Gudang07 gudang = new Gudang07(7);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan");
            System.out.println("4. Keluar");
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
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}
```
Output <br>
![alt text](<img/Screenshot Output Percobaan 1.png>)
# 2.1.3 Pertanyaan
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana saja yang perlu diperbaiki? <br>
Jawab :  perbaikan perlu dilakukan pada bagian methods tampilkanBarang, pada bagian perulangannya, yang awalnya menggunakan int i = 0; diganti menggunakan int i = top; agar menampilkan barang sesuai urutan stack nya.
```java
for(int i = top; i >= 0; i--)
```
2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode programnya! <br> 
Jawab : ada 7 data barang yang dapat ditampung dalam tumpukan.
```java
Gudang07 gudang = new Gudang07(7);
```
3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi tersebut dihapus, apa dampaknya? <br>
Jawab : Pengecekan kondisi !cekKosong() pada method tampilkanBarang diperlukan untuk memastikan bahwa tumpukan tidak kosong sebelum menampilkan rincian barang. Jika kondisi tersebut dihapus, maka program akan mencoba mengakses elemen tumpukan tanpa memeriksa apakah tumpukan kosong terlebih dahulu, yang dapat menyebabkan error seperti NullPointerException karena mencoba mengakses indeks yang tidak valid pada tumpukan kosong.
4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat barang teratas, serta dapat secara bebas menentukan kapasitas gudang! <br>
Jawab : <br>
menambahkan operasi lihat barang teratas
```java
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan");
            System.out.println("4. Lihat Barang Teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi : ");
            int pilihan = scanner.nextInt();
```
Dapat menentukan kapasitas barang
```java
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Gudang : ");
        int kapasitas = scanner.nextInt();
        Gudang07 gudang = new Gudang07(kapasitas);
```
#
# 2.2 Percobaan 2: Konversi Kode Barang ke Biner 
