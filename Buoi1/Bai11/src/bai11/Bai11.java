/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.Scanner;

/**
 *
 * @author TungNguyen
 */
public class Bai11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int[] soNguyen;
        float ketQua = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào n:");
        n = sc.nextInt();
        soNguyen = new int[n];
        for (int i = 0; i < n; i++)
        {
           System.out.println("Nhập vào số nguyên:");
           soNguyen[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++)
           ketQua += soNguyen[i];
           ketQua /= n;

        System.out.println("Trung bình cộng của các số nguyên là: " + ketQua);
    }
    
}
