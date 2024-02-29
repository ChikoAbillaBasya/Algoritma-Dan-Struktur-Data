public class Fungsi07 {
    static int[][] stockBunga = {
            {1, 10, 5, 15, 7},
            {2, 6, 11, 9, 12},
            {3, 2, 10, 10, 5},
            {4, 5, 7, 12, 9}
    };

    static int[] hargaBunga = {75000, 50000, 60000, 10000}; 

    public static void tampilkanPendapatanPerCabang() {
        System.out.println("Pendapatan per Cabang Jika Semua Bunga Terjual :");
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 1; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga[j - 1]; 
            }
            System.out.println("Cabang Toko " + stockBunga[i][0] + ": Rp" + pendapatan);
        }
    }

    public static void tampilkanStockPerBungaRoyalGarden4() {
        System.out.println("\nJumlah Stock Setiap Jenis Bunga pada Cabang Royal Garden 4 :");
        int[] stockRoyalGarden4 = stockBunga[3];
        for (int i = 1; i < stockRoyalGarden4.length; i++) {
            System.out.println(NamaBunga(i) + "  : " + stockRoyalGarden4[i]);
        }
    }

    public static void kurangiStockBungaMati() {
        int[] stockBungaMati = {-1, -2, 0, -5}; 
        System.out.println("\nPengurangan Stock Bunga karena Bunga Mati :");
        System.out.println(NamaBunga(1) + ": " + (stockBunga[3][1]-1));
        System.out.println(NamaBunga(2) + ": " + (stockBunga[3][2]-2));
        System.out.println(NamaBunga(3) + ": " + stockBunga[3][3]);
        System.out.println(NamaBunga(4) + ": " + (stockBunga[3][4]-5));
    }

    public static String NamaBunga(int index) {
        switch (index) {
            case 1:
                return "Aglonema ";
            case 2:
                return "Keladi   ";
            case 3:
                return "Alocasia ";
            case 4:
                return "Mawar    ";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        tampilkanPendapatanPerCabang();
        tampilkanStockPerBungaRoyalGarden4();
        kurangiStockBungaMati();
    }
}
