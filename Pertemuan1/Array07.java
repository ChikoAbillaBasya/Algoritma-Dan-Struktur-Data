import java.util.Scanner;

public class Array07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] matakuliah = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };

        int i = 0;
        int[] nilai = new int[matakuliah.length];
        double[] sks = {2,2,2,3,2,2,3,2};
        double[] nilaiMK = new double[8];
        String[] nilaiHuruf = new String[8];

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (i = 0; i < matakuliah.length; i++) {
            System.out.print("Masukkan Nilai Angka MK " + matakuliah[i] + " : ");
            nilai[i] = sc.nextInt();

            while (nilaiMK[i] < 0 || nilaiMK[i] > 100) {
                System.out.println("Nilai harus antara 0 - 100");
                nilai[i] = sc.nextInt();
            }
            if (nilai [i] > 80 && nilai[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiMK [i]= 4;
            }
            else if (nilai [i] > 73 && nilai[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiMK [i]= 3.5;
            }
            else if (nilai [i] > 65 && nilai[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiMK [i]= 3;
            }
            else if (nilai [i] > 60 && nilai[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiMK [i]= 2.5;
            }
            else if (nilai [i] > 50 && nilai[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiMK [i]= 2;
            }
            else if (nilai [i] > 39 && nilai[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiMK [i]= 1;
            }
            else {
                nilaiHuruf[i] = "E";
                nilaiMK [i]= 0;
            }
        }

        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");

        System.out.println("MK\t\t\t\t\tNilai Angka\t\tNilai Huruf\t\tBobot Nilai");
        System.out.println("Pancasila\t\t\t\t" + nilai[0] + "\t\t\t" + nilaiHuruf[0] + "\t\t\t" + sks[0]);
        System.out.println(
                "Konsep Teknologi Informasi\t\t" + nilai[1] + "\t\t\t" + nilaiHuruf[1] + "\t\t\t" + sks[1]);
        System.out.println("Critical Thinking dan Problem Solving\t" + nilai[2] + "\t\t\t" + nilaiHuruf[2] + "\t\t\t"
                + sks[2]);
        System.out.println("Matematika Dasar\t\t\t" + nilai[3] + "\t\t\t" + nilaiHuruf[3] + "\t\t\t" + sks[3]);
        System.out.println("Bahasa Inggris\t\t\t\t" + nilai[4] + "\t\t\t" + nilaiHuruf[4] + "\t\t\t" + sks[4]);
        System.out
                .println("Dasar Pemrograman\t\t\t" + nilai[5] + "\t\t\t" + nilaiHuruf[5] + "\t\t\t" + sks[5]);
        System.out.println(
                "Praktikum Dasar Pemrograman\t\t" + nilai[6] + "\t\t\t" + nilaiHuruf[6] + "\t\t\t" + sks[6]);
        System.out.println("Keselamatan dan Kesehatan Kerja\t\t" + nilai[7] + "\t\t\t" + nilaiHuruf[7] + "\t\t\t"
                + sks[7]);
        System.out.println("===============================");

        double totalNilai = 0;
        double totalSKS = 0;
        for (i = 0; i < matakuliah.length; i++) {
            totalNilai += nilaiMK[i] * sks[i];
            totalSKS += sks[i];
        }
        double ipk = totalNilai / totalSKS;
        System.out.printf("IPK : %.2f " , ipk );
    }
}