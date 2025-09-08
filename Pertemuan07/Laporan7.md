#
# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA 7 </p>

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
# Searching / Pencarian Menggunakan Agoritma Sequential Search
Kode Program Class
```java
package Pertemuan7.Kode;

public class Buku07 {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku07(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }
    public void tampilDataBuku() {
        System.out.println("========================");
        System.out.println("Kode Buku    : " + kodeBuku);
        System.out.println("Judul Buku   : " + judulBuku);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang    : " + pengarang);
        System.out.println("Stock        : " + stock);
    }
}
```
Kode Program Class
```java
package Pertemuan7.Kode;

public class PencarianBuku07 {
    Buku07 listBk[] = new Buku07[5];
    int idx;
    
    void tambah(Buku07 bk) {
        if (idx < listBk.length) {
            listBk[idx] = bk;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Buku07 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data      : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data      : " + x + " tidak ditemukan");
        }
    }
}
```
Kode Program Main
```java
package Pertemuan7.Kode;

import java.util.Scanner;

public class BukuMain07 {
    static Scanner s = new Scanner(System.in);
    static Scanner s1 = new Scanner(System.in);
    static PencarianBuku07 data = new PencarianBuku07();
    static int jumBuku = 5;

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");

        for (int i = 0; i < jumBuku; i++) {
            System.out.println("--------------------------------------------------------");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s.nextInt();
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
        System.out.println("Masukkan Kode Buku yang dicari : ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan Sequential Search  : ");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
    }
}
```
Output <br>
![alt text](<img/Screenshot Output buku 1.png>)
![alt text](<img/Screenshot Output buku 2.png>)
![alt text](<img/Screenshot Output buku 3.png>) <br>
Tambahan method TampilData
```java
    public void tampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku   \t: " + x);
            System.out.println("Judul Buku  \t: " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang   \t: " + listBk[pos].pengarang);
            System.out.println("Stock       \t: " + listBk[pos].stock);
        } else {
            System.out.println("data      : " + x + " tidak ditemukan");
        }
    }
```
```java
data.tampilData(cari, posisi);
```
Output <br>
![alt text](<img/Screenshot Output Buku 4.png>)
![alt text](<img/Screenshot Output Buku 5.png>)
# Pertanyaan
1. Jelaskan fungsi break yang ada pada method FindSeqSearch! <br>
Jawab : Pada method FindSeqSearch, fungsi break digunakan untuk menghentikan iterasi saat elemen yang dicari ditemukan. Ini memungkinkan method untuk mengembalikan posisi elemen yang ditemukan atau -1 jika tidak ditemukan.
2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih 
dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi? <br>
Jawab : Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil kebesar, program akan tetap berjalan, hasilnya benar. <br>
![alt text](<img/Screenshot Output latihan 1.png>)
![alt text](<img/Screenshot Output latihan 2.png>)
3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe 
method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method 
tersebut pada class BukuMain seperti gambar berikut :
```java
Buku dataBuku = data.FindBuku(cari);
dataBuku.tampilDataBuku(); 
```
Jawab : <br>
Tambahan method FindBuku
```java
    public Buku07 FindBuku(int cari) {
        for (int j = 0; j < listBk.length; j++){
            if (listBk[j].kodeBuku == cari){
                return listBk[j];
            }
        }    
        return null;
    }
}
```
```java
        Buku07 dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();
```
Output <br>
![alt text](<img/Screenshot Output latihan 3.png>)
#
# Searching / Pencarian Menggunakan Binary Search
Tambahan method FindBinarySearch
```java
    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return mid;
            } else if (listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid -1);
            } else {
                return FindBinarySearch(cari, mid +1, right);
            }
        } 
        return -1;
    }
}
```
```java
        System.out.println("========================================");
        System.out.println("Menggunakan Binary Search : ");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.tampilData(cari, posisi);
```
Output <br>
![alt text](<img/Screenshot Output Binary 1.png>)
![alt text](<img/Screenshot Output Binary 2.png>)
# Pertanyaan
1. Tunjukkan pada kode program yang mana proses divide dijalankan! <br>
Jawab :
```java
mid = left + (right - left) / 2;
```
2. Tunjukkan pada kode program yang mana proses conquer dijalankan! <br>
Jawab :
```java
return FindBinarySearch(cari, left, mid -1);
```
dan 
```java
  return FindBinarySearch(cari, mid +1, right);
```
3. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa 
demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi? <br>
Jawab : jika kode tidak urut program masih dapat berjalan, kode acak <br>
![alt text](<img/Screenshot Output Latihan Binary 3.png>) <br>
Output yang dihasilkan adalah <br>
![alt text](<img/Screenshot Output latihan Binary 4.png>) <br>
itu bisa terjadi karena data yang diinputkan tidak urut 
4. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214, 20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai! <br>
Jawab : Hasil Binary Search tidak akan sesuai karna kode buku dari terbesar ke terkecil. sehingga proses perbandingannya harus diubah. <br>
Hasil Modifikasi 
```java
    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return mid;
            } else if (listBk[mid].kodeBuku < cari ) {
                return FindBinarySearch(cari, left, mid -1);
            } else {
                return FindBinarySearch(cari, mid +1, right);
            }
        } 
        return -1;
    }
}
```
Output <br>
![alt text](<img/Screenshot Output Modif binary 1.png>)
![alt text](<img/Screenshot Output Modif binary 2.png>)
#
# Percobaan Pengayaan Divide and Conquer
Kode Program Class
```java
package Pertemuan7.Kode;

public class MergeSorting07 {
    public void mergeSort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    public void merge(int data[], int left, int middle, int right) {
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a + 1;
        for (int i = 0; i < s; i++) {
            data[c + i] = temp[a + i];
        }
    }

    public void sort(int data[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            merge(data, left, middle, right);
        }
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
```
Kode Program Main
```java
package Pertemuan7.Kode;

public class MergeSortMain07 {
    public static void main(String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("Sorting dengan merge sort");
        MergeSorting07 mSort = new MergeSorting07();
        System.out.println("Data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah diurutkan");
        mSort.printArray(data);    
    }
}
```
Output <br>
![alt text](<img/Screenshot Output mergeSort.png>)
#
# Latihan Praktikum
1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
- Ubah tipe data dari kode Buku yang awalnya int menjadi String
- Tambahkan method untuk pencarian kode Buku (bertipe data String) dengan menggunakan 
sequential search dan binary search. <br>
Jawab : <br>
Kode Program Class
```java
package Pertemuan7.Kode;

public class Buku07 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku07(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku() {
        System.out.println("========================");
        System.out.println("Kode Buku    : " + kodeBuku);
        System.out.println("Judul Buku   : " + judulBuku);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang    : " + pengarang);
        System.out.println("Stock        : " + stock);
    }
}
```
Kode Program Class
```java
package Pertemuan7.Kode;

public class PencarianBuku07 {
    Buku07 listBk[] = new Buku07[5];
    int idx;
    
    void tambah(Buku07 bk) {
        if (idx < listBk.length) {
            listBk[idx] = bk;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Buku07 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(String cari) {
        int posisi = 2;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari))  {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data      : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data      : " + x + " tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku   \t: " + x);
            System.out.println("Judul Buku  \t: " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang   \t: " + listBk[pos].pengarang);
            System.out.println("Stock       \t: " + listBk[pos].stock);
        } else {
            System.out.println("data      : " + x + " tidak ditemukan");
        }
    }

    public Buku07 FindBuku(String cari) {
        Buku07 buku = null;
        for (int j = 0; j < listBk.length; j++) {
            if  (listBk[j].kodeBuku.equals(cari)) {
                buku = listBk[j];
                break;
            }
        }
        return buku;
    }
    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if  (listBk[mid].kodeBuku.equals(cari)) {
                return mid;
            } else if ( (listBk[mid].kodeBuku).equals(cari) ) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
```
Kode Program Main
```java
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
            String kodeBuku = s1.next();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s1.next();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.next();
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
        System.out.println("Masukkan Kode Buku yang dicari : ");
        System.out.print("Kode Buku : ");
        String cari = s2.nextLine();
        System.out.println("Menggunakan Sequential Search  : ");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.tampilData(cari, posisi);

        Buku07 dataBuku = data.FindBuku(cari);
        if (dataBuku != null) {
            dataBuku.tampilDataBuku();
        } else {
            System.out.println("Buku dengan kode " + cari + " tidak ditemukan.");
        }

        System.out.println("========================================");
        System.out.println("Menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
```
Output <br>
![alt text](<img/Screenshot Output Latihan 1 1.png>)
![alt text](<img/Screenshot Output latihan 1 2.png>) <br>
2. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
- Tambahkan method pencarian judul buku menggunakan sequential search dan binary 
search. Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan 
dengan menggunakan algoritma Sorting (bebas pilih algoritma sorting apapun)! Sehingga 
ketika input data acak, maka algoritma searching akan tetap berjalan
- Buat aturan untuk mendeteksi hasil pencarian judul buku yang lebih dari 1 hasil dalam 
bentuk kalimat peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang 
diberikan! <br>
Jawab : <br>
Kode Program Class
```java
package Pertemuan7.Kode;

public class Buku07 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku07(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku() {
        System.out.println("========================");
        System.out.println("Kode Buku    : " + kodeBuku);
        System.out.println("Judul Buku   : " + judulBuku);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang    : " + pengarang);
        System.out.println("Stock        : " + stock);
    }
}
```
Kode Program Class
```java
package Pertemuan7.Kode;

public class PencarianBuku07 {
    Buku07 listBk[] = new Buku07[5];
    int idx;
    
    void tambah(Buku07 bk) {
        if (idx < listBk.length) {
            listBk[idx] = bk;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Buku07 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(String cari) {
        int posisi = 2;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari))  {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data      : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data      : " + x + " tidak ditemukan");
        }
    }

    public void tampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku   \t: " + x);
            System.out.println("Judul Buku  \t: " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang   \t: " + listBk[pos].pengarang);
            System.out.println("Stock       \t: " + listBk[pos].stock);
        } else {
            System.out.println("data      : " + x + " tidak ditemukan");
        }
    }

    public Buku07 FindBuku(String cari) {
        Buku07 buku = null;
        for (int j = 0; j < listBk.length; j++) {
            if  (listBk[j].kodeBuku.equals(cari)) {
                buku = listBk[j];
                break;
            }
        }
        return buku;
    }
    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if  (listBk[mid].kodeBuku.equals(cari)) {
                return mid;
            } else if ( (listBk[mid].kodeBuku).equals(cari) ) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    public int findJudulBukuSequential(String judulBuku) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equals(judulBuku)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    private void bubbleSortByJudulBuku() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 0; j < listBk.length - i - 1; j++) {
                if (listBk[j].judulBuku.compareTo(listBk[j + 1].judulBuku) > 0) {
                    Buku07 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }

    public int findJudulBinary(String judulBuku) {
        bubbleSortByJudulBuku(); 
        int left = 0;
        int right = listBk.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compareResult = listBk[mid].judulBuku.compareTo(judulBuku);
            if (compareResult == 0) {
                return mid;
            } else if (compareResult < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;    
    }
}
```
Kode Program Main
```java
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
```
OUTPUT BERDASARKAN SEARCH KODE BUKU <br>
![alt text](<img/Screenshot Output Latihan 2 (2).png>)
![alt text](<img/Screenshot Output Latihan 2 (1).png>) <br>
OUTPUT BERDASARKAN SEARCH JUDUL BUKU <br>
![alt text](<img/Screenshot Output Latihan 2 3.png>)
