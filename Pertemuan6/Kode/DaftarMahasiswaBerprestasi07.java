package Pertemuan6.Kode;


public class DaftarMahasiswaBerprestasi07 {
    Mahasiswa07 listMhs[] = new Mahasiswa07[5];
    int idx;

    void tambah(Mahasiswa07 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampil();
            System.out.println("-----------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = i + 1; j < idx; j++) {
                if (listMhs[i].ipk < listMhs[j].ipk) {
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa07 tmp = listMhs[i];
                    listMhs[i] = listMhs[j];
                    listMhs[j] = tmp;
                }
            }
        }
    }
}