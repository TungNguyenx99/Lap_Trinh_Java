/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author TungNguyen
 */
public class Bai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              int n;
      boolean soNguyenTo = false;
      System.out.println("Nhập vào số nguyên:");
      Scanner sc = new Scanner(System.in);

      n = sc.nextInt();


      System.out.print("1 2 ");
      for (int i = 3; i <= n; i++)
      {  

         soNguyenTo = true; 
         for (int j = 2; j <= Math.sqrt(i); j++)
         {
            if (i % j == 0)
               soNguyenTo = false;
         }
         if (soNguyenTo == true)
            System.out.print(i + " ");
      }
    }
    
}
