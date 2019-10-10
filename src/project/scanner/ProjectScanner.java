/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.scanner;
import java.util.Scanner;
public class ProjectScanner {

    public static void main(String[] args) {
      int sisi ;
      Scanner input = new Scanner (System.in);
      
      System.out.println("Masukkan Nilai untuk sisi :");
      sisi = input.nextInt();
      
      if (sisi > 25) {
       int luas_persegi = sisi*sisi  ;
        System.out.println("Luas persegi :"+luas_persegi);
      }else if (sisi <= 25){
          int luas_kubus = sisi*sisi*sisi;
        System.out.println("Luas kubus :"+luas_kubus);
      }
    }
    
}
