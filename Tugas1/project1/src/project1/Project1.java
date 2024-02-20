/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1;
import java.util.Scanner;


/**
 *
 * @author Nadila Suci P
 */
public class Project1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Masukkan tiga bilangan bulat negatif:");
        // integer input
        int num1 = myObj.nextInt(); 
        int num2 = myObj.nextInt();
        int num3 = myObj.nextInt();
        
        // operasi aritmatika       
        int sum = num1 + num2 + num3;
        int diff = num1 - num2 - num3;
        int product = num1 * num2 * num3;
        
        //output input by user
        System.out.println("Hasil penjumlahan: " + sum);
        System.out.println("Hasil pengurangan: " + diff);
        System.out.println("Hasil perkalian: " + product);
        
        if (num2 != 0 && num3 != 0) {
            double division = (double) num1 / num2 / num3;
            System.out.println("Hasil pembagian: " + division);
        } else {
            System.out.println("Tidak bisa melalukan pembagian karena salah satu bilangan adalah nol");
        }
        
        
        myObj.close();
    }
}
