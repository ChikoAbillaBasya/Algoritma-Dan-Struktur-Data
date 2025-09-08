package Pertemuan3.Kode;
public class InformasiMahasiswa07 {
    
    public String nama, nim, jenisKelamin;
    public double ipk;
  
    public InformasiMahasiswa07(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
  
    public static InformasiMahasiswa07 mahasiswaTerbaik(InformasiMahasiswa07[] mhs) {
        InformasiMahasiswa07 terbaik = mhs[0];
        for (InformasiMahasiswa07 mahasiswa : mhs) {
            if (mahasiswa.ipk > terbaik.ipk) {
            terbaik = mahasiswa;
        }
    }
    
    return terbaik;
    }
  
    public static double hitungRataIPK(InformasiMahasiswa07[] mhs) {
        double totalIPK = 0;
        for (InformasiMahasiswa07 mahasiswa : mhs) {
            totalIPK += mahasiswa.ipk;
        }
        return totalIPK / mhs.length;
    }
} 