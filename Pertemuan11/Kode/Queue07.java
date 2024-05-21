package Pertemuan11.Kode;

class Queue {
    MahasiswaQueue07 front, rear;

    Queue() {
        this.front = this.rear = null;
    }


    void enqueue(int NIM, String nama) {
        MahasiswaQueue07 newNode = new MahasiswaQueue07(NIM, nama);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }


    MahasiswaQueue07 dequeue() {
        if (this.front == null) return null;
        MahasiswaQueue07 temp = this.front;
        this.front = this.front.next;
        if (this.front == null) this.rear = null;
        return temp;
    }

    void printQueue() {
        MahasiswaQueue07 current = front;
        while (current != null) {
            System.out.println("NIM: " + current.NIM + ", Nama: " + current.nama);
            current = current.next;
        }
    }
}