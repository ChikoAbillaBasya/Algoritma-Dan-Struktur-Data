#
# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA 15 </p>

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
# 2.1 Percobaan 1: Implementasi Graph menggunakan Linked List
Kode Program CLass Node07
```java
package Praktikum15.Kode;

public class Node07 {
   int data;
   Node07 prev, next;
   int jarak;

   Node07(Node07 prev, int data, int jarak, Node07 next) {
      this.prev = prev;
      this.data = data;
      this.jarak = jarak;
      this.next = next;
   }
}
```
Kode Program Class DoubleLinkedList07
```java
package Praktikum15.Kode;

public class DoubleLinkedList07 {
    Node07 head;
    int size;
    
    public DoubleLinkedList07() {
        head = null;
        size =0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int item , int jarak){
        if(isEmpty()){
            head = new Node07(null, item, jarak,null);
        }else{
            Node07 newNode07 = new Node07(null, item, jarak,head);
            head.prev = newNode07;
            head = newNode07;
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
            System.out.print("Isi Linked List: ");
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("Berhasil diisi");
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception ("Nilai indeks diluar batas");
        } 
            Node07 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.data;
        
    }


    // method getindex
    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception ("Nilai indeks diluar batas");
        } 
            Node07 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.jarak;
        
    }

    public void remove(int index) {
        Node07 current = head;
        while (current != null){
            if (current.data == index){
                if (current.prev != null){
                    current.prev.next = current.next;
                }else{
                    head = current.next;
                }

                if (current.next != null){
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }
}
```
Kode Program Class Graph07
```java
package Praktikum15.Kode;

public class Graph07 {
    int vertex;
    DoubleLinkedList07 list[];

    public Graph07(int v) {
        vertex = v; 
        list = new DoubleLinkedList07[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList07();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        //list[tujuan].addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception{
        int k, totalIn = 0, totalOut=0;
        for ( int i= 0; i < vertex; i++) {
            //inDegree
            for (int j = 0 ; j <list[i].size(); j++){
                if (list [i].get(j)==asal){
                    ++totalIn;
                }
            }

            //outDegree
            for (k =0; k<list[asal].size();k++){
                list[asal].get(k);
            }
            totalOut = k;
        }    
        System.out.println("InDegree dari gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari gedung " + (char) ('A' + asal) + ": " + (totalIn+totalOut));
       // System.out.println("OutDegree dari gedung " + (char) ('A' + asal) + ": " + list[asal].size());
        
    }

    public void removeEdge(int asal, int tujuan)throws Exception{
        for(int i = 0; i<vertex;i++){
            if (i == tujuan){
                list[asal].remove(tujuan);
            }
        }
    }
    public void removeAll(){
        for(int i = 0; i<vertex;i++){
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception{
        for(int i = 0; i<vertex;i++){
            if (list[i].size() > 0){
                System.out.println("Gedung " + (char)('A' + i) + " terhubung dengan");
                for (int j = 0; j < list[i].size(); j++){
                    System.out.println((char)('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
```
Kode Program GraphMain07
```java
package Praktikum15.Kode;

public class GraphMain07 {
    public static void main(String[] args) throws Exception {
    
        Graph07 gedung = new Graph07(6);

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);    
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
       
        gedung.degree(0);  
        gedung.printGraph();

        gedung.removeEdge(1,3);
        gedung.printGraph();
    }
}
```
Output : <br>

Hasil Running Pada Langkah 14 <br>
![alt text](<img/Screenshot Output Percobaan 1.png>) <br>

Hasil Running Pada Langkah 17 <br>
![alt text](<img/Screenshot output percobaan 1 (2).png>)
# 2.1.3 Pertanyaan
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai! <br>
jawab : Output error setelah melakukan run pada langkah 17 <br>
![alt text](img/Screenshot.png) <br>
Hal tersebut karena ada kesalahan pada methods remove pada class DoubleLinkedList20.java. Dibawah ini adalah perbaikan kodenya : <br>
```java
    public void remove(int index) {
        Node07 current = head;
        while (current != null){
            if (current.data == index){
                if (current.prev != null){
                    current.prev.next = current.next;
                }else{
                    head = current.next;
                }

                if (current.next != null){
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }
}
```
2. Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan 
variabel tersebut! <br>
Jawab : tujuan dari pembuatan variabel DoubleLinkedList[] list; adalah untuk menyimpan dan mengelola adjacency list dalam representasi graf. <br>
3. Jelaskan alur kerja dari method removeEdge! <br>
Jawab : Method removeEdge berfungsi untuk menghapus edge antara dua node dalam graf. Alur kerjanya adalah dengan menerima parameter asal dan tujuan yang merepresentasikan node asal dan tujuan dari edge yang akan dihapus. Kemudian, method ini memanggil method remove pada linked list yang sesuai dengan node asal untuk menghapus node tujuan. Method remove pada doubleLinkedList07 mencari node dengan nilai data yang sesuai dengan tujuan, lalu menghapus node tersebut dari linked list dengan mengatur ulang pointer prev dan next dari node tetangga. <br>
4. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain saat digunakan pada method addEdge pada class Graph? <br>
Jawab : karena saat menambah edge baru pada addfirst, tidak perlu melakukan looping cukup panjang untuk menuju pada urutan terakhir, sehingga lebih efisien dalam waktu dan lebih sedarhana dan mudah dipahami <br>
5. Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner). <br>
```
    Masukkan gedung asal: 2
    Masukkan gedung tujuan: 3
    Gedung C dan D bertetangga

    Masukkan gedung asal: 2
    Masukkan gedung tujuan: 5
    Gedung C dan F tidak bertetangga
```
Jawab : <br>
Kode Modifikasi Di Graph07
```java
 public boolean tetangga(int asal, int tujuan) throws Exception {
        for (int i = 0; i < list[asal].size(); i++) {
            if (list[asal].get(i) == tujuan) {
                return true;
            }
        }
        return false;
    }
```
Kode Modifikasi Di GraphMain07
```java
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan gedung asal: ");
        int asal = scanner.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = scanner.nextInt();
        
        boolean tetangga = gedung.tetangga(asal, tujuan);
        char gedungAsal = (char) ('A' + asal);
        char gedungTujuan = (char) ('A' + tujuan);
        
        if (tetangga) {
            System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " bertetangga");
        } else {
            System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " tidak bertetangga");
        }

        scanner.close();
```
#
# 2.2 Percobaan 2: Implementasi Graph menggunakan Matriks
```java
package Praktikum15.Kode;

public class GraphMatriks07 {
    int vertex;
    int[][] matriks;

    public GraphMatriks07(int v){
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge( int asal, int tujuan, int jarak){
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge (int asal, int tujuan){
        matriks[asal][tujuan] = -1;
    }

    public void printGraph(){
        for (int i = 0; i < vertex; i++){
            System.out.print("Gedung " + (char) ('A' + i) +": ");
            for (int j = 0; j < vertex; j++){
                if (matriks[i][j] != -1){
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m)");
                }
            }
            System.out.println();
        }
    }
}
```
Output <br>
![alt text](<img/Screenshot Output percobaan 2.png>)
# 2.2.3 Pertanyaan
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai! <br>
Jawab : program tidak memiliki kesalahan, hasil kompilasi benar saat dilakukan verifikasi. <br>
2. Apa jenis graph yang digunakan pada Percobaan 2? <br>
Jawab : kode program diatas merupakan directed weighted graph yang direpresentasikan menggunakan adjancency matrix. Menggunakan directed graph karena edge dibuat satu arah pada method makeEdge. Weighted graph karena ada bobot pada setiap edge yang ditambahkan. <br>
3. Apa maksud dari dua baris kode berikut?
```java
gdg.makeEdge(1, 2, 70);
gdg.makeEdge(2, 1, 80);
```
Jawab : Dua baris kode ini membuat dua edge berbeda antara vertex 1 dan vertex 2 dengan jarak yang berbeda. Edge pertama menghubungkan vertex 1 ke vertex 2 dengan jarak 70, sedangkan edge kedua menghubungkan vertex 2 ke vertex 1 dengan jarak 80. <br>
4. Modifikasi kode program sehingga terdapat method untuk menghitung degree, termasuk inDegree dan outDegree! <br>
Jawab :
```java
public int inDegree(int vertex) {
        int inDegree = 0;
        for (int i = 0; i < this.vertex; i++) {
            if (matriks[i][vertex] != -1) {
                inDegree++;
            }
        }
        return inDegree;
    }


    public int outDegree(int vertex) {
        int outDegree = 0;
        for (int i = 0; i < this.vertex; i++) {
            if (matriks[vertex][i] != -1) {
                outDegree++;
            }
        }
        return outDegree;
    }

    
    public int degree(int vertex) {
        return inDegree(vertex) + outDegree(vertex);
    }
}
```
#
# Latihan Praktikum
1. Modifikasi kode program pada class GraphMain sehingga terdapat menu program yang bersifat dinamis, setidaknya terdiri dari: <br>
a) Add Edge <br>
b) Remove Edge <br>
c) Degree <br>
d) Print Graph <br>
e) Cek Edge <br>
Pengguna dapat memilih menu program melalui input Scanner <br>
Jawab : 
```java
package Praktikum15.Kode;

import java.util.Scanner;

public class GraphMain07 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah gedung: ");
        int jumlahGedung = scanner.nextInt();

        Graph07 gedung = new Graph07(jumlahGedung);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu Program:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Check Edge");
            System.out.println("6. Exit");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan gedung asal: ");
                    int asalAdd = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanAdd = scanner.nextInt();
                    System.out.print("Masukkan bobot edge: ");
                    int bobotAdd = scanner.nextInt();
                    gedung.addEdge(asalAdd, tujuanAdd, bobotAdd);
                    break;
                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    int asalRemove = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanRemove = scanner.nextInt();
                    gedung.removeEdge(asalRemove, tujuanRemove);
                    break;
                case 3:
                    System.out.print("Masukkan gedung: ");
                    int gedungDegree = scanner.nextInt();
                    gedung.degree(gedungDegree);
                    break;
                case 4:
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan gedung asal: ");
                    int asalCheck = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanCheck = scanner.nextInt();
                    boolean tetangga = gedung.tetangga(asalCheck, tujuanCheck);
                    char gedungAsal = (char) ('A' + asalCheck);
                    char gedungTujuan = (char) ('A' + tujuanCheck);
                    if (tetangga) {
                        System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " bertetangga");
                    } else {
                        System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " tidak bertetangga");
                    }
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();

        // graphMatriks11 gdg = new graphMatriks11(4);
        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // gdg.printGraph();
        // System.out.println("Hasil setelah penghapusan edge");
        // gdg.removeEdge(2, 1);
        // gdg.printGraph();
        // System.out.println();
        // for (int i = 0; i < 4; i++) {
        //     System.out.print("Gedung " + (char) ('A' + i) + ":");
        //     System.out.print("In-degree: " + gdg.inDegree(i));
        //     System.out.print("Out-degree: " + gdg.outDegree(i));
        //     System.out.print("Degree: " + gdg.degree(i));
        //     System.out.println();
        // }
    }
}
```
2. Tambahkan method updateJarak pada Percobaan 1 yang digunakan untuk mengubah jarak antara dua node asal dan tujuan! <br>
Jawab :
```java
public void updateJarak(int asal, int tujuan, int jarakBaru) {
        try {
            int index = -1;
            // Mencari index tujuan di dalam list[asal]
            for (int i = 0; i < list[asal].size(); i++) {
                if (list[asal].get(i) == tujuan) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                // Update jarak
                list[asal].setJarak(index, jarakBaru);
                System.out.println("Jarak antara Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan)
                        + " berhasil diupdate menjadi " + jarakBaru + " m");
            } else {
                System.out.println(
                        "Gedung " + (char) ('A' + asal) + " tidak terhubung dengan Gedung " + (char) ('A' + tujuan));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
```
3. Tambahkan method hitungEdge untuk menghitung banyaknya edge yang terdapat di dalam graf <br>
Jawab :
```java
public int hitungEdge() {
        int totalEdge = 0;
        for (int i = 0; i < vertex; i++) {
            totalEdge += list[i].size();
        }
        return totalEdge;
    }
```