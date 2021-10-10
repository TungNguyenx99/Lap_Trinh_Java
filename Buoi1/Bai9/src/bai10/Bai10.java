/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author TungNguyen
 */
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
      int Fi;
      System.out.println("Nhập vào số nguyên:");
      Scanner sc = new Scanner(System.in);

      n = sc.nextInt();

      Fibonacci fibonacci = new Fibonacci();
      Fi = fibonacci.CalculateFi(n);

      System.out.println("Fi(" + n + ") = " + Fi);
    }
    
}
