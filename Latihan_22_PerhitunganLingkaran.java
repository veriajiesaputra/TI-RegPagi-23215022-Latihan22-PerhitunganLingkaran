/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/*Nama :veri ajie saputra
 *KELAS:pbo
 *NIM  :23215017
 * 
 */
import java.util.Scanner;

public class Latihan_22_PerhitunganLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double diameter = 0;
        boolean valid = false;

        // Loop sampai input diameter valid (angka)
        while (!valid) {
            System.out.println("======Perhitungan Lingkaran=====");
            System.out.print("Masukkan nilai diameter lingkaran: ");
            String userInput = input.nextLine();
            
            try {
                diameter = Double.parseDouble(userInput); // Ubah input jadi angka
                if (diameter <= 0) {
                    System.out.println("Nilai Diameter Tidak Sesuai. Harus lebih besar dari 0.\n");
                } else {
                    valid = true; // Input valid, keluar dari loop
                }
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai. Masukkan angka yang benar.\n");
            }
        }

        // Perhitungan
        double jariJari = diameter / 2;
        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = 2 * Math.PI * jariJari;

        // Hasil perhitungan
        System.out.println("======Hasil Perhitungan Lingkaran=====");
        System.out.printf("Jari-jari Lingkaran = %.2f cm\n", jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm\n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm\n", keliling);
        
        input.close();
    }
}

