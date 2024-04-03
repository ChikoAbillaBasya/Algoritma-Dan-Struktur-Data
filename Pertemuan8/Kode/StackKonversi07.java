package Pertemuan8.Kode;

public class StackKonversi07 {
    
    int size;
    int[] tumpukanBiner;
    int top;

    public StackKonversi07() {
        this.size = 32; 
        this.tumpukanBiner = new int[size];
        this.top = -1;
    }

    public boolean cekKosong() {
        return top == -1 ; 
    }

    public boolean cekPenuh() {
        return top == size - 1;
    }

    public void tambah(int data) {
        if(cekPenuh()) {
            System.out.println("Stack Penuh");
    } else {
        top++;
        tumpukanBiner[top] = data;
        }
    }   

    public int ambil() {
        if(cekKosong()) {
            System.out.println("Stack Kosong");
            return -1;
    } else {
        int data = tumpukanBiner[top];
        top--;
        return data;
        }
    }
}