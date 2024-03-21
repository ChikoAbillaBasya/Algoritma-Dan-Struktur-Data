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