#
# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA 12 </p>

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
# 12.2 Kegiatan Praktikum 1
Kode Program Class Node
```java
package Pertemuan12.Kode;

public class Node07 {
    int data;
    Node07 prev,next;

    Node07(Node07 prev, int data, Node07 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
```
Kode Program Class DoubleLinkedList
```java
package Pertemuan12.Kode;

public class DoubleLinkedList07 {
    
    Node07 head;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item){
        if(isEmpty()){
            head = new Node07(null, item, head);
        }else{
            Node07 newNode07 = new Node07(null, item, head);
            head.prev = newNode07;
            head = newNode07;
        }
        size++;
    }

    public void addLast(int item){
        if(isEmpty()){
            addFirst(item);
        }else{
            Node07 current = head;
            while (current.next != null){
                current = current.next;
            }
            Node07 newNode07 = new Node07(current, item, null);
            current.next = newNode07;
            size++;
        }    
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node07 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null){
                Node07 newNode07 = new Node07(null, item, current);
                current.prev = newNode07;
                head = newNode07;
            }else{
                Node07 newNode07 = new Node07(current.prev, item, current);
                newNode07.prev = current.prev;
                newNode07.next = current;
                current.prev.next = newNode07;
                current.prev = newNode07;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        if(!isEmpty()){
            Node07 tmp = head;
            System.out.println("Isi Linked List: ");
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
}
```
Kode Program Main DoubleLinkedList
```java
package Pertemuan12.Kode;

public class DoubleLinkedListMain07 {
    public static void main(String[] args) throws Exception {

        DoubleLinkedList07 dll = new DoubleLinkedList07();
        dll.print();
        System.out.println("Size  : " + dll.size());
        System.out.println("===========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("===========================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
    }
}
```
Output <br>
![alt text](<img/Screenshot Output percobaan 1.png>)
# 12.2.3 Pertanyaan Percobaan
1. Jelaskan perbedaan antara single linked list dengan double linked lists! <br>
Jawab : Single linked list hanya menampung satu node, sedangkan double linked list menampung dua node. Pada single linked list, setiap node hanya menyimpan referensi ke node berikutnya, sedangkan pada double linked list setiap node menyimpan referensi ke node sebelumnya dan node berikutnya. <br>
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut? <br>
Jawab : Next digunakan sebagai pointer untuk node berikutnya, sedangkan prev digunakan sebagai pointer untuk node sebelumnya. <br>
3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini? <br>
```java
public DoubleLinkedList(){
    head = null;
    size = 0;
}
```
Jawab : Untuk menginisialisasi awal double linked list sebagai kosong. <br>
4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null? <br>
Node newNode = new Node(null, item, head); <br>
Jawab : Karena node pertama tidak memiliki node sebelumnya, sehingga prev bernilai null. <br>
5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ? <br>
Jawab : Jika double linked list sudah berisi node, node baru yang ditambahkan di awal harus ditempatkan sebelum head saat ini, sehingga  node baru menjadi head baru. <br>
6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null? <br>
Node newNode = new Node(current, item, null); <br>
Jawab : Node baru ditambahkan di akhir list, sehingga next bernilai null karena tidak ada node setelahnya, dan prev menunjuk ke node terakhir saat ini. <br>
7. Pada method add(), terdapat potongan kode program sebagai berikut : <br> 
```java
while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null){
                Node newNode = new Node(null, item, current);
                current.prev = newNode07;
                head = newNode07;
            }else{
                Node newNode = new Node(current.prev, item, current);
                newNode07.prev = current.prev;
                newNode07.next = current;
                current.prev.next = newNode07;
                current.prev = newNode07;
            }
```
jelaskan maksud dari bagian yang ditandai dengan kotak kuning. <br>
Jawab : Kode pada method add() menangani penyisipan node baru di awal list, memastikan node baru menjadi head baru. <br>
#
# 12.3 Kegiatan Praktikum 2
Tambahan di CLass DoubleLinkedList
```java
public void removeFirst() throws Exception {
    if (isEmpty()) {
        throw new Exception("Linked List masih kosong, tidak dapat dihapus");
    } else if (size == 1) {
        removeLast();
    } else {
        head = head.next;
        head.prev = null;
        size--;
        }
    }

public void removeLast() throws Exception {
    if (isEmpty()) {
        throw new Exception ("Linked List masih kosong, tidak dapat dihapus");
    } else if (head.next == null) {
        head = null;
        size--;
        return;
    }

    Node11 current = head;
    while (current.next.next != null) {
        current = current.next;
    }
    current.next = null;
    size--;
    }

public void removeAt(int index) throws Exception {
    if (isEmpty() || index >= size) {
        throw new Exception("Nilai indeks diluar batas");
    } else if (index == 0) {
        removeFirst();
    } else {
        Node11 current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        if (current.next == null) {
            current.prev.next= null;
        } else if (current.prev == null) {
            current = current.next;
            current.prev=null;
            head = current;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
        }
    }
```
Tambahan di Class Main DoubleLinkedlist
```java
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        System.out.println("===========================");
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        dll.removeLast();
        System.out.println("===========================");
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
    }
```
Output <br>
![alt text](<img/Screenshot output percobaan 2.png>)
# 12.3.3 Pertanyaan Percobaan
1. Apakah maksud statement berikut pada method removeFirst()? <br>
head = head.next; <br>
head.prev = null; <br>
Jawab : Pada method removeFirst() di dalam konteks struktur data Double Linked List, statement berikut sering digunakan untuk menghapus elemen pertama (head) dari linked list.<br>
2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()? <br>
Jawab : Untuk mendeteksi posisi data pada bagian akhir dalam method removeLast() dalam konteks struktur data Double Linked List, perlu memperhatikan beberapa hal. Pertama, perlu memastikan bahwa benar-benar menghapus node terakhir, dan kedua, perlu memperbarui pointer tail agar menunjuk ke node sebelumnya (node baru terakhir) dan memutuskan koneksi dari node terakhir yang dihapus.
3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove
```java
Node tmp = head.next;

head.next = tmp.next;
tmp.next.prev = head;
```
Jawab : Dalam potongan kode ini, head.next berguna untuk menghubungkan node setelah node yang akan dihapus; namun, tmp.next tidak diatur menjadi null, sehingga masih ada referensi pada node yang akan dihapus dari daftar yang terhubung. Selain itu, sebelum menghapus node, pastikan bahwa atribut prev dari node setelah node yang dihapus juga diperbarui dengan benar.<br>
4. Jelaskan fungsi kode program berikut ini pada fungsi remove! <br>
```java
current.prev.next = current.next;
current.next.prev = current.prev;
```
Jawab : Fungsi kode program tersebut pada fungsi remove adalah untuk menghapus node current dari linked list. Kode ini memastikan bahwa referensi next dan prev dari node sekitar current diperbarui dengan benar sehingga node current dapat dihapus tanpa merusak struktur linked list. <br>
#
# 12.4 Kegiatan Praktikum 3
Tambahan Di Class DoubleLinkedList
```java

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node07 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node07 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
```
Tambahan Di Main DoubleLinkedList
```java
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        System.out.println("Data Awal Pada Linked List Adalah : " + dll.getFirst());
        System.out.println("Data Akhir Pada Linked List Adalah : " + dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked List Adalah : " + dll.get(1));
    }
```
Output <br>
![alt text](<img/Screenshot output percobaan 3.png>)
# 12.4.3 Pertanyaan Percobaan
1. Jelaskan method size() pada class DoubleLinkedLists! <br>
Jawab : Method size() pada kelas DoubleLinkedLists bertujuan untuk menghitung dan mengembalikan jumlah elemen yang ada di dalam linked list tersebut. <br>
2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke-1! <br>
Jawab : cara mengatur indeks supaya mulai dari 1 adalah melakukan perubahan pada method get, yang dimana ada perubahan pada kode program <br>
```java
public int get(int index) throws Exception {
if (isEmpty() || index > size || index < 1) {
    throw new Exception("Nilai indeks diluar batas");
}
Node tmp = head;
for (int i = 1; i <= index; i++) {
    tmp = tmp.next;
}
return tmp.data;
}
```
3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists! <br>
Jawab : <br>
Single Linked List: <br>
* Pada Single Linked List, setiap node hanya memiliki satu pointer yang menunjuk ke node berikutnya. <br>
* Penambahan di akhir: Membutuhkan penelusuran dari head hingga mencapai node terakhir, waktu O(n). <br>
* Penambahan di awal: Cukup mengubah pointer next dari node baru ke head, dan mengubah head menjadi node baru, waktu O(1). <br>
Double Linked Lists: <br>
* Pada Double Linked List, setiap node memiliki dua pointer, yaitu pointer yang menunjuk ke node sebelumnya dan pointer yang menunjuk ke node berikutnya. <br>
* Penambahan di akhir: Tidak perlu penelusuran, cukup mengubah pointer next dari node terakhir dan pointer prev dari node baru, waktu O(1). <br>
* Penambahan di awal: Cukup mengubah pointer next dari node baru ke head, mengubah pointer prev dari head ke node baru, dan mengubah head menjadi node baru, waktu O(1). <br>
4. Jelaskan perbedaan logika dari kedua kode program di bawah ini! <br>
A.                              
```java                             
public boolean isEmpty() {
    if(size == 0) {
        return true;
    } else {
        return false;
    }
}
```
B. 
```java
public boolean isEmpty() {
    return head == null;
}
```
Jawab : <br>
A). Kode program pertama memanfaatkan variabel size untuk memeriksa apakah struktur data Double Linked Lists dalam keadaan kosong atau tidak. Pemeriksaan dilakukan dengan memeriksa apakah nilai variabel size sama dengan 0, yang mengindikasikan bahwa Double Linked Lists tidak memiliki elemen di dalamnya, sehingga dikembalikan nilai true yang menandakan Double Linked Lists dalam keadaan kosong. Sebaliknya, jika nilai variabel size tidak sama dengan 0, maka dikembalikan nilai false yang mengindikasikan bahwa Double Linked Lists tidak dalam keadaan kosong dan memiliki setidaknya satu elemen di dalamnya. <br> <br>

B). Kode program kedua menggunakan variabel head untuk menentukan apakah struktur data Single Linked Lists dalam keadaan kosong atau tidak. Pemeriksaan dilakukan dengan mengevaluasi apakah nilai variabel head sama dengan null, yang menjadi indikator bahwa Single Linked Lists tidak memiliki elemen di dalamnya, sehingga dikembalikan nilai true yang menandakan Single Linked Lists dalam keadaan kosong. Namun, jika nilai variabel head tidak sama dengan null, maka dikembalikan nilai false yang mengindikasikan bahwa Single Linked Lists tidak dalam keadaan kosong dan memiliki setidaknya satu elemen di dalamnya. <br>
# 
# 12.5 Tugas Praktikum
1. Buat program antrian vaksinasi menggunakan queue berbasis double linked list sesuai ilustrasi 
dan menu di bawah ini! (counter jumlah antrian tersisa di menu cetak(3) dan data orang yang 
telah divaksinasi di menu Hapus Data(2) harus ada <br>
Kode Class Node107
```java
package Pertemuan12.Kode;

public class Node107 {
    
    String data;
    Node107 next;
    Node107 prev;
    
    Node107(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}   
```
Kode Class Queue107
```java
package Pertemuan12.Kode;

public class Queue107 {
    
    Node107 front, rear;

    Queue107() {
        this.front = this.rear = null;
    }

    void enqueue(String data) {
        Node107 newNode = new Node107(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        System.out.println(data + " telah ditambahkan ke dalam antrian.");
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Antrian kosong, tidak ada yang dapat dihapus.");
            return;
        }
        System.out.println(front.data + " telah selesai divaksinasi.");
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            rear = null;
        }
    }

    void print() {
        if (front == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        Node107 temp = front;
        int noAntrian = 1;
        System.out.println("| No Antrian | Nama          |");
        System.out.println("|------------|---------------|");
        while (temp != null) {
            System.out.printf("| %-10d | %-13s |\n", noAntrian++, temp.data);
            temp = temp.next;
        }
        System.out.println("Tersisa " + (noAntrian - 1) + " antrian.");
    }

    boolean isEmpty() {
        return front == null;
    }
}
```
Kode Class Vaksinmain107
```java
package Pertemuan12.Kode;

import java.util.Scanner;

public class VaksinMain107 {
    public static void main(String[] args) {
        Queue107 queue = new Queue107();
        Scanner scanner = new Scanner(System.in);
        int pilih;
        String nama;
        
        do {
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EKSTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("\n1. Tambah data penerima vaksin");
            System.out.println("2. Hapus data pengantri vaksin");
            System.out.println("3. Daftar penerima vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.print("Pilihan: ");
            pilih = scanner.nextInt();
            scanner.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.println("Nomor Antrian: ");
                    scanner.nextLine();
                    System.out.println("Nama Penerima: ");
                    nama = scanner.nextLine();
                    queue.enqueue(nama);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilih != 4);
        scanner.close();
    }
}
```
Output <br>
![alt text](<img/Screenshot Output Tugas 1 (2).png>)
![alt text](<img/Screenshot Output Tugas 1 (3).png>)

![alt text](<img/Screenshot Output Tugas 1 (4).png>)
![alt text](<img/Screenshot Output Tugas 1 (1).png>) <br>
2. Buatlah program daftar film yang terdiri dari id, judul dan rating menggunakan double linked 
lists, bentuk program memiliki fitur pencarian melalui ID Film dan pengurutan Rating secara 
descending. Class Film wajib diimplementasikan dalam soal ini.
Kode Class Film207
```java
package Pertemuan12.Kode;

public class Film207 {
    int id;
    String judul;
    double rating;
    Film207 prev, next;
    
        public Film207 (int id, String judul, double rating) {
            this.id = id;
            this.judul = judul;
            this.rating = rating;
        }
    }
```
Kode Class DoubleFilm207
```java
package Pertemuan12.Kode;

public class DoubleFilm207 {
 
    private Film207 head, tail;

    public void tambahAwal(int id, String judul, double rating) {
        Film207 newFilm207 = new Film207(id, judul, rating);
        if (head == null) {
            head = tail = newFilm207;
        } else {
            newFilm207.next = head;
            head.prev = newFilm207;
            head = newFilm207;
        }
    }

    public void tambahAkhir(int id, String judul, double rating) {
        Film207 newFilm207 = new Film207(id, judul, rating);
        if (tail == null) {
            head = tail = newFilm207;
        } else {
            tail.next = newFilm207;
            newFilm207.prev = tail;
            tail = newFilm207;
        }
    }

    public void tambahPadaIndex(int index, int id, String judul, double rating) {
        if (index <= 0) {
            tambahAwal(id, judul, rating);
            return;
        }
        
        Film207 newFilm207 = new Film207(id, judul, rating);
        Film207 current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                break;
            }
            current = current.next;
        }

        if (current == null || current.next == null) {
            tambahAkhir(id, judul, rating);
        } else {
            newFilm207.next = current.next;
            newFilm207.prev = current;
            current.next.prev = newFilm207;
            current.next = newFilm207;
        }
    }

    public void hapusPertama() {
        if (head != null) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    }

    public void hapusTerakhir() {
        if (tail != null) {
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    public void hapusPadaIndex(int index) {
        if (index <= 0) {
            hapusPertama();
            return;
        }

        Film207 current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                return;
            }
            current = current.next;
        }

        if (current == null || current.prev == null) {
            hapusTerakhir();
        } else {
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
    }

    public void cetak() {
        Film207 current = head;
        while (current != null) {
            System.out.println("ID: " + current.id + ", Judul: " + current.judul + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    public Film207 cariID(int id) {
        Film207 current = head;
        while (current != null) {
            if (current.id == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void urutRatingDesc() {
        if (head == null) return;
        boolean swapped;
        do {
            swapped = false;
            Film207 current = head;
            while (current.next != null) {
                if (current.rating < current.next.rating) {
                    double tempRating = current.rating;
                    current.rating = current.next.rating;
                    current.next.rating = tempRating;

                    int tempId = current.id;
                    current.id = current.next.id;
                    current.next.id = tempId;

                    String tempJudul = current.judul;
                    current.judul = current.next.judul;
                    current.next.judul = tempJudul;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}
```
Kode Class FilmMain207
```java
package Pertemuan12.Kode;

import java.util.Scanner;

public class FilmMain207 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleFilm207 dll = new DoubleFilm207();
        int choice, id, index;
        String judul;
        double rating;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); // flush scanner
                    System.out.print("Masukkan Judul: ");
                    judul = scanner.nextLine();
                    System.out.print("Masukkan Rating: ");
                    rating = scanner.nextDouble();
                    dll.tambahAwal(id, judul, rating);
                    break;
                case 2:
                    System.out.print("Masukkan ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); // flush scanner
                    System.out.print("Masukkan Judul: ");
                    judul = scanner.nextLine();
                    System.out.print("Masukkan Rating: ");
                    rating = scanner.nextDouble();
                    dll.tambahAkhir(id, judul, rating);
                    break;
                case 3:
                    System.out.print("Masukkan Index: ");
                    index = scanner.nextInt();
                    System.out.print("Masukkan ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); // flush scanner
                    System.out.print("Masukkan Judul: ");
                    judul = scanner.nextLine();
                    System.out.print("Masukkan Rating: ");
                    rating = scanner.nextDouble();
                    dll.tambahPadaIndex(index, id, judul, rating);
                    break;
                case 4:
                    dll.hapusPertama();
                    break;
                case 5:
                    dll.hapusTerakhir();
                    break;
                case 6:
                    System.out.print("Masukkan Index untuk dihapus: ");
                    index = scanner.nextInt();
                    dll.hapusPadaIndex(index);
                    break;
                case 7:
                    dll.cetak();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film yang dicari: ");
                    id = scanner.nextInt();
                    Film207 foundFilm = dll.cariID(id);
                    if (foundFilm != null) {
                        System.out.println("Film ditemukan: ID: " + foundFilm.id + ", Judul: " + foundFilm.judul + ", Rating: " + foundFilm.rating);
                    } else {
                        System.out.println("Film dengan ID tersebut tidak ditemukan.");
                    }
                    break;
                case 9:
                    dll.urutRatingDesc();
                    break;
                case 10:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (choice != 10);
        scanner.close();
    }
}
```
Output <br>
Menu Awal dan Penambahan Data <br>
![alt text](<img/Screenshot Output Tugas 2 (1).png>)
![alt text](<img/Screenshot Output Tugas 2 (2).png>)

![alt text](<img/Screenshot Output Tugas 2 (3).png>)
![alt text](<img/Screenshot Output Tugas 2 (4).png>)

Cetak Data <br>
![alt text](<img/Screenshot Output Tugas 2 (5).png>)

Pencarian Data <br>
![alt text](<img/Screenshot Output Tugas 2 (6).png>)