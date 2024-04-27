package Pertemuan10.Kode;

import java.util.Scanner;

public class Queue07 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue07(int n) {
        max = n;
        data = new int[n];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen Terdepan : " + data[front]);
        } else {
            System.out.println("Queue Masih Kosong ");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong ");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");  
            System.out.println("Jumlah Elemen = " + size);
        }
    }

    public void clear() {
        if (isEmpty()) {
            front = rear = -1;
            size = 0; 
            System.out.println("Queue Berhasil Dikosongkan ");
        } else {
            System.out.println("Queue Masih Kosong ");
        }
    }

    void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1);
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    } 

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("----------------------------------");
    }
}