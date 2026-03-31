package Praktikum5;

import java.util.Scanner;

public class MainDosen13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen13 dataDosen = new DataDosen13();
        int pilihan;

        do {
            System.out.println("\n\n===== MENU DOSEN =====");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampil data dosen");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DESC (Selection Sort / Insertion Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n===== TAMBAH DATA DOSEN =====");
                    System.out.print("Kode: ");
                    String kode = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Jenis Kelamin (true=Laki-laki, false=Perempuan): ");
                    Boolean jk = input.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = input.nextInt();
                    input.nextLine();

                    Dosen13 dosen = new Dosen13(kode, nama, jk, usia);
                    dataDosen.tambah(dosen);
                    break;

                case 2:
                    System.out.println("\n===== TAMPIL DATA DOSEN =====");
                    dataDosen.tampil();
                    break;

                case 3:
                    System.out.println("\n===== SORTING ASC (BUBBLE SORT) =====");
                    dataDosen.sortingASC();
                    System.out.println("Data dosen setelah sorting ascending:");
                    dataDosen.tampil();
                    break;

                case 4:
                    System.out.println("\n===== SORTING DESC =====");
                    System.out.println("1. Selection Sort");
                    System.out.println("2. Insertion Sort");
                    System.out.print("Pilih metode: ");
                    int metode = input.nextInt();
                    input.nextLine();

                    if (metode == 1) {
                        dataDosen.sortingDSC();
                        System.out.println("Data dosen setelah sorting descending (Selection Sort):");
                    } else if (metode == 2) {
                        dataDosen.insertionSort();
                        System.out.println("Data dosen setelah sorting descending (Insertion Sort):");
                    } else {
                        System.out.println("Pilihan tidak valid!");
                        break;
                    }
                    dataDosen.tampil();
                    break;

                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        input.close();
    }
}