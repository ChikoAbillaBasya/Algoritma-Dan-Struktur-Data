import java.util.HashMap;

public class Fungsi07 {
    
    static int[][] stockBunga = {
            {1, 10, 5, 15, 7},
            {2, 6, 11, 9, 12},
            {3, 2, 10, 10, 5},
            {4, 5, 7, 12, 9}
    };

    static HashMap<String, Integer> hargaBunga = new HashMap<>();
    static {
        hargaBunga.put("Aglonema", 75000);
        hargaBunga.put("Keladi", 50000);
        hargaBunga.put("Alocasia", 60000);
        hargaBunga.put("Mawar", 10000);
    }

    public static void tampilkanPendapatanPerCabang() {
        System.out.println("Pendapatan per Cabang Jika Semua Bunga Terjual :");
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 1; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga.get(NamaBunga(j));
            }
            System.out.println("Cabang Toko " + stockBunga[i][0] + ": Rp" + pendapatan);
        }
    }

    public static String NamaBunga(int index) {
        switch (index) {
            case 1:
                return "Aglonema";
            case 2:
                return "Keladi";
            case 3:
                return "Alocasia";
            case 4:
                return "Mawar";
            default:
                return "";
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
        for (int i = 0; i < stockBungaMati.length; i++) {
            stockBunga[3][i + 1] += stockBungaMati[i]; 
            System.out.println(NamaBunga(i + 1) + " : " + stockBunga[3][i + 1]);
        }
    }

    public static void main(String[] args) {
        tampilkanPendapatanPerCabang();
        tampilkanStockPerBungaRoyalGarden4();
        kurangiStockBungaMati();
    }
}
