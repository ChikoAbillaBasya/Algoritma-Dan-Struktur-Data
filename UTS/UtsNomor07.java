package UTS;

public class UtsNomor07 {
    int[] listNmr;
    int idx;

    void tampilData() {
        for (int i = 0; i < listNmr.length; i++) {
            System.out.print(listNmr[i] + " ");
        }
        System.out.println();
    }

    void selectionSortAscending() {
        for (int i = 0; i < listNmr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < listNmr.length; j++) {
                if (listNmr[j] < listNmr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = listNmr[i];
            listNmr[i] = listNmr[minIndex];
            listNmr[minIndex] = temp;
        }
    }

    void selectionSortDescending() {
        for (int i = 0; i < listNmr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < listNmr.length; j++) {
                if (listNmr[j] > listNmr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = listNmr[i];
            listNmr[i] = listNmr[maxIndex];
            listNmr[maxIndex] = temp;
        }
    }

    public int unordered(int cari) {
        for (int i = 0; i < listNmr.length; i++) {
            if (listNmr[i] == cari) {
                return i;
            }
        }
        return -1; 
    }

    public int FindBinarySearchDescending(int cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (listNmr[mid] == cari) {
                return mid;
            } else if (listNmr[mid] > cari) {
                return FindBinarySearchDescending(cari, mid + 1, right);
            } else {
                return FindBinarySearchDescending(cari, left, mid - 1);
            }
        }
        return -1;
    }
    

    public int FindBinarySearchAscending(int cari, int left, int right) {
        selectionSortAscending();
        if (right >= left) {
            int mid = (left + right) / 2;
            if (listNmr[mid] == cari) {
                return mid;
            } else if (listNmr[mid] < cari) {
                return FindBinarySearchAscending(cari, mid + 1, right);
            } else {
                return FindBinarySearchAscending(cari, left, mid - 1);
            }
        }
        return -1;
    }
}    
