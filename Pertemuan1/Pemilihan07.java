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
