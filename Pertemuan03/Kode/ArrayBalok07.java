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