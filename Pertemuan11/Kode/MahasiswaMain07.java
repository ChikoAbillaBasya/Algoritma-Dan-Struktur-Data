package Pertemuan11.Kode;

public class MahasiswaMain07 {
    public static void main(String[] args) {
        MahasiswaLinkedList07 linkedList = new MahasiswaLinkedList07();

        linkedList.addFirst(111, "Anton");
        linkedList.addLast(112, "Prita");
        linkedList.insertAfter(112, 113, "Yusuf");
        linkedList.insertAt(3, 114, "Doni");

        linkedList.cetak();
    }
}