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
            scanner.nextLine();

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
Menambahkan operasi lihat barang teratas
```java
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan");
            System.out.println("4. Tampilkan Barang Teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
```
Dapat menentukan kapasitas barang
```java
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Gudang : ");
        int kapasitas = scanner.nextInt();
        Gudang07 gudang = new Gudang07(kapasitas);
```
Output <br>
![alt text](<img/Screenshot Output Pertanyaan Nomer 4.png>) <br>
5. Commit dan push kode program ke Github
#
# 2.2 Percobaan 2: Konversi Kode Barang ke Biner 
Kode Program Class
```java
package Pertemuan8.Kode;

import java.util.Stack;

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
            System.out.println("Kode unik dalam Biner : " + Integer.toBinaryString(delete.kode));
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

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi07 stack = new StackKonversi07();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.tambah(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.cekKosong()) {
            biner += stack.ambil();
        }
        return biner;
    }
}
```
```java
package Pertemuan8.Kode;

public class StackKonversi07 {
    
    int size;
    int[] tumpukanBiner;
    int top;

    public StackKonversi07() {
        this.size = 32; 
        this.tumpukanBiner = new int[size];
        this.top = -1;
    }

    public boolean cekKosong() {
        return top == -1 ; 
    }

    public boolean cekPenuh() {
        return top == size - 1;
    }

    public void tambah(int data) {
        if(cekPenuh()) {
            System.out.println("Stack Penuh");
    } else {
        top++;
        tumpukanBiner[top] = data;
        }
    }   

    public int ambil() {
        if(cekKosong()) {
            System.out.println("Stack Kosong");
            return -1;
    } else {
        int data = tumpukanBiner[top];
        top--;
        return data;
        }
    }
}
```
Output <br>
![alt text](<img/Screenshot Output Percobaan 2.png>)
# 2.2.3 Pertanyaan
1. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), 
bagaimana hasilnya? Jelaskan alasannya! <br>
Jawab : mengubah kondisi perulangan dari while (kode > 0) menjadi while (kode != 0), hasilnya akan tetap sama.  karena bagian kode while(kode>0) ataupun while(kode!= 0) berguna untuk memastikan bahwa proses konversi tetap belanjut ketika masih ada angka desimal yang belum dikonversi.
```java
public String konversiDesimalKeBiner(int kode) {
        StackKonversi07 stack = new StackKonversi07();
        while (kode != 0) { 
            int sisa = kode % 2;
            stack.tambah(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.cekKosong()) {
            biner += stack.ambil();
        }
        return biner;
    }
```
2. Jelaskan alur kerja dari method konversiDesimalKeBiner! <br>
Jawab : Method KonversiDesimalKeBiner dimulai dengan menerima bilangan bulat (desimal) sebagai parameter dan mengembalikan hasil konversinya dalam bentuk string yang merepresentasikan bilangan tersebut dalam sistem biner. Sebuah stack dideklarasikan untuk menyimpan sisa pembagian bilangan desimal selama proses konversi. Program melakukan pembagian berturut-turut dari bilangan desimal dengan 2, dengan menyimpan sisa pembagian sebagai digit biner dalam stack. Setelah itu, digit-diginya dikeluarkan dari stack dan disusun dalam bentuk string biner. Hasil konversi tersebut dikembalikan sebagai hasil dari method. 
#
# 2.3 Percobaan 3: Konversi Notasi Infix ke Postfix
Kode Program Class
```java
package Pertemuan8.Kode;

public class Postfix07 {
    int n, top;
    char[] stack;

    public Postfix07(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push(char data) {
        top++;
        stack[top] = data;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean IsOperand(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.') {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsOperator(char c) {
        if (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }

    public int derajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '+':
                return 1;
            case '-':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi(String Q) {
        String P = "";
        char c;
        for (int i = 0; i < Q.length(); i++) {
            c = Q.charAt(i);
            if (IsOperand(c)) {
                P = P + c;
            }
            if (c == '(') {
                push(c);
            }
            if (c == ')') {
                while (stack[top] != '(') {
                    P = P + pop();
                }
                pop();
            }
            if (IsOperator(c)) {
                while (derajat(stack[top]) >= derajat(c)) {
                    P = P + pop();
                }
                push(c);
            }
        }
        return P;
    }
}
```
Kode Program Main
```java
package Pertemuan8.Kode;

import java.util.Scanner;

public class PostfixMain07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;

        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix07 post = new Postfix07(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
```
Output <br>
![alt text](<img/Screenshot Output Percobaan 3.png>)
# 2.3.3 Pertanyaan
1. Pada method derajat, mengapa return value beberapa case bernilai sama? Apabila return value diubah dengan nilai berbeda-beda setiap case-nya, apa yang terjadi? <br>
Jawab : Pada method derajat, return value beberapa case bernilai sama karena pada setiap case-nya, hanya dilakukan pencetakan string. Jika return value diubah dengan nilai berbeda-beda setiap case-nya, maka nilai yang diubah tersebut akan menjadi hasil yang dimunculkan jika kondisi case tersebut terpenuhi.
2. Jelaskan alur kerja method konversi! <br>
Jawab : Method konversi menerima sebuah string sebagai input dan mengonversi string tersebut ke bentuk lain sesuai dengan aturan yang telah ditentukan dalam method. Pada setiap iterasi, method tersebut melakukan pengecekan terhadap karakter yang ada pada string input, dan berdasarkan karakter tersebut melakukan operasi tertentu seperti menambahkan ke string P, memasukkan ke dalam stack, dan lainnya. Setelah semua karakter pada string input diproses, method akan mengembalikan hasil konversi yang telah dilakukan.
3. Pada method konversi, apa fungsi dari potongan kode berikut?
```java
 c = Q.charAt(i);
```
Jawab : digunakan untuk mengambil karakter pada posisi indeks i dari string Q, yang merupakan ekspresi infix yang akan dikonversi menjadi postfix
#
# 2.4 Latihan Praktikum
Perhatikan dan gunakan kembali kode program pada Percobaan 1. Tambahkan dua method berikut pada class Gudang : <br>
• Method lihatBarangTerbawah digunakan untuk mengecek barang pada tumpukan terbawah <br>
• Method cariBarang digunakan untuk mencari ada atau tidaknya barang berdasarkan kode barangnya atau nama barangnya <br>
Jawab : <br>
Kode Program Class
```java
package Pertemuan8.Kode;

import java.util.Stack;

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
            System.out.println("Kode unik dalam Biner : " + Integer.toBinaryString(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang07 TampilkanBarangTeratas() {
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

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi07 stack = new StackKonversi07();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.tambah(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.cekKosong()) {
            biner += stack.ambil();
        }
        return biner;
    }

    public Barang07 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang07 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang07 lihatBarangTerbawah(){
        if (!cekKosong()) {
            Barang07 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang07 cariBarangKode(int kodeBarang) {
        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].kode == kodeBarang) {
                return tumpukan[i];
            }
        }
        return null;
    }

    public Barang07 cariBarangNama(String namaBarang) {
        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].nama.equals(namaBarang)) {
                return tumpukan[i];
            }
        }
        return null;
    }
}
```
```java
package Pertemuan8.Kode;

import java.util.Scanner;

public class Utama07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Gudang : ");
        int kapasitas = scanner.nextInt();
        Gudang07 gudang = new Gudang07(kapasitas);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Tampilkan Barang Teratas");
            System.out.println("5. Tampilkan Barang Terbawah");
            System.out.println("6. Cari Barang Bardasarkan Kode Barang");
            System.out.println("7. Cari Barang Bardasarkan Nama Barang");
            System.out.println("8. Keluar");
            System.out.print("Pilih Operasi : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

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
                    gudang.lihatBarangTerbawah();
                    break;

                case 6:
                    System.out.print("Masukkan kode barang : ");
                    kode = scanner.nextInt();
                    scanner.nextLine();
                    Barang07 barangDitemukan = gudang.cariBarangKode(kode);
                    if (barangDitemukan != null) {
                        System.out.println("Barang Dengan Kode " + kode + " Ditemukan : " + barangDitemukan.nama);
                    } else {
                        System.out.println("Barang Dengan Kode " + kode + " Tidak Ditemukan.");
                    }
                    break;

                case 7:
                    System.out.print("Masukkan Nama Barang : ");
                    nama = scanner.nextLine();
                    barangDitemukan = gudang.cariBarangNama(nama);
                    if (barangDitemukan != null) {
                        System.out.println("Barang Dengan Nama " + nama + " Dan Kode " +  barangDitemukan.kode  + " Ditemukan : " + barangDitemukan.nama);
                    } else {
                        System.out.println("Barang Dengan Nama " + nama + " Tidak Ditemukan.");
                    }
                    break;

                case 8:
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}
```
Output <br>
![alt text](<img/Screenshot 2024-04-17 214137.png>)
![alt text](<img/Screenshot 2024-04-17 214151.png>)
![alt text](<img/Screenshot 2024-04-17 214202.png>)