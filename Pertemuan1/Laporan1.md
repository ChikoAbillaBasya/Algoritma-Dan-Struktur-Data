#
# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA 1 </p>

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
# Praktikum Pemilihan
Kode Program 
```  java
import java.util.Scanner;

public class Pemilihan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();

        System.out.print("Masukkan Nilai Kuis : ");
        int kuis = sc.nextInt();

        System.out.print("Masukkan Nilai UTS  : ");
        int uts = sc.nextInt();

        System.out.print("Masukkan Nilai UAS  : ");
        int uas = sc.nextInt();

        if (0 <= tugas && tugas <= 100 && 0 <= kuis && kuis <= 100 && 0 <= uts && uts <= 100 && 0 <= uas && uas <= 100) {
            double nilaiAkhir = hitungNilaiAkhir(tugas, kuis, uts, uas);
            String nilaiHuruf = konversiNilaiHuruf(nilaiAkhir);
            String keterangan = (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("SELAMAT ANDA " + keterangan);
        } else {
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Nilai tidak valid");
            System.out.println("==============================");
            System.out.println("==============================");
        }
    }

    public static double hitungNilaiAkhir(int tugas, int kuis, int uts, int uas) {
        return (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

    }

    public static String konversiNilaiHuruf(double nilaiAkhir) {
        System.out.println("==============================");
        System.out.println("==============================");
        if (nilaiAkhir <= 100 && nilaiAkhir >= 80) {
            return "A";
        } else if (nilaiAkhir <= 80 && nilaiAkhir >= 73) {
            return "B+";
        } else if (nilaiAkhir <= 73 && nilaiAkhir >= 65) {
            return "B";
        } else if (nilaiAkhir <= 65 && nilaiAkhir >= 60) {
            return "C+";
        } else if (nilaiAkhir <= 60 && nilaiAkhir >= 50) {
            return "C";
        } else if (nilaiAkhir <= 50 && nilaiAkhir >= 39) {
            return "E";
        } else {
            return "TIDAK LULUS";
        }
    }
}
```
Output Valid <br> ![alt text](<img/Screenshot Output Pemilihan Valid  (2).png>) <br>
Output Tidak Valid<br> ![alt text](<img/Screenshot Output Pemilihan Tidak Valid  (1).png>) <br>
#
# Praktikum Perulangan
Kode Program
 ``` java
import java.util.Scanner;

public class Pemilihan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();

        System.out.print("Masukkan Nilai Kuis : ");
        int kuis = sc.nextInt();

        System.out.print("Masukkan Nilai UTS  : ");
        int uts = sc.nextInt();

        System.out.print("Masukkan Nilai UAS  : ");
        int uas = sc.nextInt();

        if (0 <= tugas && tugas <= 100 && 0 <= kuis && kuis <= 100 && 0 <= uts && uts <= 100 && 0 <= uas && uas <= 100) {
            double nilaiAkhir = hitungNilaiAkhir(tugas, kuis, uts, uas);
            String nilaiHuruf = konversiNilaiHuruf(nilaiAkhir);
            String keterangan = (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("SELAMAT ANDA " + keterangan);
        } else {
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Nilai tidak valid");
            System.out.println("==============================");
            System.out.println("==============================");
        }
    }

    public static double hitungNilaiAkhir(int tugas, int kuis, int uts, int uas) {
        return (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

    }

    public static String konversiNilaiHuruf(double nilaiAkhir) {
        System.out.println("==============================");
        System.out.println("==============================");
        if (nilaiAkhir <= 100 && nilaiAkhir >= 80) {
            return "A";
        } else if (nilaiAkhir <= 80 && nilaiAkhir >= 73) {
            return "B+";
        } else if (nilaiAkhir <= 73 && nilaiAkhir >= 65) {
            return "B";
        } else if (nilaiAkhir <= 65 && nilaiAkhir >= 60) {
            return "C+";
        } else if (nilaiAkhir <= 60 && nilaiAkhir >= 50) {
            return "C";
        } else if (nilaiAkhir <= 50 && nilaiAkhir >= 39) {
            return "E";
        } else {
            return "TIDAK LULUS";
        }
    }
}
```
Output n = 12 <br> ![alt text](<img/Screenshot Output Perulangan 1.png>) <br>
Output n = 13 <br> ![alt text](<img/Screenshot Output Perulangan 2.png>) <br>
#
# Praktikum Array
Kode Program
``` java
import java.util.Scanner;

public class Array07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mataKuliah = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        double[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 };

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        double[] nilaiAngka = new double[mataKuliah.length];

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = input.nextDouble();
        }

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobotSks = 0;
        double totalSks = 0; 

        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf = konversiNilaiHuruf(nilaiAngka[i]);
            double bobotNilai = konversiNilaiSetara(nilaiAngka[i]);
            double bobotSks = bobotNilai * sks[i];
            totalBobotSks += bobotSks;
            totalSks += sks[i];
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf,
                    bobotNilai);
        }

        double ipSemester = totalBobotSks / totalSks;

        System.out.println("\nIP Semester Anda: " + String.format("%.2f", ipSemester));
    }

    public static String konversiNilaiHuruf(double nilaiAngka) {
        if (nilaiAngka >= 80) {
            return "A";
        } else if (nilaiAngka >= 75) {
            return "B+";
        } else if (nilaiAngka >= 65) {
            return "B";
        } else if (nilaiAngka >= 60) {
            return "C+";
        } else if (nilaiAngka >= 50) {
            return "C";
        } else if (nilaiAngka >= 40) {
            return "D";
        } else {
            return "E";
        }
    }

    public static double konversiNilaiSetara(double nilaiAngka) {
        if (nilaiAngka >= 80) {
            return 4;
        } else if (nilaiAngka >= 75) {
            return 3.5;
        } else if (nilaiAngka >= 65) {
            return 3;
        } else if (nilaiAngka >= 60) {
            return 2.5;
        } else if (nilaiAngka >= 50) {
            return 2;
        } else if (nilaiAngka >= 40) {
            return 1;
        } else {
            return 0;
        }
    }
}
```
Output 
![alt text](<img/Screenshot Output Array.png>) <br>
#
# Praktikum Fungsi
Kode Program
``` java
public class Fungsi07 {
    static int[][] stockBunga = {
            {1, 10, 5, 15, 7},
            {2, 6, 11, 9, 12},
            {3, 2, 10, 10, 5},
            {4, 5, 7, 12, 9}
    };

    static int[] hargaBunga = {75000, 50000, 60000, 10000}; 

    public static void tampilkanPendapatanPerCabang() {
        System.out.println("Pendapatan per Cabang Jika Semua Bunga Terjual :");
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 1; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga[j - 1]; 
            }
            System.out.println("Cabang Toko " + stockBunga[i][0] + ": Rp" + pendapatan);
        }
    }

    public static void tampilkanStockPerBungaRoyalGarden4() {
        System.out.println("\nJumlah Stock Setiap Jenis Bunga pada Cabang Royal Garden 4 :");
        int[] stockRoyalGarden4 = stockBunga[3];
        for (int i = 1; i < stockRoyalGarden4.length; i++) {
            System.out.println(NamaBunga(i) + "  : " + stockRoyalGarden4[i]);
        }
    }

    public static void kurangiStockBungaMati() {
        int[] stockBungaMati = {-1, -2, 0, -5}; 
        System.out.println("\nPengurangan Stock Bunga karena Bunga Mati :");
        System.out.println(NamaBunga(1) + ": " + (stockBunga[3][1]-1));
        System.out.println(NamaBunga(2) + ": " + (stockBunga[3][2]-2));
        System.out.println(NamaBunga(3) + ": " + stockBunga[3][3]);
        System.out.println(NamaBunga(4) + ": " + (stockBunga[3][4]-5));
    }

    public static String NamaBunga(int index) {
        switch (index) {
            case 1:
                return "Aglonema ";
            case 2:
                return "Keladi   ";
            case 3:
                return "Alocasia ";
            case 4:
                return "Mawar    ";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        tampilkanPendapatanPerCabang();
        tampilkanStockPerBungaRoyalGarden4();
        kurangiStockBungaMati();
    }
}
```
Output<br> ![alt text](<img/Screenshot Output fungsi.png>) <br>
#
# Tugas
### Tugas 1
Kode Progam
``` java
import java.util.Scanner;

public class Tugas107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] KOTA = {
            { 'B', 'A', 'N', 'T', 'E', 'N' },
            { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
            { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
            { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
            { 'B', 'O', 'G', 'O', 'R' },
            { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
            { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
            { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
            { 'M', 'A', 'L', 'A', 'N', 'G' },
            { 'T', 'E', 'G', 'A', 'L' }
        };
        
        System.out.print("Masukkan kode plat nomor : ");
        char kode = scanner.next().charAt(0);

        int index = -1;
        
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kode) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            
            System.out.println("Kota yang sesuai dengan kode plat nomor " + kode + " adalah : ");
            for (int i = 0; i < KOTA[index].length; i++) {
                System.out.print(KOTA[index][i] + " "); 
            }
        } else {
            System.out.println("Kode plat nomor tidak valid.");
        }
    }
}
```
Output <br> ![alt text](<img/Screenshot Output Tugas 1.png>)<br>

### Tugas 2
Kode Program
```java
import java.util.Scanner;

public class Tugas207 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Piihan Menu :");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.print("Masukkan Pilihan Anda ");

            System.out.print("(1/2/3) : ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

    public static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (v) : ");
        double jarak = scanner.nextDouble();

        System.out.print("Masukkan waktu (t) : ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.printf("Kecepatan adalah : %.2f km/jm", kecepatan);
    }

    public static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (v) : ");
        double kecepatan = scanner.nextDouble();

        System.out.print("Masukkan waktu (t) : ");
        double waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.printf("Jarak adalah : %.2f km", jarak);
    }

    public static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak (s): ");
        double jarak = scanner.nextDouble();

        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = scanner.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.printf("Waktu adalah : %.2f jam", waktu);
    }
}
```
Output hitung Kecepatan : <br>![alt text](<img/Screenshot Kecepatan.png>)<br>
Output hitung Jarak : <br>![alt text](<img/Screenshot Jarak.png>) <br>
Output hitung Waktu :<br>![alt text](<img/Screenshot Waktu.png>) <br>