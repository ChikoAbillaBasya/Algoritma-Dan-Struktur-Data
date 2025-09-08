package Pertemuan5.Kode;

public class Car07 {
    String merk;
    String tipe;
    int tahun;
    int topAcceleration;
    int topPower;

    public Car07(String merk, String tipe, int tahun, int topAcceleration, int topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

    int MaxTopAcceleration(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            int leftMax = MaxTopAcceleration(arr, l, mid);
            int rightMax = MaxTopAcceleration(arr, mid + 1, r);
            return Math.max(leftMax, rightMax);
        }
        return 0;
    }

    int MinTopAcceleration(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            int leftMin = MinTopAcceleration(arr, l, mid);
            int rightMin = MinTopAcceleration(arr, mid + 1, r);
            return Math.min(leftMin, rightMin);
        }
        return 0;
    }

    double ratatopPower(double arr[]) {
        double totalPower = 0;
        for (int i = 0; i < arr.length; i++) {
            totalPower += arr[i];
        }
        return totalPower / arr.length;
    }
}