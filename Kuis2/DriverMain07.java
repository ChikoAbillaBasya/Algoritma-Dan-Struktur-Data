package Kuis2;

import java.util.Scanner;

public class DriverMain07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat array driver
        Driver[] drivers = {
            new Driver(1,"Max Verstappen  - Red Bull Racing                         "),
            new Driver(2,"Sergio Pérez    - Red Bull Racing                         "),
            new Driver(3,"Charles Leclerc - Scuderia Ferrari                        "),
            new Driver(4,"Carlos Sainz    - Scuderia Ferrari                        "),
            new Driver(5,"Fernando Alonso - Alpine F1 Team                          "),
            new Driver(6,"George Russell  - Mercedes-AMG Petronas Formula One Team  "),
            new Driver(7,"Lewis Hamilton  - Mercedes-AMG Petronas Formula One Team  "),
            new Driver(8,"Lance Stroll    - Aston Martin Cognizant Formula One Team "),
            new Driver(9,"Esteban Ocon    - Alpine F1 Team                          "),
            new Driver(10,"Nico Hülkenberg - Aston Martin Cognizant Formula One Team "),
            new Driver(11,"Lando Norris    - McLaren F1 Team                         "),
            new Driver(12,"Valtteri Bottas - Alfa Romeo Racing ORLEN                 "),
            new Driver(13,"Zhou Guanyu     - Alfa Romeo Racing ORLEN                 "),
            new Driver(14,"Yuki Tsunoda    - Scuderia AlphaTauri                     "),
            new Driver(15,"Alexander Albon - Scuderia AlphaTauri                     "),
            new Driver(16,"Logan Sargeant  - Haas F1 Team                            "),
            new Driver(17,"Kevin Magnussen - Haas F1 Team                            "),
            new Driver(18,"Oscar Piastri   - Uralkali Haas F1 Team                   "),
            new Driver(19,"Nyck de Vries   - Mercedes-AMG Petronas Formula One Team  "),
            new Driver(20,"Pierre Gasly    - Scuderia AlphaTauri                     ")
            
        };

        // Mencetak daftar pembalap
        for (int i = 0; i < drivers.length; i++) {
            System.out.println("ID Pembalap : " + (i + 1) +" \t|| " + drivers[i]);
        }

        // Memasukkan jumlah balapan
        System.out.print("Masukkan Jumlah Balapan: ");
        int jumlahBalapan = scanner.nextInt();
        scanner.nextLine(); 

        for (int balapan = 1; balapan <= jumlahBalapan; balapan++) {
            DoubleLinkedList hasilBalapan = new DoubleLinkedList();

            System.out.println("============================================");
            System.out.println("Masukkan Urutan Posisi Pembalap Pada Balapan Ke-" + balapan + ": ");

            // Memasukkan hasil balapan
            for (int i = 0; i < drivers.length; i++) {
                int iddriver = i;  // Secara otomatis menetapkan ID pembalap
                System.out.print("Masukkan Posisi Untuk " + drivers[iddriver].name + ": ");
                int posisi = scanner.nextInt();
                hasilBalapan.addResult(iddriver, posisi);
            }
            
            System.out.println("============================================");
            // Menghitung jumlah point untuk balapan tersebut
            hasilBalapan.calculatePoints(drivers);

            // Mencetak klasemen setelah setiap balapan
            System.out.println("Klasemen Setelah Balapan " + balapan + ": ");
            System.out.println("===============================================================================================================");
            System.out.printf("|| %-12s || %-65s || %-20s ||\n", "ID Pembalap", "Pembalap & TIM", "Point");
            System.out.println("===============================================================================================================");
            for (Driver driver : drivers) {
                System.out.printf("|| %-12d || %-65s || %-20d ||\n", driver.driverId, driver.name, driver.points);
            }
            System.out.println("===============================================================================================================");
        }

        scanner.close();
    }
}
