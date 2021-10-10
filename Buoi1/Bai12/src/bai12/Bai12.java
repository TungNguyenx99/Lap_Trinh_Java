/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.util.Scanner;

/**
 *
 * @author TungNguyen
 */
public class Bai12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int[] soNguyen;
        int max = 0;
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
        {
           if(soNguyen[i] > max)
           max = soNguyen[i];
        }

        System.out.println("Phần tử có giá trị lớn nhất là: " + max);
    }
    
}
