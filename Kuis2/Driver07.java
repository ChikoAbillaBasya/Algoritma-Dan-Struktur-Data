package Kuis2;

class Driver {
    int driverId; // Menambahkan atribut driverId
    String name;
    int points;

    Driver(int driverId, String name) { // Menambahkan parameter driverId
        this.driverId = driverId;
        this.name = name;
        this.points = 0;
    }

    void addPoints(int points) {
        this.points += points;
    }

    public String toString() {
        return name + " : " + points + " Points";
    }
}