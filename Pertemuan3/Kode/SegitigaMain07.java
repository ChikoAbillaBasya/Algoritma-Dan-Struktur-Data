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