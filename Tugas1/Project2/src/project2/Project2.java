/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2;

/**
 *
 * @author Nadila Suci P
 */
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang Anda: ");
        int uang = myObj.nextInt();
       
        System.out.print("Apakah pasangan Anda sedang tidak ada jadwal kuliah? (true/false): ");
        boolean tidakAdaKelasKuliah = myObj.nextBoolean();
        
        System.out.println("Apakah pasangan Anda memiliki kendaraan? (true/false):");
        boolean memilikiKendaraan = myObj.nextBoolean();
       
        if (uang > 10000 && !tidakAdaKelasKuliah && memilikiKendaraan) {
            System.out.println("Waktunya keluar beli makan sama ayang!");
        } else {
            System.out.println("Tidak bisa keluar beli makan sama ayang.");
        }
        
        myObj.close();
    }
}