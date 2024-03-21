#
# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA 6 </p>

<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="33%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama  : Chiko Abilla Basya </p>
<p align = "center"> NIM   : 2341720005 </p>
<p align = "center"> Kelas : 1B </p>
<p align = "center"> Prodi : D-IV TEKNIK INFOMATIKA</p>


<br><br><br><br><br>

#
#  Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort
Kode Program Class
```java
package Pertemuan6;

public class Mahasiswa07 {
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa07(String n, int t, int u, double i) {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil() {
        System.out.println("Nama         = " + nama);
        System.out.println("Tahun Masuk  = " + thnMasuk);
        System.out.println("Umur         = " + umur);
        System.out.println("IPK          = " + ipk);
    }
}
```
Kode Program Class
```java
package Pertemuan6;


public class DaftarMahasiswaBerprestasi07 {
    Mahasiswa07 listMhs[] = new Mahasiswa07[5];
    int idx;

    void tambah(Mahasiswa07 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampil();
            System.out.println("-----------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = i + 1; j < idx; j++) {
                if (listMhs[i].ipk < listMhs[j].ipk) {
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa07 tmp = listMhs[i];
                    listMhs[i] = listMhs[j];
                    listMhs[j] = tmp;
                }
            }
        }
    }
}
```
Kode Program Main
```java
package Pertemuan6;

import java.util.Scanner;

public class MahasiswaMain07 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi07 list = new DaftarMahasiswaBerprestasi07();
        Mahasiswa07 m1 = new Mahasiswa07("Nusa", 2017, 25, 3);
        Mahasiswa07 m2 = new Mahasiswa07("Rara", 2012, 19, 4);
        Mahasiswa07 m3 = new Mahasiswa07("Dompu", 2018, 19, 3.5);
        Mahasiswa07 m4 = new Mahasiswa07("Abdul", 2017, 23, 2);
        Mahasiswa07 m5 = new Mahasiswa07("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting = ");
        list.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();
    }
}
```
Output <br>
![alt text](<img/Screenshot Output BubbleSort 1.png>)
![alt text](<img/Screenshot Output bubbleSort 2.png>)
#  Pertanyaan
1. Terdapat di method apakah proses bubble sort?
2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:
```java
 if (listMhs[i].ipk < listMhs[j-l].ipk) {
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa07 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-l];
                    listMhs[j-l] = tmp;
                }
            }
```
Untuk apakah proses tersebut?
3. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
```java
for (int i=0; i<listMhs.length-1; i++) {
            for (int j=i; j<listMhs.length-i; j++) {
```
a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j? <br>
b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ? <br>
c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ? <br>
d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan 
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh? <br>

#
#  Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort
Kode Program Class
```java

```