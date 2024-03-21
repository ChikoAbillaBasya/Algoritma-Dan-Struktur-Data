#
# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA 5 </p>

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
# Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer 

Kode Program Class
```java
package Pertemuan5;

public class Faktorial07 {
    public int nilai;

    int faktorialBF(int n ) {
        int fakto = 1;
        for(int i = 1; i <= n; i++) {
            fakto = fakto * 1;
        }
        return fakto;
    }
    int faktorialDC(int n) {
        if(n==1) {
            return 1;
        }
        else{
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}
```
Kode Program Main
```java
package Pertemuan5;

import java.util.Scanner;

public class FaktorialMain07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("Masukkan jumlah elemen :");
        int ijml = sc.nextInt();

        Faktorial07[] fk = new Faktorial07[10];
        for(int i=0; i < ijml; i++) {
            fk[i] = new Faktorial07();
            System.out.println("Masukkan nilai data ke-" + (i+1) + " :");
            fk[i].nilai = sc.nextInt(); 
        }
        System.out.println("HASIL - BRUTE FORCE");
        for(int i=0; i < ijml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for(int i=0; i < ijml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
``` 
Output <br>
![alt text](<img/Screenshot Output Faktorial.png>)
# Pertanyaan 
1.	Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else! <br>
Jawab :<br> 
-Pada penggunaan if, nilai input n sudah mencapai 1, maka langsung mengembalikan nilai 1 sebagai nilai faktorialnya. <br>
-Pada penggunaan else, jika nilai n belum mencapai 1, maka perhitungan faktorial dengan cara rekursif yaitu mengalikan nilai n dengan pemanggilan fungsi faktorialDC untuk n-1.
2.	Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for?Buktikan! <br> 
Jawab : Ya, bisa mengganti perulangan for menggunakan perulangan lain seperti while dibawah ini.
```java
int faktorialBF(int n) {
    int fakto = 1;
    int i = 1;
    while (i <= n) {
        fakto = fakto * i;
        i++;
    }
    return fakto;
}
```
3.	Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); ! <br>
Jawab : fakto *= i; digunakan untuk mengakumulasi hasil perkalian iteratif, sedangkan int fakto = n * faktorialDC(n-1); adalah pendekatan rekursif di mana nilai faktorial dari n dihitung dengan cara mengalikan n dengan faktorial dari n-1.
#
# Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer 
Kode Program Class
```java
package Pertemuan5.Kode;

public class Pangkat {
    public int nilai, pangkat;   

    int pangkatBF(int a, int n) {
        int hasil = 1;
        for(int i=0; i<n;i++) {
            hasil *= a;
        }
        return hasil;
    }
    int pangkatDC(int a, int n) {
        if(n==0) {
            return 1;
        }else{
            if(n%2==1) // bilangan ganjil
            {
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
            }else{
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
            }
        }
    }
}
```
Kode Program Main
```java
package Pertemuan5.Kode;

import java.util.Scanner;

public class PangkatMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Masukkan jumlah elemen yang dihitung :");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for(int i=0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.println("Masukkan nilai yang hendak dipangkatkan : ");
            png[i].nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat : ");
            png[i].pangkat = sc.nextInt();
        }
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for(int i=0; i< elemen;i++) {
            System.out.println("Hasil dari "
                        + png[i].nilai+ " pangkat "
                        + png[i].pangkat+ " adalah "
                        + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for(int i=0; i< elemen;i++) {
            System.out.println("Hasil dari "
                        + png[i].nilai+ " pangkat "
                        + png[i].pangkat+ " adalah "
                        + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
```
Output <br>
![alt text](<img/Screenshot Output Pangkat.png>)

# Pertanyaan 
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()! <br>
Jawab : Pada method PangkatBF() menggunakan algoritma brute force untuk menghitung pangkat suatu bilangan dengan melakukan perkalian berulang sebanyak n. Sedangkan method pada PangkatDC() menggunakan algoritma divide and conquer yang membagi tiap bagian pangkat kemudian di hitung per bagian dan pada akhirnya di combine.
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan! <br>
Jawab : Ya, tahap combine terjadi ketika hasil dari dua penggunaan rekursif pangkatDC(a, n/2) dikalikan. Jika n adalah bilangan ganjil maka hasil tersebut juka dikalikan dengan a.
```java
if(n%2==1) // bilangan ganjil
{
    return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
}else{
    return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
}
```
3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor. <br>
Jawab :
```java
package Pertemuan5.Kode;

public class Pangkat {
    public int nilai, pangkat;

    public Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF(int a, int n) {
        int hasil = 1;
        for(int i=0; i<n;i++) {
            hasil *= a;
        }
        return hasil;
    }
    
    int pangkatDC(int a, int n) {
        if(n==0) {
            return 1;
        }else{
            if(n%2==1) // bilangan ganjil
            {
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
            }else{
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
            }
        }
    }
}
```
```java
package Pertemuan5.Kode;

import java.util.Scanner;

public class PangkatMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Masukkan jumlah elemen yang dihitung :");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for(int i=0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan : ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for(int i=0; i< elemen;i++) {
            System.out.println("Hasil dari "
                        + png[i].nilai+ " pangkat "
                        + png[i].pangkat+ " adalah "
                        + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for(int i=0; i< elemen;i++) {
            System.out.println("Hasil dari "
                        + png[i].nilai+ " pangkat "
                        + png[i].pangkat+ " adalah "
                        + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
    }
}
```
4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan switch-case! <br>
Jawab :
```java
package Pertemuan5.Kode;

import java.util.Scanner;

public class PangkatMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Masukkan jumlah elemen yang dihitung :");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for(int i=0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan : ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("=====================================");
        System.out.println("Pilih metode perhitungan pangkat :");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Pilihan : ");
        int menu = sc.nextInt();

        switch(menu) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for(int i=0; i< elemen;i++) {
                    System.out.println("Hasil dari "
                                        + png[i].nilai+ " pangkat "
                                        + png[i].pangkat+ " adalah "
                                        + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for(int i=0; i< elemen;i++) {
                    System.out.println("Hasil dari "
                                        + png[i].nilai+ " pangkat "
                                        + png[i].pangkat+ " adalah "
                                        + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
```
#
# Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer 
Kode Program Class
```java
package Pertemuan5.Kode;

public class Sum07 {
    int elemen;
    double keuntungan[], total;

    Sum07(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }
}
```
Kode Program Main
```java
package Pertemuan5.Kode;

import java.util.Scanner;

public class SumMain07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();

        Sum07 sm = new Sum07(elm);
        System.out.println("================================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke - " + (i + 1) + " = ");
            sm.keuntungan[i] = sc.nextDouble();
        }
            System.out.println("================================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println(
                    "Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah " + sm.totalBF(sm.keuntungan));
            System.out.println("================================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = "
                    + "%.2f", sm.totalDC (sm.keuntungan, 0, sm.elemen - 1));
        sc.close();
    }
}
```
Output <br>
![alt text](<img/Screenshot Output Sum.png>)
# Pertanyaan 
1.	Mengapa terdapat formulasi return value berikut?Jelaskan! 
```java
return lsum+rsum+arr[mid];
```
Jawab : return lsum+rsum+arr[mid]; digunakan untuk menambahkan hasil penjumlahan dari lsum, rsum, dan nilai elemen array arr pada posisi mid di bagian kiri (lsum), bagian kanan (rsum), dan elemen tengah (arr[mid]). <br>
2.	Kenapa dibutuhkan variable mid pada method TotalDC()? <br>
Jawab : untuk membagi array menjadi dua bagian secara rekursif sehingga total dapat dihitung. <br>
3.	Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan program! <br>
Jawab : <br>
Kode Program Class
```java
package Pertemuan5.Kode;

public class Sum07 {
    int elemen;
    double keuntungan[][], total[];

    Sum07(int perusahaan, int bulan) {
        this.elemen = bulan;
        this.keuntungan = new double[perusahaan][bulan];
        this.total = new double[perusahaan];
    }

    double totalBF(double arr[], int noPerusahaan) {
        for (int i = 0; i < elemen; i++) {
            total[noPerusahaan] = total[noPerusahaan] + arr[i];
        }
        return total[noPerusahaan];
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum;
        }
        return 0;
    }
}
```
Kode Program Main
```java
package Pertemuan5.Kode;

import java.util.Scanner;

public class SumMain07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.print("Masukkan banyaknya perusahaan : ");
        int perusahaan = sc.nextInt();
        System.out.print("Masukkan jumlah bulan : ");
        int bulan = sc.nextInt();

        Sum07 sm = new Sum07(perusahaan, bulan);
        System.out.println("============================================================");
        for (int i = 0; i < perusahaan; i++) {
            for (int j = 0; j < sm.elemen; j++) {
                System.out.print("Masukkan keuntungan perusahaan ke - " + (i + 1) + " bulan ke - " + (j + 1) + " : ");
                sm.keuntungan[i][j] = sc.nextDouble();
            }
        }

        System.out.println("============================================================");
        System.out.println("Algoritma Brute Force");
        for (int k = 0; k < perusahaan; k++) {
            System.out.printf(
                    "Total keuntungan perusahaan " + (k + 1) + " selama " + sm.elemen + " bulan adalah = "
                            + "%.2f\n", sm.totalBF(sm.keuntungan[k], k));
        }

        System.out.println("============================================================");
        System.out.println("Algoritma Divide Conquer");
        for (int i = 0; i < perusahaan; i++) {
            System.out.printf("Total keuntungan perusahaan " + (i + 1) + " selama " + sm.elemen + " bulan adalah = "
                    + "%.2f\n", sm.totalDC (sm.keuntungan[i], 0, sm.elemen - 1));
        }
    }
}
```
Output <br>
![alt text](<img/Screenshot Output Perusahaan.png>)
#
# Latihan Praktikum 
1. Sebuah showroom memiliki daftar mobil dengan data sesuai tabel di bawah ini 
![alt text](<img/Screenshot Soal Latihan.png>) <br>
Tentukan: <br> 
a.)	top_acceleration tertinggi menggunakan Divide and Conquer! <br>
b.)	top_acceleration terendah menggunakan Divide and Conquer! <br>
c.)	Rata-rata top_power dari seluruh mobil menggunakan Brute Force! <br>
Jawab : <br>
Kode Program Class
```java
package Pertemuan5.Kode;

public class Car07 {
    String merk;
    String tipe;
    int tahun;
    int topAcceleration;
    int topPower;

    public Car07(String merk, String tipe, int tahun, int topAcceleration, int topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

    int MaxTopAcceleration(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            int leftMax = MaxTopAcceleration(arr, l, mid);
            int rightMax = MaxTopAcceleration(arr, mid + 1, r);
            return Math.max(leftMax, rightMax);
        }
        return 0;
    }

    int MinTopAcceleration(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            int leftMin = MinTopAcceleration(arr, l, mid);
            int rightMin = MinTopAcceleration(arr, mid + 1, r);
            return Math.min(leftMin, rightMin);
        }
        return 0;
    }

    double ratatopPower(double arr[]) {
        double totalPower = 0;
        for (int i = 0; i < arr.length; i++) {
            totalPower += arr[i];
        }
        return totalPower / arr.length;
    }
}
```
Kode Program Main
```java
package Pertemuan5.Kode;

public class CarMain07 {

    public static void main(String[] args) {
        Car07[] arr = {
                new Car07("BMW", "M2 Coupe", 2016, 6816, 728),
                new Car07("Ford", "Fiesta ST", 2014, 3921, 575),
                new Car07("Nissan", "370Z", 2009, 4360, 657),
                new Car07("Subaru", "BRZ", 2014, 4058, 609),
                new Car07("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Car07("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Car07("Toyota", "86/GT86", 2014, 4180, 609),
                new Car07("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        int[] topAccelerationArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            topAccelerationArray[i] = arr[i].topAcceleration;
        }

        int maxTopAcceleration = arr[0].MaxTopAcceleration(topAccelerationArray, 0, arr.length - 1);
        System.out.println("Top Acceleration tertinggi : " + maxTopAcceleration);
        
        int minTopAcceleration = arr[0].MinTopAcceleration(topAccelerationArray, 0, arr.length - 1);
        System.out.println("Top Acceleration terendah  : " + minTopAcceleration);

        double[] topPowerArray = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            topPowerArray[i] = arr[i].topPower;
        }
        double rataratatopPower = arr[0].ratatopPower(topPowerArray);
        System.out.println("Rata-rata top power        : " + rataratatopPower);
    }
}
```
Output <br>
![alt text](<img/Screenshot Output Latihan.png>)