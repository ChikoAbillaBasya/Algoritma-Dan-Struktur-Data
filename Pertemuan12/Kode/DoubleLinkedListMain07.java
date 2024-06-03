package Pertemuan12.Kode;

public class DoubleLinkedListMain07 {
    public static void main(String[] args) throws Exception {

        DoubleLinkedList07 dll = new DoubleLinkedList07();
        System.out.println("===========================");
        dll.print();
        System.out.println("Size  : " + dll.size());
        System.out.println("===========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        System.out.println("===========================");
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        dll.removeLast();
        System.out.println("===========================");
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===========================");
        System.out.println("Data Awal Pada Linked List Adalah : " + dll.getFirst());
        System.out.println("Data Akhir Pada Linked List Adalah : " + dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked List Adalah : " + dll.get(1));
    }
}