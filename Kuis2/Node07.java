package Kuis2;

class Node07 {
    int driverId;
    int position;
    Node07 prev;
    Node07 next;

    Node07(int driverId, int position) {
        this.driverId = driverId;
        this.position = position;
        this.prev = null;
        this.next = null;
    }
}