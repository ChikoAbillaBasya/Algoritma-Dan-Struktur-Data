package Pertemuan3.Kode;
import java.lang.Math;

public class Segitiga07 {
    public int alas;
    public int tinggi;

    public Segitiga07(int a, int t) {
        this.alas = a;
        this.tinggi = t;
    }

    public double hitungLuas() {
        return 0.5 * this.alas * this.tinggi;
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt((this.alas * this.alas) + (this.tinggi * this.tinggi));
        return this.alas + this.tinggi + sisiMiring;
    }
}