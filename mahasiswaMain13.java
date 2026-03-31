package Praktikum5;

import java.util.Scanner;

public class mahasiswaMain13 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); // Mengkonsumsi newline
        
        mahasiswaBerprestasi13 list = new mahasiswaBerprestasi13(jumlah);
        
        // Input data mahasiswa secara dinamis
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n===== Input Data Mahasiswa " + (i + 1) + " =====");
            
            System.out.print("NIM: ");
            String nim = input.nextLine();
            
            System.out.print("Nama: ");
            String nama = input.nextLine();
            
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            
            System.out.print("IPK: ");
            double ipk = input.nextDouble();
            input.nextLine(); // Mengkonsumsi newline
            
            mahasiswa13 m = new mahasiswa13(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        
        System.out.println("\n\n====== Data mahasiswa sebelum sorting: ======");
        list.tampil();
        
        System.out.println("\n====== Data mahasiswa setelah sorting berdasarkan IPK (DESC): ======");
        list.bubbleSort();
        list.tampil();
        
        input.close();
    }
}
