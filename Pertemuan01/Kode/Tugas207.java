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