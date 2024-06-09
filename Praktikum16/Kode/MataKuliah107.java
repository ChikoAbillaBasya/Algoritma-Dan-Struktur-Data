package Praktikum16.Kode;

public class MataKuliah107 {
    String kode;
    String nama;
    int sks;

    public MataKuliah107(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    @Override
    public String toString() {
        return "MataKuliah{kode='" + kode + "', nama='" + nama + "', sks=" + sks + "}";
    }
}