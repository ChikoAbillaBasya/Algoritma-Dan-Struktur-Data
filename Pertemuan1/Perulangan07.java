import java.util.Scanner;

public class Perulangan07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();
        System.out.println("==============================");
        String digit = nim.substring(nim.length() - 1);
        int digitTerakhir = Integer.parseInt(digit);

        if (digitTerakhir < 10) {
            digitTerakhir += 10;
        }

        System.out.println("n = " + digitTerakhir);
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= digitTerakhir; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                output.append(i).append(" ");
            } else {
                output.append("* ");
            }
        }
        System.out.println(" " + output.toString().trim());
    }
}