package Praktikum16.Kode;

public class Mahasiswa07 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa07(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String toString() {
        return "Mahasiswa{nim='" + nim + "', nama='" + nama + "', notelp='" + notelp + "'}";
    }
}