/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasuklno1sulit.java;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class TUGASUKLNO1SULITJAVA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        double totalNilai = 0;
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }
        double rataRata = totalNilai / jumlahSiswa;
        System.out.printf("\nRata-rata nilai dari %d siswa adalah: %.2f\n", jumlahSiswa, rataRata);
    }
}
