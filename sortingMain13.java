package Praktikum5;

public class sortingMain13 {
    public static void main(String[] args) {
        int a[] = {20, 10, 7, 2, 12};
    
        sorting13 dataurut1 = new sorting13(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampilData();
        dataurut1.bubbleSort();
        System.out.println("Data setelah diurutkan dengan bubble sort(ASC)");
        dataurut1.tampilData();
        System.out.println("==============================");

        int b[] = {30, 20, 2, 8, 14};

        sorting13 dataurut2 = new sorting13(b, b.length);

        System.out.println("Data awal 2");
        dataurut2.tampilData();
        dataurut2.selectionSort();
        System.out.println("Data setelah diurutkan dengan selection sort(ASC)");
        dataurut2.tampilData();

        
    }
}
