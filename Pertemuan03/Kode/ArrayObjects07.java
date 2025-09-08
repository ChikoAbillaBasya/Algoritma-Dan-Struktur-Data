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