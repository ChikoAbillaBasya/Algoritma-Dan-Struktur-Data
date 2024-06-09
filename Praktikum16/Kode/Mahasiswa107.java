package Praktikum16.Kode;

public class Mahasiswa107 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa107(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNotelp() {
        return notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{nim='" + nim + "', nama='" + nama + "', notelp='" + notelp + "'}";
    }
}