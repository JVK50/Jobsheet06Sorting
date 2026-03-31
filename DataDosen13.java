package Praktikum5;

public class DataDosen13 {
    Dosen13[] dataDosen;
    int idx;

    // Konstruktor
    DataDosen13() {
        dataDosen = new Dosen13[10];
        idx = 0;
    }

    void tambah(Dosen13 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
            System.out.println("Data dosen berhasil ditambahkan!");
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Dosen13 d : dataDosen) {
            if (d != null) {
                d.tampil();
                System.out.println("----------------------------");
            }
        }
    }

    void sortingASC() {
        // Bubble Sort Ascending berdasarkan usia
        for (int i = 0; i < dataDosen.length - 1; i++) {
            for (int j = 1; j < dataDosen.length - i; j++) {
                if (dataDosen[j] != null && dataDosen[j - 1] != null) {
                    if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                        Dosen13 tmp = dataDosen[j];
                        dataDosen[j] = dataDosen[j - 1];
                        dataDosen[j - 1] = tmp;
                    }
                }
            }
        }
    }

    void sortingDSC() {
        // Selection Sort Descending berdasarkan usia
        for (int i = 0; i < dataDosen.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j] != null && dataDosen[idxMax] != null) {
                    if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                        idxMax = j;
                    }
                }
            }
            Dosen13 tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void insertionSort() {
        // Insertion Sort Descending berdasarkan usia
        for (int i = 1; i < dataDosen.length; i++) {
            if (dataDosen[i] != null) {
                Dosen13 temp = dataDosen[i];
                int j = i;
                while (j > 0 && dataDosen[j - 1] != null && dataDosen[j - 1].usia < temp.usia) {
                    dataDosen[j] = dataDosen[j - 1];
                    j--;
                }
                dataDosen[j] = temp;
            }
        }
    }
}