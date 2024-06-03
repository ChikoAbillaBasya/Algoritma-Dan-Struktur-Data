package Pertemuan12.Kode;

public class Film207 {
    int id;
    String judul;
    double rating;
    Film207 prev, next;
    
        public Film207 (int id, String judul, double rating) {
            this.id = id;
            this.judul = judul;
            this.rating = rating;
        }
    }