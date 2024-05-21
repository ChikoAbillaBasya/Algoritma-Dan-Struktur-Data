package Pertemuan11.Kode;

public class MahasiswaLinkedList07 {
    Mahasiswa07 head;

    public MahasiswaLinkedList07() {
        this.head = null;
    }

    public void addFirst(int NIM, String Nama) {
        Mahasiswa07 baru = new Mahasiswa07(NIM, Nama);
        baru.next = head;
        head = baru;
    }

    public void addLast(int NIM, String Nama) {
        Mahasiswa07 baru = new Mahasiswa07(NIM, Nama);
        if (head == null) {
            head = baru;
            return;
        }
        Mahasiswa07 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = baru;
    }

    public void insertAfter(int kunci, int NIM, String Nama) {
        Mahasiswa07 baru = new Mahasiswa07(NIM, Nama);
        Mahasiswa07 temp = head;
        while (temp != null && temp.NIM != kunci) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Data dengan NIM " + kunci + " tidak ditemukan.");
            return;
        }
        baru.next = temp.next;
        temp.next = baru;
    }

    public void insertAt(int posisi, int NIM, String Nama) {
        if (posisi < 0) {
            System.out.println("Posisi tidak boleh negatif!");
            return;
        }
        if (posisi == 0) {
            addFirst(NIM, Nama);
            return;
        }
        Mahasiswa07 baru = new Mahasiswa07(NIM, Nama);
        Mahasiswa07 temp = head;
        for (int i = 0; i < posisi - 1; i++) {
            if (temp == null) {
                System.out.println("Posisi melebihi panjang linked list!");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Posisi melebihi panjang linked list!");
            return;
        }
        baru.next = temp.next;
        temp.next = baru;
    }

    public void cetak() {
        Mahasiswa07 temp = head;
        System.out.println("Isi Linked List:");
        while (temp != null) {
            System.out.println("NIM: " + temp.NIM + ", Nama: " + temp.Nama);
            temp = temp.next;
        }
        System.out.println();
    }
}