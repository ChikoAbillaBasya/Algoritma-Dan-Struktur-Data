package Pertemuan12.Kode;

public class DoubleFilm207 {
 
    private Film207 head, tail;

    public void tambahAwal(int id, String judul, double rating) {
        Film207 newFilm207 = new Film207(id, judul, rating);
        if (head == null) {
            head = tail = newFilm207;
        } else {
            newFilm207.next = head;
            head.prev = newFilm207;
            head = newFilm207;
        }
    }

    public void tambahAkhir(int id, String judul, double rating) {
        Film207 newFilm207 = new Film207(id, judul, rating);
        if (tail == null) {
            head = tail = newFilm207;
        } else {
            tail.next = newFilm207;
            newFilm207.prev = tail;
            tail = newFilm207;
        }
    }

    public void tambahPadaIndex(int index, int id, String judul, double rating) {
        if (index <= 0) {
            tambahAwal(id, judul, rating);
            return;
        }
        
        Film207 newFilm207 = new Film207(id, judul, rating);
        Film207 current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                break;
            }
            current = current.next;
        }

        if (current == null || current.next == null) {
            tambahAkhir(id, judul, rating);
        } else {
            newFilm207.next = current.next;
            newFilm207.prev = current;
            current.next.prev = newFilm207;
            current.next = newFilm207;
        }
    }

    public void hapusPertama() {
        if (head != null) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    }

    public void hapusTerakhir() {
        if (tail != null) {
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    public void hapusPadaIndex(int index) {
        if (index <= 0) {
            hapusPertama();
            return;
        }

        Film207 current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                return;
            }
            current = current.next;
        }

        if (current == null || current.prev == null) {
            hapusTerakhir();
        } else {
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
    }

    public void cetak() {
        Film207 current = head;
        while (current != null) {
            System.out.println("ID: " + current.id + ", Judul: " + current.judul + ", Rating: " + current.rating);
            current = current.next;
        }
    }

    public Film207 cariID(int id) {
        Film207 current = head;
        while (current != null) {
            if (current.id == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void urutRatingDesc() {
        if (head == null) return;
        boolean swapped;
        do {
            swapped = false;
            Film207 current = head;
            while (current.next != null) {
                if (current.rating < current.next.rating) {
                    double tempRating = current.rating;
                    current.rating = current.next.rating;
                    current.next.rating = tempRating;

                    int tempId = current.id;
                    current.id = current.next.id;
                    current.next.id = tempId;

                    String tempJudul = current.judul;
                    current.judul = current.next.judul;
                    current.next.judul = tempJudul;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}