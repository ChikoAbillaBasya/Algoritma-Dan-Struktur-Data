package Kuis2;

class DoubleLinkedList {
    Node07 head;
    Node07 tail;

    DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    void addResult(int driverId, int position) {
        Node07 newNode = new Node07(driverId, position);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void calculatePoints(Driver[] drivers) {
        Node07 current = head;
        while (current != null) {
            if (current.driverId >= 0 && current.driverId < drivers.length) {
                drivers[current.driverId].addPoints(getPoints(current.position));
            }
            current = current.next;
        }
    }

    int getPoints(int position) {
        switch (position) {
            case  1: return 25;
            case  2: return 18;
            case  3: return 15;
            case  4: return 12;
            case  5: return 10;
            case  6: return 8;
            case  7: return 6;
            case  8: return 4;
            case  9: return 2;
            case 10: return 1;
            default: return 0;
        }
    }
}