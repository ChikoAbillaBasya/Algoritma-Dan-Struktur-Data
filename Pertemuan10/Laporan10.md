#
# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA 10 </p>

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
# 10.2 Praktikum 1
Kode Program Class
```java
package Pertemuan10.Kode;

import java.util.Scanner;

public class Queue07 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue07(int n) {
        max = n;
        data = new int[n];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen Terdepan : " + data[front]);
        } else {
            System.out.println("Queue Masih Kosong ");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong ");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");  
            System.out.println("Jumlah Elemen = " + size);
        }
    }

    public void clear() {
        if (isEmpty()) {
            front = rear = -1;
            size = 0; 
            System.out.println("Queue Berhasil Dikosongkan ");
        } else {
            System.out.println("Queue Masih Kosong ");
        }
    }

    public void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue Sudah Penuh ");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear =0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong ");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;  
    } 

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("----------------------------------");
    }
}
```
Kode Program Main
```java
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
```
Output <br>
![alt text](<img/Screenshot Output Percobaan 1.png>)

# 10.2.3 Pertanyaan
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size 
bernilai 0? <br>
Jawab : Nilai awal atribut front dan rear bernilai -1 karena nilai tersebut menunjukkan bahwa antrian dalam keadaan kosong.
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```java
if (size == max - 1) {
    rear = 0;
```
Jawab : kode tersebut digunakan dan bermaksd jika rear sudah mencapai max-1 artinya arraynya sudah terisi penuh dan rear diatur kembali ke 0 untuk memulai dari awal. <br>
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```java
if (front == max -1 ) {
    front = 0;
```
Jawab : kode tersebut digunakan untuk mengatur ulang front ketika elemen pertama diambil, dan jika front sama dengan max-1 berarti sudah sampe di ahir array maka front diatur ulang ke 0 <br>
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front? <br>
Jawab : karena untuk menghindari iterasi ulang yang tidak perlu dari elemen-elemen yang telah dihapus sebelumnya dari antrian. Dengan demikian, proses mencetak elemen yang saat ini ada dalam antrian dimulai dari posisi front yang merupakan elemen pertama saat itu. <br>
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
```java
i = (i + 1) % max;
```
Jawab : kode tersebut digunakan untuk mengatur ulang nilai i dengan mod agar indeks i kembali ke 0 setelah mencapai max-1 <br>
6. Tunjukkan potongan kode program yang merupakan queue overflow! <br>
Jawab : 
```java
    public void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue Sudah Penuh ");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear =0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
```
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan! <br>
Jawab :
```java
void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1);
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
```
#
# 10.3 Praktikum 2
Kode Program Class
```java
package Pertemuan10.Kode;

public class Nasabah07 {
    String norek;
    String nama;
    String alamat;
    int umur;
    double saldo;

    Nasabah07(String norek, String nama, String alamat, int umur, double saldo){
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }
}
```
Kode Program Class
```java
package Pertemuan10.Kode;

public class QueueNasabah07 {
    Nasabah07[] data;
    int front, rear, size, max;

    QueueNasabah07(int n) {
        max = n;
        data = new Nasabah07[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan : " + data[front].norek + " " + data[front].nama + " "
                    + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " " + data[i].nama + " "
                        + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " "
                    + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void Enqueue(Nasabah07 dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1);
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public Nasabah07 Dequeue() {
        Nasabah07 dt = new Nasabah07(null, null, null, max, front);
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1);
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void menu(){
        System.out.println("Pilihan menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("Cek semua  antrian");
        System.out.println("--------------------------");

    }
}
```
Kode Program Main
```java
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
                    int saldo = sc07.nextInt();
                    Nasabah07 nb = new Nasabah07(norek, nama, alamat, umur, saldo);
                    Q.Enqueue(nb);
                    break;
                case 2:
                    Nasabah07 data = Q.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
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
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
```
Output <br>
![alt text](<img/Screenshot Output Percobaan 2.png>)
# 10.3.3 Pertanyaan
1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!
```java
if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
```
Jawab : untuk memastikan bahwa data nasabah yang dikeluarkan dari antrian adalah data yang lengkap dan valid sebelum dicetak ke layar. <br>
2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class 
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula 
daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
dapat dipanggil! <br>
Jawab :
```java
void PeekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen paling belakang : " + data[rear].norek + " " + data[rear].nama + " "
                    + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
```
```java
case 5:
    Q.PeekRear();
    break;
```
#
# 10.4 Tugas
Kode Program Class Pembeli
```java
package Pertemuan10.Kode;

public class Pembeli07 {
    String nama;
    int noHP;

    public Pembeli07(String nama,int noHP){
        this.nama = nama;
        this.noHP = noHP;
    }
}
```
Kode Program Class Queue Pembeli
```java
package Pertemuan10.Kode;

public class QueuePembeli07{
    Pembeli07[] antrian;
    int front;
    int rear;  
    int size; 
    int max;

    QueuePembeli07(int n) {
        max = n;
        antrian = new Pembeli07[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    void Enqueue(Pembeli07 antri) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public Pembeli07 Dequeue() {
        Pembeli07 antri = null;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            antri = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return antri;
    }

    void Peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan : " + antrian[front].nama + " "
                    + antrian[front].noHP);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    void PeekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen paling belakang : " + antrian[rear].nama + " "
                    + antrian[rear].noHP);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    void DaftarPembeli() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " "
                        + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " "
                    + antrian[i].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void PeekPosition(String nama) {
        int pos = -1;
        int i = front;
        while (i != rear) {
            if (antrian[i].nama.equals(nama)) {
                pos = i;
            }
            i = (i + 1) % max;
        }
        if (pos > 0) {
            System.out.println("Pelanggan yang anda cari berada pada posisi ke " + (pos + 1));
        } else {
            System.out.println("Pelanggan yang anda cari tidak ada");
        }
    }

    public void menu(){
        System.out.println("Pilihan menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4.Cek semua  antrian");
        System.out.println("5. Cek antrian belakang");
        System.out.println("6. Cari posisi pembeli");
        System.out.println("7. Keluar");
        System.out.println("--------------------------");

    }
}
```
Kode Program Main Pembeli
```java
package Pertemuan10.Kode;

import java.util.Scanner;

public class PembeliMain07 {
     public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        Scanner sc111 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc11.nextInt();

        QueuePembeli07 Q = new QueuePembeli07(jumlah);

        int pilih = 0;

        do {
            Q.menu();
            pilih = sc11.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc111.nextLine();
                    System.out.print("No HP : ");
                    int noHP = sc11.nextInt();
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
                    String cariNama = sc111.nextLine();
                    Q.PeekPosition(cariNama);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
```
Output <br>
![alt text](<img/Screenshot Output Tugas 1.png>)
![alt text](<img/Screenshot Output Tugas 2.png>)
![alt text](<img/Screenshot Output Tugas 3.png>)
