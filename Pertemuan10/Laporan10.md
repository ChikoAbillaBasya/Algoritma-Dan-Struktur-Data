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