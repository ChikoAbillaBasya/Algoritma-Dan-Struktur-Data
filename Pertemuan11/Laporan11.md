#
# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA 11 </p>

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
# 2.1 Pembuatan Single Linked List
Kode Program Class
```java
package Pertemuan11.Kode;

public class Node07 {
    int data;
    Node07 next;

    Node07(int nilai, Node07 berikutnya) {
        data = nilai;
        next = berikutnya;
    }
}
```
Kode Program Class
```java
package Pertemuan11.Kode;

public class SingleLinkedList07 {

    Node07 head;
    Node07 tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node07 tmp = head;
            System.out.print("Isi Linked List : ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        Node07 ndInput = new Node07(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node07 ndInput = new Node07(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node07 ndInput = new Node07(input, null);
        Node07 temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Index tidak boleh negatif!");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node07 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("Index melebihi panjang linked list!");
                    return;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Index melebihi panjang linked list!");
            } else {
                temp.next = new Node07(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            }
        }
    }
}
```
Kode Program Main
```java
package Pertemuan11.Kode;

public class SLLMain07 {
    public static void main(String[] args) {
        SingleLinkedList07 singll = new SingleLinkedList07();

        singll.print();
        singll.addFirst(890);
        singll.print();
        singll.addLast(760);
        singll.print();
        singll.addFirst(700);
        singll.print();
        singll.insertAfter(700, 999);
        singll.print();
        singll.insertAt(3, 833);
        singll.print();
    }
}
```
Output <br>
![alt text](<img/Screenshot Output percobaan 1.png>)
# 2.1.2 Pertanyaan
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
Jawab : Karena pada saat program pertama kali dijalankan linked listnya masih kosong jadi pada kondisi isempty pada metode print akan true dan menceteak linked list kosong
2. Jelaskan kegunaan variable temp secara umum pada setiap method!
Jawab : variable temp digunakan untuk menyimpan referensi ke node yang sedang diproses dalam linked list, sehingga dapat melakukan operasi seperti menambahkan, menghapus, atau mencetak node dengan mudah.
3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut
```java
if(temp.next.next == null) tail = temp.next;
```
Jawab :  digunakan untuk memastikan bahwa node baru yang ditambahkan diakhir diatur untuk menunjuk ke node baru dan memeriksa apakah node yang ditunjuk merupakan node terakhir, jika ya maka akan diatur ke node baru dan tail selalu menunjuk ke node terakhir.
#
# 2.2 Modifikasi Elemen pada Single Linked List
Kode Program Class
```java
package Pertemuan11.Kode;

public class Node07 {
    int data;
    Node07 next;

    Node07(int nilai, Node07 berikutnya) {
        data = nilai;
        next = berikutnya;
    }
}
```
Kode Program Class
```java
package Pertemuan11.Kode;

public class SingleLinkedList07 {

    Node07 head;
    Node07 tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node07 tmp = head;
            System.out.print("Isi Linked List : ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input) {
        Node07 ndInput = new Node07(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node07 ndInput = new Node07(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node07 ndInput = new Node07(input, null);
        Node07 temp = head;
        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Index tidak boleh negatif!");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node07 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("Index melebihi panjang linked list!");
                    return;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Index melebihi panjang linked list!");
            } else {
                temp.next = new Node07(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            }
        }
    }

    int getData(int index) {
        Node07 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        return temp.next.data;
    }

    int indexOf(int key) {
        Node07 temp = head;
        int index = 0;
        while (temp != null && temp.data != key) {
            temp = temp.next;
            index++;
        }
        if(temp != null) {
            return 1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if(isEmpty()) {
            System.out.println("Linked list masih kosong," 
                    + "tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if(isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node07 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(int key) {
        if(isEmpty()) {
            System.out.println("Linked list masih kosong, "
                    + "tidak dapat dihapus");
        } else {
            Node07 temp = head;
            while(temp != null) {
                if (temp.data == key && temp == head) {
                    removeFirst();
                    break;
                } else if(temp.next != null && temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node07 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
```
Kode Program Main
```java
package Pertemuan11.Kode;

public class SLLMain07 {
    public static void main(String[] args) {
        SingleLinkedList07 singLL = new SingleLinkedList07();

        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();

        System.out.println("Data pada indeks ke-1 = " + singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" + singLL.indexOf(760));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
}
```
Output <br>
![alt text](<img/Screenshot Output percobaan 2.png>)
# 2.2.3 Pertanyaan
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
Jawab : Keyword break digunakan pada fungsi remove() untuk menghentikan iterasi melalui linked list setelah node yang cocok dengan index yang diberikan telah ditemukan.
2. Jelaskan kegunaan kode dibawah pada method remove
```java
else if (temp.next.data == key) {
    temp.next = temp.next.next;
}
```
Jawab : Digunakan untuk menghapus node yang memiliki nilai data yang sama dengan nilai key yang dicari yang kemudian digantikan dengan nilai selanjutnya.
#
# Tugas
1. Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah 
dipelajari sebelumnya untuk menginputkan data
![alt text](<img/Screenshot Soal Tugas.png>)
Jawab : <br>
Kode Program Class
```java
package Pertemuan11.Kode;

public class Mahasiswa07 {
    int NIM;
    String Nama;
    Mahasiswa07 next;

    public Mahasiswa07(int NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.next = null;
    }
}
```
Kode Program Class
```java
package Pertemuan11.Kode;

public class MahasiswaLinkedList07 {
    Mahasiswa07 head;

    public MahasiswaLinkedList07() {
        this.head = null;
    }

    public void addFirst(int NIM, String Nama) {
        Mahasiswa07 baru = new Mahasiswa07(NIM, Nama);
        baru.next = head;
        head = baru;
    }

    public void addLast(int NIM, String Nama) {
        Mahasiswa07 baru = new Mahasiswa07(NIM, Nama);
        if (head == null) {
            head = baru;
            return;
        }
        Mahasiswa07 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = baru;
    }

    public void insertAfter(int kunci, int NIM, String Nama) {
        Mahasiswa07 baru = new Mahasiswa07(NIM, Nama);
        Mahasiswa07 temp = head;
        while (temp != null && temp.NIM != kunci) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Data dengan NIM " + kunci + " tidak ditemukan.");
            return;
        }
        baru.next = temp.next;
        temp.next = baru;
    }

    public void insertAt(int posisi, int NIM, String Nama) {
        if (posisi < 0) {
            System.out.println("Posisi tidak boleh negatif!");
            return;
        }
        if (posisi == 0) {
            addFirst(NIM, Nama);
            return;
        }
        Mahasiswa07 baru = new Mahasiswa07(NIM, Nama);
        Mahasiswa07 temp = head;
        for (int i = 0; i < posisi - 1; i++) {
            if (temp == null) {
                System.out.println("Posisi melebihi panjang linked list!");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Posisi melebihi panjang linked list!");
            return;
        }
        baru.next = temp.next;
        temp.next = baru;
    }

    public void cetak() {
        Mahasiswa07 temp = head;
        System.out.println("Isi Linked List:");
        while (temp != null) {
            System.out.println("NIM: " + temp.NIM + ", Nama: " + temp.Nama);
            temp = temp.next;
        }
        System.out.println();
    }
}
```
Kode Program Main
```java
package Pertemuan11.Kode;

public class MahasiswaMain07 {
    public static void main(String[] args) {
        MahasiswaLinkedList07 linkedList = new MahasiswaLinkedList07();

        linkedList.addFirst(111, "Anton");
        linkedList.addLast(112, "Prita");
        linkedList.insertAfter(112, 113, "Yusuf");
        linkedList.insertAt(3, 114, "Doni");

        linkedList.cetak();
    }
}
```
Output <br>
![alt text](<img/Screenshot Output tugas 1.png>)

2 Buatlah implementasi program antrian layanan unit kemahasiswaan sesuai dengan kondisi yang 
ditunjukkan pada soal nomor 1! Ketentuan <br>
a. Implementasi antrian menggunakan Queue berbasis Linked List! <br>
b. Program merupakan proyek baru, bukan modifikasi dari soal nomor 1! <br>

Jawab : <br>
Kode Program Class
```java
package Pertemuan11.Kode;

class MahasiswaQueue07 {
    int NIM;
    String nama;
    MahasiswaQueue07 next;

    MahasiswaQueue07(int NIM, String nama) {
        this.NIM = NIM;
        this.nama = nama;
        this.next = null;
    }
}
```
Kode Program Class
```java
package Pertemuan11.Kode;

class Queue {
    MahasiswaQueue07 front, rear;

    Queue() {
        this.front = this.rear = null;
    }


    void enqueue(int NIM, String nama) {
        MahasiswaQueue07 newNode = new MahasiswaQueue07(NIM, nama);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }


    MahasiswaQueue07 dequeue() {
        if (this.front == null) return null;
        MahasiswaQueue07 temp = this.front;
        this.front = this.front.next;
        if (this.front == null) this.rear = null;
        return temp;
    }

    void printQueue() {
        MahasiswaQueue07 current = front;
        while (current != null) {
            System.out.println("NIM: " + current.NIM + ", Nama: " + current.nama);
            current = current.next;
        }
    }
}
```
Kode Program Main
```java
package Pertemuan11.Kode;

public class QueueMain07 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(111, "Anton");
        queue.enqueue(112, "Prita");
        queue.enqueue(113, "Yusuf");
        queue.enqueue(114, "Doni");
        queue.enqueue(115, "Sari");

        queue.printQueue();

        System.out.println("\nDequeue: " + queue.dequeue().nama);
        queue.printQueue();
    }

}
```
Output <br>
![alt text](<img/Screenshot Output tugas 2.png>)