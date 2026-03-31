package Praktikum5;

public class sorting13 {
    
    int[] data;
    int jmlData;

    sorting13 (int Data[], int jmlDat) {
        data = new int[jmlDat];
        jmlData = jmlDat;
        for (int i = 0; i < jmlData; i++) {
            data[i] = Data[i];
        }
    }

    void bubbleSort() {
        int temp=0;
        for (int i = 0; i < jmlData-1; i++) {
            for (int j = 1; j < jmlData-i; j++) {
                if (data[j-1] > data[j]) {
                    temp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    void tampilData() {
        for (int i = 0; i < jmlData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
