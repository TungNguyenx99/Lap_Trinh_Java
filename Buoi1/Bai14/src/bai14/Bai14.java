/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

import java.util.Scanner;

/**
 *
 * @author TungNguyen
 */
public class Bai14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int[] soNguyen;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào n:");
        n = sc.nextInt();
        soNguyen = new int[n];
        for (int i = 0; i < n; i++)
        {
           System.out.println("Nhập vào số nguyên:");
           soNguyen[i] = sc.nextInt();
        }

        System.out.println("Mảng trước khi đảo ngược: ");
        for (int i = 0; i < n; i++)
           System.out.print(soNguyen[i] + " ");

        for (int i = 0; i < n/2; i++)
        {
           int empty;
           empty = soNguyen[i];
           soNguyen[i] = soNguyen[n-i-1];
           soNguyen[n-i-1] = empty;
        }

        System.out.println("\nMảng sau khi đảo ngược: ");
        for (int i = 0; i < n; i++)
        System.out.print(soNguyen[i] + " ");
    }
    
}
