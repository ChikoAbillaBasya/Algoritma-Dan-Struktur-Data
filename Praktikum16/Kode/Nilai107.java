package Praktikum16.Kode;

public class Nilai107 {
    Mahasiswa107 mahasiswa;
    MataKuliah107 mataKuliah;
    double nilai;

    public Nilai107(Mahasiswa107 mahasiswa, MataKuliah107 mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    public Mahasiswa107 getMahasiswa() {
        return mahasiswa;
    }

    public MataKuliah107 getMataKuliah() {
        return mataKuliah;
    }

    public double getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return "Nilai{mahasiswa=" + mahasiswa + ", mataKuliah=" + mataKuliah + ", nilai=" + nilai + "}";
    }
}