#
# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA 3 </p>

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
# Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan
Kode Program 
```  java
package Pertemuan3.Kode;

    public class PersegiPanjang07 {
        public int panjang;
        public int lebar;
}
```
```java
package Pertemuan3.Kode;
public class ArrayObjects07 {
    
    public static void main(String[] args) {
        PersegiPanjang07[] ppArray = new PersegiPanjang07[3];

        ppArray[0] = new PersegiPanjang07();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;

        ppArray[1] = new PersegiPanjang07();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;

        ppArray[2] = new PersegiPanjang07();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;

        System.out.println("Persegi Panjang ke-0, panjang : " + ppArray[0].panjang + ", lebar : " + ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-1, panjang : " + ppArray[1].panjang + ", lebar : " + ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-2, panjang : " + ppArray[2].panjang + ", lebar : " + ppArray[2].lebar);
    }  
}  
```
Output<br> ![alt text](<img/Screenshot Output PersegiPanjang.png>) <br>
# Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method?Jelaskan! <br>
Jawab : Tidak, jika saat membuat array object, class yang digunakan tidak harus selalu memiliki atribut dan method. dan dapat membuat array object menggunakan class sederhana tanpa atribut atau method apapun.<br>
2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan 
konstruktur pada baris program berikut : 

```java
ppArray[1] = new PersegiPanjang(); 
```
Jawab : Tidak, pemanggilan konstruktor pada baris ppArray[1] = new PersegiPanjang(); adalah pemanggilan konstruktor default yang dibuat secara otomatis oleh java. <br>

3. Apa yang dimaksud dengan kode berikut ini: <br>
```java
PersegiPanjang[] ppArray = new PersegiPanjang[3];
```
Jawab : Kode tersebut instansiasi sebuah array dengan nama ppArray yang berisi objek dari class PersegiPanjang. Array ini memiliki 3 elemen.<br>

4. Apa yang dimaksud dengan kode berikut ini: <br>
```java
        ppArray[1] = new PersegiPanjang();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;
```
<br>
Jawab : Kode tersebut membuat sebuah array ppArray yang berisi objek PersegiPanjang. Kemudian, indeks ke-1 dari array tersebut diinisialisasi dengan objek PersegiPanjang baru, dengan panjang 80 dan lebar 40.<br>

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?<br>
Jawab : Pemisahan class ArrayObjects dan class PersegiPanjang berguna agar kode dapat dikelola dengan lebih baik dan mudah.
#
# Percobaan 2: Menerima Input Isian Array Menggunakan Looping
Kode Program 
 ``` java
package Pertemuan3.Kode;
import java.util.Scanner;
public class ArrayObjects07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang07[] ppArray = new PersegiPanjang07[3];

        for(int i = 0; i < 3; i++) {           
            ppArray[i] = new PersegiPanjang07();
            System.out.println("Persegi Panjang ke-" + i );
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }
        for(int i = 0; i < 3; i++){
            System.out.println("Persegi Panjang ke-" + i );
            System.out.println("Panjang : " + ppArray[i].panjang +  ", " + " Lebar : " + ppArray[i].lebar);
        }
    }
}  
```
Output<br> ![alt text](<img/Screenshot Output percobaan 2.png>) <br>
#  Pertanyaan 
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi? <br>
Jawab : Ya, array of object dapat diimplementasikan dalam array 2 Dimensi.<br>

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!<br>
Jawab : 
```java
package Pertemuan3.Kode;
public class ArrayObjects07 {
    public static void main(String[] args) {
        PersegiPanjang07[][] array2D = new PersegiPanjang07[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array2D[i][j] = new PersegiPanjang07();
                array2D[i][j].panjang = (j + 1) * 15;
                array2D[i][j].lebar = (i + 2) * 7;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Persegi Panjang[" + i + "][" + j + "]: Panjang = " + array2D[i][j].panjang
                        + ", Lebar = " + array2D[i][j].lebar);
            }
        }
    }
}
```
3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode 
dibawah ini akan memunculkan error saat dijalankan. Mengapa? <br>
```java
Persegi[] pgArray = Persegi (100);
PgArray[5].sisi = 20;
```
Jawab : Kode dibawah akan error karena kode tersebut butuh kode pgArray[5] = new Persegi(); diatas kode pgArray[5].sisi = 20 dan dibawah kode Persegi[] pgArray = new Persegi[100]. <br>
Berikut adalah cara yang benar untuk melakukan inisialisasi array dan mengatur nilai sisi untuk objek di dalamnya :
```java
Persegi[] pgArray = new Persegi[100];
pgArray[5] = new Persegi();
pgArray[5].sisi = 20;
```
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner! <br>
Jawab :
```java
package Pertemuan3.Kode;
import java.util.Scanner;
public class ArrayObjects07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah persegi panjang: ");
        int length = sc.nextInt();
        PersegiPanjang07[] ppArray = new PersegiPanjang07[length];

        for(int i = 0; i < length; i++) {           
            ppArray[i] = new PersegiPanjang07();
            System.out.println("Persegi Panjang ke-" + i );
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }
        for(int i = 0; i < length; i++){
            System.out.println("Persegi Panjang ke-" + i );
            System.out.println("Panjang : " + ppArray[i].panjang + ", " + " Lebar : " + ppArray[i].lebar);
        }
    }
}   
```
5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan 
pada ppArray[i] sekaligus ppArray[0]?Jelaskan! <br>
Jawab : Ya, boleh melakukan duplikasi instansiasi array objek pada dua indeks yang berbeda dalam array. namun tidak dianjurkan karena akan menimbulkan kebingungan, inefisiensi, dan ketidakkonsistenan data.
#
#  Percobaan 3: Penambahan Operasi Matematika di Dalam Method
kode Program<br>
``` java
package Pertemuan3.Kode;

public class Balok07 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok07(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume()  
    {  
        return panjang * lebar * tinggi;
    }
}
```
``` java
package Pertemuan3.Kode;

public class ArrayBalok07 {
    public static void main(String[] args) {
        Balok07[] blArray = new Balok07[3];
        
        blArray[0] = new Balok07(100, 30, 12);
        blArray[1] = new Balok07(120, 40, 15);
        blArray[2] = new Balok07(210, 50, 25);

        for(int i = 0; i < 3; i++){
            System.out.println("Volume balok ke-" + i + " : " + blArray[i].hitungVolume());
        }
    }
}
```
Output <br> ![alt text](<img/Screenshot Output Percobaan 3.png>) <br>
#  Pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh! <br>
Jawab : Ya, sebuah kelas dapat memiliki lebih dari satu konstruktor, dengan asumsi bahwa setiap konstruktor memiliki parameter yang berbeda. Ini disebut sebagai "overloading" konstruktor.
```java
class PersegiPanjang {

    private int panjang;
    private int lebar;

    public PersegiPanjang() {
        this.panjang = 0;
        this.lebar = 0;
    }

    public PersegiPanjang(int panjang) {
        this.panjang = panjang;
        this.lebar = 0;
    }

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
}
```
2. Jika diketahui terdapat class Segitiga seperti berikut ini:
```java
public class Segitiga {
    public int alas;
    public int tinggi;
}
```
Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t
yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.<br>
Jawab : 
```java
public class Segitiga07 {
    public int alas;
    public int tinggi;

    public Segitiga07(int a, int t) {
        this.alas = a;
        this.tinggi = t;
    }
}
```
<br>

3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan 
library Math pada Java untuk mengkalkulasi sisi miring)<br>
Jawab :
```java
package Pertemuan3.Kode;
import java.lang.Math;

public class Segitiga07 {
    public int alas;
    public int tinggi;

    public Segitiga07(int a, int t) {
        this.alas = a;
        this.tinggi = t;
    }

    public double hitungLuas() {
        return 0.5 * this.alas * this.tinggi;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt((this.alas * this.alas) + (this.tinggi * this.tinggi));
        return this.alas + this.tinggi + sisiMiring;
    }
}
```
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing <br>
atributnya sebagai berikut: <br>
sgArray ke-0 alas: 10, tinggi: 4 <br>
sgArray ke-1 alas: 20, tinggi: 10 <br>
sgArray ke-2 alas: 15, tinggi: 6 <br>
sgArray ke-3 alas: 25, tinggi: 10 <br>
Jawab :
```java
package Pertemuan3.Kode;

public class SegitigaMain07 {
    public static void main(String[] args) {
        Segitiga07[] sgArray = new Segitiga07[4];

        sgArray[0] = new Segitiga07(10, 4);
        sgArray[1] = new Segitiga07(20, 10);
        sgArray[2] = new Segitiga07(15, 6);
        sgArray[3] = new Segitiga07(25, 10);
    }
}
```
<br>

5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling(). <br>
Jawab : <br>
Kode Program 
```java
package Pertemuan3.Kode;
public class SegitigaMain07 {
    public static void main(String[] args) {
        Segitiga07[] sgArray = new Segitiga07[4];

        sgArray[0] = new Segitiga07(10, 4);
        sgArray[1] = new Segitiga07(20, 10);
        sgArray[2] = new Segitiga07(15, 6);
        sgArray[3] = new Segitiga07(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga ke-" + i);
            System.out.printf("Luas : " + "%.2f\n",sgArray[i].hitungLuas());
            System.out.printf("Keliling : " + "%.2f\n",sgArray[i].hitungKeliling());
            System.out.println(); 
        }
    }
}
```
Output <br> ![alt text](<img/Screenshot Output Segitiga.png>)
#
# Latihan Praktikum
1. Buatlah program yang dapat menghitung luas permukaan dan volume bangun ruang kerucut, limas segi empat sama sisi, dan bola. Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun ruang. Buatlah satu main class untuk membuat array of objects yang menginputkan atribut-atribut yang ada menggunakan konstruktor semua bangun ruang tersebut. Dengan ketentuan, <br>
a. Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan luas permukaan dan volume dari tiap jenis bangun ruang tersebut.<br>
b. Pada kerucut, inputan untuk atribut hanya jari-jari dan sisi miring <br>
c. Pada limas segi empat sama sisi, inputan untuk atribut hanya panjang sisi alas dan tinggi limas <br>
d. Pada bola, inpuntan untuk atribut hanya jari-jari <br>
Jawab : <br>
Kode Program Kerucut
```java
package Pertemuan3.Kode;

public class Kerucut07 {
    public double jariJari;
    public double sisiMiring;

    public Kerucut07(double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * sisiMiring;
    }
}
```
Kode Program Limas Segi Empat
```java
package Pertemuan3.Kode;

public class LimasSegiEmpat07 {
    public double sisiAlas;
    public double tinggi;

    public LimasSegiEmpat07(double sisiAlas, double tinggi) {
        this.sisiAlas = sisiAlas;
        this.tinggi = tinggi;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = sisiAlas * sisiAlas;
        double luasSegitiga = (sisiAlas * tinggi) / 2;
        return luasAlas + 4 * luasSegitiga;
    }

    public double hitungVolume() {
        return (sisiAlas * sisiAlas * tinggi) / 3;
    }
}
```
Kode Program Class Bola
```java
package Pertemuan3.Kode;

public class Bola07 {
    public double jariJari;

    public Bola07(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }
}
```
```java
package Pertemuan3.Kode;
import java.util.Scanner;

public class BangunRuangMain07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Kerucut : ");
        int jumlahKerucut = sc.nextInt();
        Kerucut07[] kerucutArray = new Kerucut07[jumlahKerucut];

        System.out.print("Masukkan Jumlah Limas Segi Empat : ");
        int jumlahLimasSegiEmpat = sc.nextInt();
        LimasSegiEmpat07[] limasSegiEmpatArray = new LimasSegiEmpat07[jumlahLimasSegiEmpat];

        System.out.print("Masukkan Jumlah Bola : ");
        int jumlahBola = sc.nextInt();
        Bola07[] bolaArray = new Bola07[jumlahBola];

        for (int i = 0; i < jumlahKerucut; i++) {
            System.out.println();
            System.out.println("Atribut Kerucut Ke-" + (i + 1));
            System.out.print("Masukkan Jari-Jari : ");
            int jariJari = sc.nextInt();
            System.out.print("Masukkan Sisi Miring : ");
            int sisiMiring = sc.nextInt();
            kerucutArray[i] = new Kerucut07(jariJari, sisiMiring);
        }

        for (int i = 0; i < jumlahLimasSegiEmpat; i++) {
            System.out.println();
            System.out.println("Atribut Limas Segi Empat Ke-" + (i + 1));
            System.out.print("Masukkan Panjang Alas : ");
            int panjangSisiAlas = sc.nextInt();
            System.out.print("Masukkan Tinggi : ");
            int tinggi = sc.nextInt();
            limasSegiEmpatArray[i] = new LimasSegiEmpat07(panjangSisiAlas, tinggi);
        }

        for (int i = 0; i < jumlahBola; i++) {
            System.out.println();
            System.out.println("Atribut Bola Ke-" + (i + 1));
            System.out.print("Masukkan Jari-Jari : ");
            int jariJariBola = sc.nextInt();
            bolaArray[i] = new Bola07(jariJariBola);
        }

        System.out.println("\nHasil Perhitungan Kerucut :");
        for (int i = 0; i < jumlahKerucut; i++) {
            System.out.println("Kerucut Ke-" + (i + 1));
            System.out.printf("Luas Kerucut : %.2f\n", kerucutArray[i].hitungLuas());
            System.out.printf("Volume Kerucut : %.2f\n", kerucutArray[i].hitungVolume());
            System.out.println();
        }

        System.out.println("\nHasil Perhitungan Limas Segi Empat :");
        for (int i = 0; i < jumlahLimasSegiEmpat; i++) {
            System.out.println("Limas Segi Empat Ke-" + (i + 1));
            System.out.printf("Luas Limas Segi Empat : %.2f\n", limasSegiEmpatArray[i].hitungLuasPermukaan());
            System.out.printf("Volume Limas Segi Empat : %.2f\n", limasSegiEmpatArray[i].hitungVolume());
            System.out.println();
        }

        System.out.println("\nHasil Perhitungan Bola:");
        for (int i = 0; i < jumlahBola; i++) {
            System.out.println("Bola Ke-" + (i + 1));
            System.out.printf("Luas Bola : %.2f\n", bolaArray[i].hitungLuasPermukaan());
            System.out.printf("Volume Bola : %.2f\n", bolaArray[i].hitungVolume());
            System.out.println();
        }
    }
}
```
Output <br>
![alt text](<img/Screenshot Output Bangun Ruang 2.png>)
![alt text](<img/Screenshot Output Bangun Ruang 1.png>)
<br>

2. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika dimisalkan terdapat 3 data mahasiswa yang tersedia. <br>
Contoh output program: <br> 
Masukkan data mahasiswa ke- 1 <br>
Masukkan nama :Rina <br>
Masukkan nim :1234567 <br>
Masukkan jenis kelamin :P <br>
Masukkan IPK :3.5 <br>
Masukkan data mahasiswa ke- 2 <br>
Masukkan nama :Rio <br>
Masukkan nim :7654321 <br>
Masukkan jenis kelamin :L <br>
Masukkan IPK :4.0 <br>
Masukkan data mahasiswa ke- 3 <br>
Masukkan nama :Reza <br>
Masukkan nim :8765398 <br>
Masukkan jenis kelamin :L <br>
Masukkan IPK :3.8 <br>
Data Mahasiswa ke-1 <br>
nama : Rina <br>
nim : 1234567 <br>
Jenis kelamin : P <br>
Nilai IPK : 3.5 <br>
Data Mahasiswa ke-2 <br>
nama : Rio <br>
nim : 7654321 <br>
Jenis kelamin : L <br>
Nilai IPK : 4.0 <br>
Data Mahasiswa ke-3 <br>
nama : Reza <br>
nim : 8765398 <br>
Jenis kelamin : L <br>
Nilai IPK : 3.8 <br>
Jawab : <br>
Kode Program Class
```java
package Pertemuan3.Kode;
public class InformasiMahasiswa07 {
    
    public String nama, nim, jenisKelamin;
    public double ipk;
  
    public InformasiMahasiswa07(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
}
```
Kode Program Main
```java
package Pertemuan3.Kode;
import java.util.Scanner;

public class InformasiMahasiswaMain07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InformasiMahasiswa07[] mahasiswa = new InformasiMahasiswa07[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan nim : ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin : ");
            String jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mahasiswa[i] = new InformasiMahasiswa07(nama, nim, jenisKelamin, ipk);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama : " + mahasiswa[i].nama);
            System.out.println("NIM : " + mahasiswa[i].nim);
            System.out.println("Jenis Kelamin : " + mahasiswa[i].jenisKelamin);
            System.out.println("IPK : " + mahasiswa[i].ipk);
        }
    }
}
```
Output <br>
![alt text](<img/Screenshot Output Informasi Mahasiswa.png>)
<br>

3. Modifikasi program Latihan no.2 di atas, sehingga bisa digunakan untuk menghitung rata-rata IPK, serta menampilkan data mahasiswa dengan IPK terbesar! (gunakan method untuk masing-masing proses tersebut)
Jawab : <br>
Kode Program Class
```java
package Pertemuan3.Kode;
public class InformasiMahasiswa07 {
    
    public String nama, nim, jenisKelamin;
    public double ipk;
  
    public InformasiMahasiswa07(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
  
    public static InformasiMahasiswa07 mahasiswaTerbaik(InformasiMahasiswa07[] mhs) {
        InformasiMahasiswa07 terbaik = mhs[0];
        for (InformasiMahasiswa07 mahasiswa : mhs) {
            if (mahasiswa.ipk > terbaik.ipk) {
            terbaik = mahasiswa;
        }
    }
    
    return terbaik;
    }
  
    public static double hitungRataIPK(InformasiMahasiswa07[] mhs) {
        double totalIPK = 0;
        for (InformasiMahasiswa07 mahasiswa : mhs) {
            totalIPK += mahasiswa.ipk;
        }
        return totalIPK / mhs.length;
    }
}  
```
Kode Program Main
```java
package Pertemuan3.Kode;
import java.util.Scanner;

public class InformasiMahasiswaMain07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        InformasiMahasiswa07[] mahasiswa = new InformasiMahasiswa07[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan nim : ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Jenis Kelamin : ");
            String jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            mahasiswa[i] = new InformasiMahasiswa07(nama, nim, jenisKelamin, ipk);
        }
        
        double rataIPK = InformasiMahasiswa07.hitungRataIPK(mahasiswa);

        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama : " + mahasiswa[i].nama);
            System.out.println("NIM : " + mahasiswa[i].nim);
            System.out.println("Jenis Kelamin : " + mahasiswa[i].jenisKelamin);
            System.out.println("IPK : " + mahasiswa[i].ipk);
        }
        
        System.out.println();
        System.out.printf("Rata-rata IPK : " + "%.2f", rataIPK);

        InformasiMahasiswa07 terbaik = InformasiMahasiswa07.mahasiswaTerbaik(mahasiswa);

        System.out.println();
        System.out.println("Mahasiswa dengan IPK terbesar :");
        System.out.println("Nama : " + terbaik.nama);
        System.out.println("NIM : " + terbaik.nim);
        System.out.println("Jenis Kelamin : " + terbaik.jenisKelamin);
        System.out.println("IPK : " + terbaik.ipk);
    }
}  
```
Output <br>
![alt text](<img/Screenshot Output Informasi Mahasiswa modif.png>)