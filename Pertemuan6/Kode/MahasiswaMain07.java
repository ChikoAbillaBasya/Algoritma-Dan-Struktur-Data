package Pertemuan6.Kode;

import java.util.Scanner;

public class MahasiswaMain07 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi07 list = new DaftarMahasiswaBerprestasi07();
        Mahasiswa07 m1 = new Mahasiswa07("Nusa", 2017, 25, 3);
        Mahasiswa07 m2 = new Mahasiswa07("Rara", 2012, 19, 4);
        Mahasiswa07 m3 = new Mahasiswa07("Dompu", 2018, 19, 3.5);
        Mahasiswa07 m4 = new Mahasiswa07("Abdul", 2017, 23, 2);
        Mahasiswa07 m5 = new Mahasiswa07("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting = ");
        list.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();
    }
}