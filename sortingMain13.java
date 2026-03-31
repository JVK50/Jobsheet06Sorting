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
    }
}
