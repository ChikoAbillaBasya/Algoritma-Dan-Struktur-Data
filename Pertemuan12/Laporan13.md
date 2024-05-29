#
# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA 13 </p>

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
        dll.print();
        System.out.println("Size  : " + dll.size());
        System.out.println("=============================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size  : " + dll.size());
        System.out.println("=============================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size  : " + dll.size());
        System.out.println("=============================================");
        dll.removeAt(1);
        dll.print();
        System.out.println("Size  : " + dll.size());
        System.out.println("=============================================");
    }
```
Output <br>
![alt text](<img/Screenshot output percobaan 2.png>)
# 12.3.3 Pertanyaan Percobaan
1. Apakah maksud statement berikut pada method removeFirst()? <br>
head = head.next; <br>
head.prev = null; <br>
Jawab : <br>
2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()? <br>
Jawab : <br>
3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove
```java
Node tmp = head.next;

head.next = tmp.next;
tmp.next.prev = head;
```
Jawab : <br>
#
# 12.4 Kegiatan Praktikum 3
